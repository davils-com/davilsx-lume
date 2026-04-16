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
import com.squareup.kotlinpoet.TypeSpec
import java.io.File

private val COMPOSABLE_CLASS_NAME: ClassName = ClassName("androidx.compose.runtime", "Composable")
private val PAINTER_CLASS_NAME: ClassName = ClassName("androidx.compose.ui.graphics.painter", "Painter")
private val PAINTER_RESOURCE_MEMBER: MemberName = MemberName("org.jetbrains.compose.resources", "painterResource")
private val KOTLIN_KEYWORDS: Set<String> = setOf(
    "as", "break", "class", "continue", "do", "else", "false", "for", "fun", "if", "in", "interface",
    "is", "null", "object", "package", "return", "super", "this", "throw", "true", "try", "typealias",
    "typeof", "val", "var", "when", "while",
)

internal class PaintersFileGenerator {
    fun generate(
        specs: List<IconSpec>,
        config: IconGeneratorConfig,
        outputDirectory: File,
        kDocResolver: IconKDocResolver,
    ) {
        val resourceClass = ClassName(config.resourcePackageName, config.resourceClassName)

        val painterObject = TypeSpec.objectBuilder(config.painterObjectName)
            .addModifiers(KModifier.PUBLIC)
            .addFunctions(specs.map { spec ->
                buildPainterFunction(
                    spec = spec,
                    resourceClass = resourceClass,
                    kDocResolver = kDocResolver,
                )
            })
            .build()

        val fileBuilder = FileSpec.builder(config.packageName, "Painters")
            .addFileComment("%L", config.copyright)
            .addImport(config.resourcePackageName, config.resourceClassName)
            .addType(painterObject)

        specs.forEach { spec ->
            fileBuilder.addImport(config.resourcePackageName, spec.resourceName.escapeImportName())
        }

        fileBuilder
            .build()
            .writeTo(outputDirectory)
    }

    private fun buildPainterFunction(
        spec: IconSpec,
        resourceClass: ClassName,
        kDocResolver: IconKDocResolver,
    ): FunSpec {
        val escapedResourceName = spec.resourceName.escapeMemberName()

        return FunSpec.builder(spec.painterFunctionName)
            .addModifiers(KModifier.PUBLIC)
            .addAnnotation(COMPOSABLE_CLASS_NAME)
            .returns(PAINTER_CLASS_NAME)
            .addKdoc("%L", kDocResolver.resolve(spec, GeneratedSymbolType.PAINTER))
            .addStatement(
                "return %M(%L.drawable.%L)",
                PAINTER_RESOURCE_MEMBER,
                resourceClass.simpleName,
                escapedResourceName,
            )
            .build()
    }
}

private fun String.escapeMemberName(): String = if (this in KOTLIN_KEYWORDS) "`$this`" else this

private fun String.escapeImportName(): String = if (this in KOTLIN_KEYWORDS) "`$this`" else this

