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

package com.davils.buildsrc.icon.domain

private val SEPARATOR_REGEX: Regex = "[^A-Za-z0-9]+".toRegex()
private val KOTLIN_KEYWORDS: Set<String> = setOf(
    "as", "break", "class", "continue", "do", "else", "false", "for", "fun", "if", "in", "interface",
    "is", "null", "object", "package", "return", "super", "this", "throw", "true", "try", "typealias",
    "typeof", "val", "var", "when", "while",
)

internal class IconNameMapper {
    fun map(fileNameWithoutExtension: String): IconSpec {
        val sanitizedFileName = fileNameWithoutExtension.trim()
        val tokens = sanitizedFileName
            .split(SEPARATOR_REGEX)
            .filter { it.isNotBlank() }
            .map { it.lowercase() }

        require(tokens.isNotEmpty()) {
            "Icon file name '$fileNameWithoutExtension' does not contain a valid Kotlin symbol."
        }

        val painterFunctionName = sanitizeIdentifier(tokens.toLowerCamelCase(), fallbackPrefix = "icon")
        val composableFunctionName = sanitizeIdentifier(tokens.toUpperCamelCase(), fallbackPrefix = "Icon")

        return IconSpec(
            fileNameWithoutExtension = sanitizedFileName,
            resourceName = sanitizedFileName,
            painterFunctionName = painterFunctionName,
            composableFunctionName = composableFunctionName,
            docSlug = tokens.joinToString(separator = "-"),
        )
    }

    private fun sanitizeIdentifier(value: String, fallbackPrefix: String): String {
        val candidate = if (value.firstOrNull()?.isDigit() == true) "$fallbackPrefix$value" else value
        val keywordSafe = if (candidate in KOTLIN_KEYWORDS) "${candidate}_" else candidate
        return keywordSafe.ifBlank { fallbackPrefix }
    }
}

private fun List<String>.toLowerCamelCase(): String {
    if (isEmpty()) return ""
    val first = first().lowercase()
    val rest = drop(1).joinToString(separator = "") { it.replaceFirstChar(Char::uppercaseChar) }
    return first + rest
}

private fun List<String>.toUpperCamelCase(): String =
    joinToString(separator = "") { it.replaceFirstChar(Char::uppercaseChar) }

