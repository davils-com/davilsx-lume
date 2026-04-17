/*
 * Copyright 2026 Davils
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.davils.buildsrc.iconize.generation

import com.davils.buildsrc.iconize.extension.IconizeExtension
import com.davils.buildsrc.iconize.extension.pack.IconizePackExtension
import com.davils.buildsrc.iconize.generation.writer.FileWriter
import com.davils.buildsrc.iconize.generation.writer.IconsFileWriter
import com.davils.buildsrc.iconize.generation.writer.LumeIconFileWriter
import com.davils.buildsrc.iconize.generation.writer.PainterFileWriter
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

/**
 * Gradle task that drives the code generation for a single icon pack.
 *
 * The task scans the configured icon directory and delegates generation of
 * each output file to a dedicated [com.davils.buildsrc.iconize.generation.writer.FileWriter]. Three files are produced per pack:
 *
 *  - `LumeIcon.kt` — shared composable rendering painters with a tint.
 *  - `<Pack>Painter.kt` — object exposing one composable painter per icon.
 *  - `<Pack>Icons.kt` — one composable per icon backed by `LumeIcon`.
 *
 * @since 1.0.0
 */
public abstract class IconizeIconGenerationTask : DefaultTask() {
    /**
     * The name of the icon pack being generated (e.g. `lucide`).
     *
     * @since 1.0.0
     */
    @get:Input
    public abstract val iconPackName: Property<String>

    /**
     * The base package of the generated code.
     *
     * @since 1.0.0
     */
    @get:Input
    public abstract val basePackage: Property<String>

    /**
     * The package of the generated Compose resources class.
     *
     * @since 1.0.0
     */
    @get:Input
    public abstract val resourcesPackage: Property<String>

    /**
     * The simple name of the generated Compose resources class.
     *
     * @since 1.0.0
     */
    @get:Input
    public abstract val resourcesClassName: Property<String>

    /**
     * The directory containing the raw icon resources.
     *
     * @since 1.0.0
     */
    @get:InputDirectory
    public abstract val iconDirectory: DirectoryProperty

    /**
     * The root directory for generated Kotlin sources.
     *
     * @since 1.0.0
     */
    @get:OutputDirectory
    public abstract val sourceDirectory: DirectoryProperty

    /**
     * File extensions considered as icon sources.
     *
     * @since 1.0.0
     */
    @get:Input
    public abstract val fileExtensions: ListProperty<String>

    /**
     * Optional copyright header placed at the top of every generated file.
     *
     * @since 1.0.0
     */
    @get:Input
    @get:Optional
    public abstract val copyright: Property<String>

    /**
     * Whether KDoc should be rendered for every generated declaration.
     *
     * @since 1.0.0
     */
    @get:Input
    public abstract val kDocEnabled: Property<Boolean>

    /**
     * Optional URL pattern used in KDoc links.
     *
     * The placeholder `%{icon}` is replaced with the kebab-case icon name.
     *
     * @since 1.0.0
     */
    @get:Input
    @get:Optional
    public abstract val kDocUrlPattern: Property<String>

    /**
     * The `@since` version rendered in every generated KDoc block.
     *
     * @since 1.0.0
     */
    @get:Input
    @get:Optional
    public abstract val kDocSince: Property<String>

    /**
     * Executes the generation.
     *
     * Resolves the [GenerationContext], wipes any previously generated files
     * and writes fresh sources through the configured [com.davils.buildsrc.iconize.generation.writer.FileWriter]s.
     *
     * @since 1.0.0
     */
    @TaskAction
    public fun generate() {
        val context = buildContext() ?: return

        writers.forEach { writer -> writer.cleanPrevious(context) }
        writers.forEach { writer -> writer.write(context) }

        logger.lifecycle("Generated ${context.icons.size} icons for pack '${context.packName}' into ${context.sourceRoot}")
    }

    /**
     * Builds the immutable [GenerationContext] that backs every writer invocation.
     *
     * Returns `null` when the icon directory exists but contains no icons for
     * the current pack, allowing the task to short-circuit without error.
     *
     * @return The built [GenerationContext] or `null` if no icons were found.
     * @since 1.0.0
     */
    private fun buildContext(): GenerationContext? {
        val packName = iconPackName.get()
        val base = basePackage.get()
        val sourceRoot = sourceDirectory.get().asFile.apply { mkdirs() }

        val icons = collectIcons()
        if (icons.isEmpty()) {
            logger.lifecycle("No icons found for pack '$packName' in ${iconDirectory.get().asFile}")
            return null
        }

        return GenerationContext(
            packName = packName,
            packClassPrefix = packName.toPascalCase(),
            targetPackage = "$base.$packName",
            lumeIconPackage = base,
            resourcesPackage = resourcesPackage.get(),
            resourcesClassName = resourcesClassName.get(),
            sourceRoot = sourceRoot,
            copyright = copyright.orNull,
            kDocEnabled = kDocEnabled.getOrElse(false),
            kDocUrlPattern = kDocUrlPattern.orNull,
            kDocSince = kDocSince.getOrElse("1.0.0"),
            icons = icons,
        )
    }

    /**
     * Scans [iconDirectory] for files belonging to the current pack.
     *
     * Files are kept if their extension is in [fileExtensions] and their
     * (sanitized) name starts with `<packName>_`. The resulting descriptors
     * are sorted by their [IconDescriptor.resourceName] for deterministic output.
     *
     * @return The sorted list of icons belonging to the current pack.
     * @since 1.0.0
     */
    private fun collectIcons(): List<IconDescriptor> {
        val dir = iconDirectory.get().asFile
        if (!dir.isDirectory) return emptyList()

        val packName = iconPackName.get()
        val prefix = "${packName}_"
        val extensions = fileExtensions.get().map { it.lowercase() }.toSet()
        return dir.listFiles()
            ?.asSequence()
            ?.filter { it.isFile && it.extension.lowercase() in extensions }
            ?.filter { it.nameWithoutExtension.replace('-', '_').startsWith(prefix) }
            ?.map { IconDescriptor.from(it, packName) }
            ?.sortedBy { it.resourceName }
            ?.toList()
            .orEmpty()
    }

    /**
     * Wires this task with the values from [extension] and [pack].
     *
     * @param extension The owning [IconizeExtension].
     * @param pack The [IconizePackExtension] describing the pack to generate.
     * @since 1.0.0
     */
    public fun configureFrom(extension: IconizeExtension, pack: IconizePackExtension) {
        iconPackName.set(pack.name)
        basePackage.set(extension.basePackage)
        resourcesPackage.set(extension.resources.packageOfResClass)
        resourcesClassName.set(extension.resources.nameOfResClass)
        iconDirectory.set(extension.iconDirectory)
        sourceDirectory.set(extension.sourceDirectory)
        fileExtensions.set(pack.fileExtensions)
        copyright.set(pack.copyright)
        kDocEnabled.set(pack.kDoc.enabled)
        kDocUrlPattern.set(pack.kDoc.urlPattern)
        kDocSince.set(pack.kDoc.since)
    }

    /**
     * Companion holding the immutable list of [FileWriter]s executed by the task.
     *
     * @since 1.0.0
     */
    private companion object {
        /**
         * Ordered list of [FileWriter]s driving the generation.
         *
         * `LumeIconFileWriter` must run first because other writers depend
         * on the class reference it produces.
         *
         * @since 1.0.0
         */
        val writers: List<FileWriter> = listOf(
            LumeIconFileWriter,
            PainterFileWriter,
            IconsFileWriter,
        )
    }
}
