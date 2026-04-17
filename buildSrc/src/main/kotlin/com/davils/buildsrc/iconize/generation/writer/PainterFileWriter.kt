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

package com.davils.buildsrc.iconize.generation.writer

import com.davils.buildsrc.iconize.generation.ComposeClassNames
import com.davils.buildsrc.iconize.generation.GenerationContext
import com.davils.buildsrc.iconize.generation.IconDescriptor
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec

/**
 * Generates the `<Pack>Painter` object containing one composable painter per icon.
 *
 * Each generated function returns a [androidx.compose.ui.graphics.painter.Painter]
 * backed by the corresponding Compose resource.
 *
 * @since 1.0.0
 */
internal object PainterFileWriter : FileWriter {
    /**
     * @param context The [GenerationContext] with all input data.
     * @return The pack-specific painter object name (e.g. `LucidePainter`).
     * @since 1.0.0
     */
    override fun fileName(context: GenerationContext): String = context.painterObjectName

    /**
     * @param context The [GenerationContext] with all input data.
     * @return The [FileSpec] describing the generated `<Pack>Painter.kt`.
     * @since 1.0.0
     */
    override fun buildFileSpec(context: GenerationContext): FileSpec {
        val resourcesClass = ClassName(context.resourcesPackage, context.resourcesClassName)
        val painterObject = TypeSpec.objectBuilder(context.painterObjectName)
            .addModifiers(KModifier.PUBLIC)
            .also { builder -> if (context.kDocEnabled) builder.addKdoc(objectKDoc(context)) }
            .apply {
                context.icons.forEach { icon -> addFunction(painterFunction(icon, context, resourcesClass)) }
            }
            .build()

        val fileBuilder = FileSpec.builder(context.targetPackage, fileName(context))
            .addType(painterObject)
        context.icons.forEach { icon ->
            fileBuilder.addImport(context.resourcesPackage, icon.resourceName)
        }
        return fileBuilder.build()
    }

    /**
     * Builds a single composable painter function for the given [icon].
     *
     * @param icon The icon descriptor the painter is generated for.
     * @param context The active [GenerationContext] providing KDoc options.
     * @param resourcesClass The fully-qualified Compose resources class reference.
     * @return The [FunSpec] describing the generated painter function.
     * @since 1.0.0
     */
    private fun painterFunction(
        icon: IconDescriptor,
        context: GenerationContext,
        resourcesClass: ClassName,
    ): FunSpec = FunSpec.builder(icon.camelName)
        .addModifiers(KModifier.PUBLIC)
        .addAnnotation(ComposeClassNames.COMPOSABLE)
        .returns(ComposeClassNames.PAINTER)
        .also { builder -> if (context.kDocEnabled) builder.addKdoc(painterKDoc(icon, context)) }
        .addStatement(
            "return %M(%T.drawable.%N)",
            ComposeClassNames.PAINTER_RESOURCE,
            resourcesClass,
            icon.resourceName,
        )
        .build()

    /**
     * Builds the KDoc block attached to the generated `<Pack>Painter` object.
     *
     * @param context The [GenerationContext] providing pack and version metadata.
     * @return The [CodeBlock] representing the KDoc content.
     * @since 1.0.0
     */
    private fun objectKDoc(context: GenerationContext): CodeBlock = CodeBlock.builder()
        .add("Painter provider for the `%L` icon pack.\n\n", context.packClassPrefix)
        .add("Exposes a dedicated composable function per icon that returns a\n")
        .add("[%T] backed by the corresponding Compose resource.\n\n", ComposeClassNames.PAINTER)
        .add("@since %L\n", context.kDocSince)
        .build()

    /**
     * Builds the KDoc block attached to a single generated painter function.
     *
     * Inlines the optional upstream icon documentation URL when
     * [GenerationContext.kDocUrlPattern] is configured.
     *
     * @param icon The icon descriptor the painter is generated for.
     * @param context The active [GenerationContext] providing KDoc options.
     * @return The [CodeBlock] representing the KDoc content.
     * @since 1.0.0
     */
    private fun painterKDoc(icon: IconDescriptor, context: GenerationContext): CodeBlock {
        val builder = CodeBlock.builder()
            .add("Returns a [%T] for the `%L` icon.\n\n", ComposeClassNames.PAINTER, icon.resourceName)
        context.kDocUrlPattern?.let { pattern ->
            builder.add(
                "For more information see the official icon documentation: %L\n\n",
                pattern.replace("%{icon}", icon.kebabName),
            )
        }
        builder.add("@return The [%T] for the icon.\n", ComposeClassNames.PAINTER)
        builder.add("@since %L\n", context.kDocSince)
        return builder.build()
    }
}
