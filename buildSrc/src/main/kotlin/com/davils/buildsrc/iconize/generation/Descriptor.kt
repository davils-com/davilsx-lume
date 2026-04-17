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

import java.io.File

/**
 * Describes a single icon parsed from its source resource file.
 *
 * Encapsulates all name variants needed during code generation (resource name,
 * camelCase for painter methods, PascalCase for composables, kebab-case for docs).
 *
 * @since 1.0.0
 */
internal data class IconDescriptor(
    /**
     * The identifier used to look up the icon in the generated resources class.
     *
     * Equivalent to `LumeLucideResources.drawable.<resourceName>`.
     *
     * @since 1.0.0
     */
    val resourceName: String,

    /**
     * The camelCase name used for the painter function.
     *
     * @since 1.0.0
     */
    val camelName: String,

    /**
     * The PascalCase name used as the suffix for the icon composable.
     *
     * @since 1.0.0
     */
    val pascalName: String,

    /**
     * The kebab-case representation used inside documentation URLs.
     *
     * @since 1.0.0
     */
    val kebabName: String,
) {
    companion object {
        /**
         * Creates an [IconDescriptor] from the given resource [file].
         *
         * The file name (without extension) is sanitized — dashes are converted
         * to underscores to produce a valid Kotlin identifier for the resource.
         * The leading `<packName>_` prefix is stripped from the derived Kotlin
         * identifiers (camel/Pascal/kebab) but retained in [resourceName] so
         * that the drawable lookup matches the actual resource file.
         *
         * @param file The icon resource file.
         * @param packName The name of the owning pack, used as the file-name prefix.
         * @return A fully populated [IconDescriptor].
         * @since 1.0.0
         */
        fun from(file: File, packName: String): IconDescriptor {
            val sanitized = file.nameWithoutExtension.replace('-', '_')
            val prefix = "${packName}_"
            val nameWithoutPack = if (sanitized.startsWith(prefix)) sanitized.removePrefix(prefix) else sanitized
            return IconDescriptor(
                resourceName = sanitized,
                camelName = nameWithoutPack.toCamelCase(),
                pascalName = nameWithoutPack.toPascalCase(),
                kebabName = nameWithoutPack.replace('_', '-'),
            )
        }
    }
}

/**
 * Converts a snake/kebab-case string to PascalCase.
 *
 * @return The PascalCase representation of the receiver.
 * @since 1.0.0
 */
internal fun String.toPascalCase(): String = split('_', '-')
    .filter { it.isNotEmpty() }
    .joinToString(separator = "") { part -> part.replaceFirstChar { it.uppercaseChar() } }

/**
 * Converts a snake/kebab-case string to camelCase.
 *
 * @return The camelCase representation of the receiver.
 * @since 1.0.0
 */
internal fun String.toCamelCase(): String {
    val parts = split('_', '-').filter { it.isNotEmpty() }
    if (parts.isEmpty()) return this
    val head = parts.first().replaceFirstChar { it.lowercaseChar() }
    val tail = parts.drop(1).joinToString(separator = "") { part -> part.replaceFirstChar { it.uppercaseChar() } }
    return head + tail
}
