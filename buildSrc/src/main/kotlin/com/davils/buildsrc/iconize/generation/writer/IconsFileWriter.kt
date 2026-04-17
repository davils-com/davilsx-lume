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
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.STRING

/**
 * Generates the `<Pack>Icons.kt` file containing one composable per icon.
 *
 * Each composable delegates to the pack's `LumeIcon` composable using the
 * matching painter from the generated `<Pack>Painter` object.
 *
 * @since 1.0.0
 */
internal object IconsFileWriter : FileWriter {
    /**
     * @param context The [GenerationContext] with all input data.
     * @return The pack-specific file name (e.g. `LucideIcons`).
     * @since 1.0.0
     */
    override fun fileName(context: GenerationContext): String = "${context.packClassPrefix}Icons"

    /**
     * @param context The [GenerationContext] with all input data.
     * @return The [FileSpec] describing the generated `<Pack>Icons.kt`.
     * @since 1.0.0
     */
    override fun buildFileSpec(context: GenerationContext): FileSpec {
        val painterClass = ClassName(context.targetPackage, context.painterObjectName)
        val lumeIcon = MemberName(context.lumeIconPackage, "LumeIcon")

        val builder = FileSpec.builder(context.targetPackage, fileName(context))
        context.icons.forEach { icon ->
            builder.addFunction(iconComposable(icon, context, painterClass, lumeIcon))
        }
        return builder.build()
    }

    /**
     * Builds the composable function generated for a single [icon].
     *
     * @param icon The icon descriptor the composable is generated for.
     * @param context The active [GenerationContext] providing naming and KDoc options.
     * @param painterClass Reference to the pack's painter object.
     * @param lumeIcon Reference to the shared `LumeIcon` composable.
     * @return The [FunSpec] describing the generated composable.
     * @since 1.0.0
     */
    private fun iconComposable(
        icon: IconDescriptor,
        context: GenerationContext,
        painterClass: ClassName,
        lumeIcon: MemberName,
    ): FunSpec {
        val nullableString = STRING.copy(nullable = true)
        val composableName = "${context.packClassPrefix}${icon.pascalName}"

        return FunSpec.builder(composableName)
            .addModifiers(KModifier.PUBLIC)
            .addAnnotation(ComposeClassNames.COMPOSABLE)
            .also { builder -> if (context.kDocEnabled) builder.addKdoc(iconKDoc(icon, context)) }
            .addParameter(
                ParameterSpec.builder("modifier", ComposeClassNames.MODIFIER)
                    .defaultValue("%T", ComposeClassNames.MODIFIER)
                    .build()
            )
            .addParameter(
                ParameterSpec.builder("color", ComposeClassNames.COLOR)
                    .defaultValue("%T.Black", ComposeClassNames.COLOR)
                    .build()
            )
            .addParameter(
                ParameterSpec.builder("contentDescription", nullableString)
                    .defaultValue("null")
                    .build()
            )
            .addCode(iconBody(icon, painterClass, lumeIcon))
            .build()
    }

    /**
     * Builds the body of a generated icon composable.
     *
     * The emitted code delegates to the shared `LumeIcon` composable using the
     * painter obtained from the pack's painter object.
     *
     * @param icon The icon descriptor the composable is generated for.
     * @param painterClass Reference to the pack's painter object.
     * @param lumeIcon Reference to the shared `LumeIcon` composable.
     * @return The [CodeBlock] representing the composable body.
     * @since 1.0.0
     */
    private fun iconBody(icon: IconDescriptor, painterClass: ClassName, lumeIcon: MemberName): CodeBlock = CodeBlock.builder()
        .add("%M(\n", lumeIcon)
        .indent()
        .add("painter = %T.%N(),\n", painterClass, icon.camelName)
        .add("contentDescription = contentDescription,\n")
        .add("modifier = modifier,\n")
        .add("tint = color,\n")
        .unindent()
        .add(")\n")
        .build()

    /**
     * Builds the KDoc block attached to a generated icon composable.
     *
     * Inlines the optional upstream icon documentation URL when
     * [GenerationContext.kDocUrlPattern] is configured.
     *
     * @param icon The icon descriptor the composable is generated for.
     * @param context The active [GenerationContext] providing KDoc options.
     * @return The [CodeBlock] representing the KDoc content.
     * @since 1.0.0
     */
    private fun iconKDoc(icon: IconDescriptor, context: GenerationContext): CodeBlock {
        val builder = CodeBlock.builder()
            .add("Composable for the `%L` icon from the `%L` pack.\n\n", icon.pascalName, context.packClassPrefix)
        context.kDocUrlPattern?.let { pattern ->
            builder.add(
                "For more information see the official icon documentation: %L\n\n",
                pattern.replace("%{icon}", icon.kebabName),
            )
        }
        builder.add("@param modifier The [%T] applied to the icon.\n", ComposeClassNames.MODIFIER)
        builder.add("@param color The tint [%T] of the icon.\n", ComposeClassNames.COLOR)
        builder.add("@param contentDescription Accessibility description. May be `null` for decorative icons.\n")
        builder.add("@since %L\n", context.kDocSince)
        return builder.build()
    }
}
