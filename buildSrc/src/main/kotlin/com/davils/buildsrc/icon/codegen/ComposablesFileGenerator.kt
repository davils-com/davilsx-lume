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

package com.davils.buildsrc.icon.codegen

import com.davils.buildsrc.icon.domain.GeneratedSymbolType
import com.davils.buildsrc.icon.domain.IconKDocResolver
import com.davils.buildsrc.icon.domain.IconSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.buildCodeBlock
import java.io.File

private val COMPOSABLE_CLASS_NAME: ClassName = ClassName("androidx.compose.runtime", "Composable")
private val COLOR_CLASS_NAME: ClassName = ClassName("androidx.compose.ui.graphics", "Color")
private val MODIFIER_CLASS_NAME: ClassName = ClassName("androidx.compose.ui", "Modifier")
private val ICON_MEMBER: MemberName = MemberName("androidx.compose.material3", "Icon")

internal class ComposablesFileGenerator {
    fun generate(
        specs: List<IconSpec>,
        config: IconGeneratorConfig,
        outputDirectory: File,
        kDocResolver: IconKDocResolver,
    ) {
        val fileSpec = FileSpec.builder(config.packageName, "Icons")
            .addFileComment("%L", config.copyright)
            .addFunctions(specs.map { spec -> buildComposable(spec, config, kDocResolver) })
            .build()

        fileSpec.writeTo(outputDirectory)
    }

    private fun buildComposable(
        spec: IconSpec,
        config: IconGeneratorConfig,
        kDocResolver: IconKDocResolver,
    ): FunSpec {
        return FunSpec.builder(spec.composableFunctionName)
            .addModifiers(KModifier.PUBLIC)
            .addAnnotation(COMPOSABLE_CLASS_NAME)
            .addKdoc("%L", kDocResolver.resolve(spec, GeneratedSymbolType.ICON))
            .addParameter(
                ParameterSpec.builder("modifier", MODIFIER_CLASS_NAME)
                    .defaultValue("%T", MODIFIER_CLASS_NAME)
                    .build(),
            )
            .addParameter(
                ParameterSpec.builder("color", COLOR_CLASS_NAME)
                    .defaultValue("%T.Black", COLOR_CLASS_NAME)
                    .build(),
            )
            .addParameter(
                ParameterSpec.builder("contentDescription", STRING.copy(nullable = true))
                    .defaultValue("null")
                    .build(),
            )
            .addCode(
                buildCodeBlock {
                    add("%M(\n", ICON_MEMBER)
                    indent()
                    add("painter = %L.%L(),\n", config.painterObjectName, spec.painterFunctionName)
                    add("contentDescription = contentDescription,\n")
                    add("modifier = modifier,\n")
                    add("tint = color,\n")
                    unindent()
                    add(")\n")
                },
            )
            .build()
    }
}


