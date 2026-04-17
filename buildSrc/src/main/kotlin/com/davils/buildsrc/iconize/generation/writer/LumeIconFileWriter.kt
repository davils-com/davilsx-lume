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
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.STRING

/**
 * Generates the shared `LumeIcon` composable that backs every icon in a pack.
 *
 * The resulting `LumeIcon.kt` file is self-contained and does not depend on
 * Material. It renders an [androidx.compose.foundation.Image] tinted with the
 * supplied color unless [androidx.compose.ui.graphics.Color.Unspecified] is used.
 *
 * @since 1.0.0
 */
internal object LumeIconFileWriter : FileWriter {
    /**
     * @param context The [GenerationContext] with all input data.
     * @return The constant file name `LumeIcon`.
     * @since 1.0.0
     */
    override fun fileName(context: GenerationContext): String = "LumeIcon"

    /**
     * @param context The [GenerationContext] with all input data.
     * @return The shared [GenerationContext.lumeIconPackage] used across packs.
     * @since 1.0.0
     */
    override fun targetPackage(context: GenerationContext): String = context.lumeIconPackage

    /**
     * @return `false` because `LumeIcon` is shared across icon packs and must be generated only once.
     * @since 1.0.0
     */
    override fun overwriteIfExists(): Boolean = false

    /**
     * @param context The [GenerationContext] with all input data.
     * @return The [FileSpec] describing `LumeIcon.kt`.
     * @since 1.0.0
     */
    override fun buildFileSpec(context: GenerationContext): FileSpec {
        val nullableString = STRING.copy(nullable = true)

        val function = FunSpec.builder("LumeIcon")
            .addModifiers(KModifier.PUBLIC)
            .addAnnotation(ComposeClassNames.COMPOSABLE)
            .also { builder ->
                if (context.kDocEnabled) builder.addKdoc(lumeIconKDoc(context))
            }
            .addParameter("painter", ComposeClassNames.PAINTER)
            .addParameter("contentDescription", nullableString)
            .addParameter(
                ParameterSpec.builder("modifier", ComposeClassNames.MODIFIER)
                    .defaultValue("%T", ComposeClassNames.MODIFIER)
                    .build()
            )
            .addParameter(
                ParameterSpec.builder("tint", ComposeClassNames.COLOR)
                    .defaultValue("%T.Black", ComposeClassNames.COLOR)
                    .build()
            )
            .addCode(lumeIconBody())
            .build()

        return FileSpec.builder(context.lumeIconPackage, fileName(context))
            .addFunction(function)
            .build()
    }

    /**
     * Builds the body of the generated `LumeIcon` composable.
     *
     * The emitted code renders an `Image` with the passed-in painter, sizes it
     * to `24.dp` and applies a `ColorFilter.tint` when the caller did not opt
     * out via `Color.Unspecified`.
     *
     * @return The [CodeBlock] representing the composable body.
     * @since 1.0.0
     */
    private fun lumeIconBody(): CodeBlock = CodeBlock.builder()
        .add("%M(\n", ComposeClassNames.IMAGE)
        .indent()
        .add("painter = painter,\n")
        .add("contentDescription = contentDescription,\n")
        .add("modifier = modifier.%M(24.%M),\n", ComposeClassNames.MODIFIER_SIZE, ComposeClassNames.DP)
        .add(
            "colorFilter = if (tint != %T.Unspecified) %T.tint(tint) else null,\n",
            ComposeClassNames.COLOR,
            ComposeClassNames.COLOR_FILTER,
        )
        .unindent()
        .add(")\n")
        .build()

    /**
     * Renders the KDoc block attached to the generated `LumeIcon` composable.
     *
     * @param context The [GenerationContext] providing pack name, `@since` and related metadata.
     * @return The [CodeBlock] representing the KDoc content (without the enclosing `/** */`).
     * @since 1.0.0
     */
    private fun lumeIconKDoc(context: GenerationContext): CodeBlock = CodeBlock.builder()
        .add("Renders an icon from the `%L` pack using a custom [%T].\n\n", context.packClassPrefix, ComposeClassNames.PAINTER)
        .add("The icon is drawn at a fixed 24.dp size and tinted with [tint] unless\n")
        .add("[%T.Unspecified] is provided, in which case the original colors are preserved.\n\n", ComposeClassNames.COLOR)
        .add("@param painter The [%T] that draws the icon.\n", ComposeClassNames.PAINTER)
        .add("@param contentDescription Accessibility description. May be `null` for decorative icons.\n")
        .add("@param modifier The [%T] applied to the icon.\n", ComposeClassNames.MODIFIER)
        .add("@param tint The tint [%T]. Use [%T.Unspecified] to disable tinting.\n", ComposeClassNames.COLOR, ComposeClassNames.COLOR)
        .add("@since %L\n", context.kDocSince)
        .build()
}
