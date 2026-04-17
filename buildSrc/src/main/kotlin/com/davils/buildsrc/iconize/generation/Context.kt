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
 * Immutable snapshot of all inputs required to generate a single icon pack.
 *
 * Passed to every [com.davils.buildsrc.iconize.generation.writer.FileWriter] so that generators do not have to depend on
 * Gradle types. This makes code generation logic easy to test and reason about.
 *
 * @since 1.0.0
 */
internal data class GenerationContext(
    /**
     * The name of the icon pack (e.g. `lucide`).
     *
     * @since 1.0.0
     */
    val packName: String,

    /**
     * The PascalCase prefix derived from [packName] (e.g. `Lucide`).
     *
     * @since 1.0.0
     */
    val packClassPrefix: String,

    /**
     * The fully-qualified target package for generated pack-specific sources.
     *
     * @since 1.0.0
     */
    val targetPackage: String,

    /**
     * The fully-qualified package that hosts the shared `LumeIcon` composable.
     *
     * This is typically the base package of the Iconize extension, so every
     * icon pack reuses the same `LumeIcon` implementation.
     *
     * @since 1.0.0
     */
    val lumeIconPackage: String,

    /**
     * The package that hosts the generated Compose resources class.
     *
     * @since 1.0.0
     */
    val resourcesPackage: String,

    /**
     * The simple name of the generated Compose resources class.
     *
     * @since 1.0.0
     */
    val resourcesClassName: String,

    /**
     * The Kotlin source root under which generated files are placed.
     *
     * Files are written to a subdirectory derived from their target package.
     *
     * @since 1.0.0
     */
    val sourceRoot: File,

    /**
     * Optional copyright header rendered at the top of every generated file.
     *
     * @since 1.0.0
     */
    val copyright: String?,

    /**
     * Whether KDoc should be rendered for every generated declaration.
     *
     * @since 1.0.0
     */
    val kDocEnabled: Boolean,

    /**
     * Optional URL pattern used in KDoc links. Placeholder `%{icon}` is replaced
     * with the kebab-case icon name.
     *
     * @since 1.0.0
     */
    val kDocUrlPattern: String?,

    /**
     * The `@since` version rendered in every generated KDoc block.
     *
     * @since 1.0.0
     */
    val kDocSince: String,

    /**
     * All icons to generate code for, already sorted.
     *
     * @since 1.0.0
     */
    val icons: List<IconDescriptor>,
) {
    /**
     * The name of the generated painter object (e.g. `LucidePainter`).
     *
     * @since 1.0.0
     */
    val painterObjectName: String get() = "${packClassPrefix}Painter"
}
