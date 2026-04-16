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

package com.davils.buildsrc.icon.task

import com.davils.buildsrc.icon.codegen.ComposablesFileGenerator
import com.davils.buildsrc.icon.codegen.IconGeneratorConfig
import com.davils.buildsrc.icon.codegen.PaintersFileGenerator
import com.davils.buildsrc.icon.domain.IconKDocResolver
import com.davils.buildsrc.icon.domain.IconNameMapper
import com.davils.buildsrc.icon.domain.IconSpec
import com.davils.buildsrc.icon.domain.KDocConfig
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction

public abstract class GenerateIconsTask : DefaultTask() {
    @get:Input
    public abstract val copyright: Property<String>

    @get:Input
    public abstract val packageName: Property<String>

    @get:Input
    public abstract val resourceClassName: Property<String>

    @get:Input
    public abstract val resourcePackageName: Property<String>

    @get:Input
    public abstract val painterObjectName: Property<String>

    @get:Input
    public abstract val kDocEnabled: Property<Boolean>

    @get:Input
    public abstract val kDocUrlPattern: Property<String>

    @get:Input
    public abstract val kDocSince: Property<String>

    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val inputDirectory: DirectoryProperty

    @get:OutputDirectory
    public abstract val outputDirectory: DirectoryProperty

    private val nameMapper: IconNameMapper = IconNameMapper()
    private val paintersGenerator: PaintersFileGenerator = PaintersFileGenerator()
    private val composablesGenerator: ComposablesFileGenerator = ComposablesFileGenerator()

    @TaskAction
    public fun generate() {
        val inputDir = inputDirectory.get().asFile
        val outputDir = outputDirectory.get().asFile

        val specs = inputDir
            .listFiles()
            .orEmpty()
            .asSequence()
            .filter { file -> file.isFile && file.extension.equals("xml", ignoreCase = true) }
            .map { file -> nameMapper.map(file.nameWithoutExtension) }
            .sortedBy { spec -> spec.fileNameWithoutExtension }
            .toList()

        validateNoNameCollisions(specs)

        val config = IconGeneratorConfig(
            copyright = copyright.get(),
            packageName = packageName.get(),
            resourceClassName = resourceClassName.get(),
            resourcePackageName = resourcePackageName.get(),
            painterObjectName = painterObjectName.get(),
        )
        val kDocResolver = IconKDocResolver(
            config = KDocConfig(
                enabled = kDocEnabled.get(),
                docUrlPattern = kDocUrlPattern.get(),
                since = kDocSince.get(),
            ),
        )

        paintersGenerator.generate(
            specs = specs,
            config = config,
            outputDirectory = outputDir,
            kDocResolver = kDocResolver,
        )
        composablesGenerator.generate(
            specs = specs,
            config = config,
            outputDirectory = outputDir,
            kDocResolver = kDocResolver,
        )
    }

    private fun validateNoNameCollisions(specs: List<IconSpec>) {
        failOnCollision(specs, selector = IconSpec::resourceName, label = "resource name")
        failOnCollision(specs, selector = IconSpec::painterFunctionName, label = "painter function")
        failOnCollision(specs, selector = IconSpec::composableFunctionName, label = "icon composable")
    }

    private fun failOnCollision(
        specs: List<IconSpec>,
        selector: (IconSpec) -> String,
        label: String,
    ) {
        val duplicateName = specs
            .groupBy(selector)
            .entries
            .firstOrNull { (_, group) -> group.size > 1 }
            ?.key
            ?: return

        val duplicates = specs.filter { selector(it) == duplicateName }
            .joinToString(separator = ", ") { it.fileNameWithoutExtension }

        error("Name collision for $label '$duplicateName' generated from files: $duplicates")
    }
}


