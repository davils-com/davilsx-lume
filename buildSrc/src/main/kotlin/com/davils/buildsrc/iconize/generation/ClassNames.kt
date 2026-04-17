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

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName

/**
 * Central registry of Compose and AndroidX class and member references used
 * by the icon generators.
 *
 * Keeping all references in one place avoids typos and makes upgrading
 * dependencies a single-file change.
 *
 * @since 1.0.0
 */
internal object ComposeClassNames {
    /**
     * The Compose `@Composable` annotation.
     *
     * @since 1.0.0
     */
    val COMPOSABLE: ClassName = ClassName("androidx.compose.runtime", "Composable")

    /**
     * The Compose `Modifier` class.
     *
     * @since 1.0.0
     */
    val MODIFIER: ClassName = ClassName("androidx.compose.ui", "Modifier")

    /**
     * The Compose `Color` class.
     *
     * @since 1.0.0
     */
    val COLOR: ClassName = ClassName("androidx.compose.ui.graphics", "Color")

    /**
     * The Compose `ColorFilter` class.
     *
     * @since 1.0.0
     */
    val COLOR_FILTER: ClassName = ClassName("androidx.compose.ui.graphics", "ColorFilter")

    /**
     * The Compose `Painter` class.
     *
     * @since 1.0.0
     */
    val PAINTER: ClassName = ClassName("androidx.compose.ui.graphics.painter", "Painter")

    /**
     * The `Image` composable from `androidx.compose.foundation`.
     *
     * @since 1.0.0
     */
    val IMAGE: MemberName = MemberName("androidx.compose.foundation", "Image")

    /**
     * The `size` `androidx.compose.ui.Modifier` extension.
     *
     * @since 1.0.0
     */
    val MODIFIER_SIZE: MemberName = MemberName("androidx.compose.foundation.layout", "size")

    /**
     * The `dp` extension on [Int] from `androidx.compose.ui.unit`.
     *
     * @since 1.0.0
     */
    val DP: MemberName = MemberName("androidx.compose.ui.unit", "dp")

    /**
     * The `painterResource` composable from Compose Multiplatform resources.
     *
     * @since 1.0.0
     */
    val PAINTER_RESOURCE: MemberName = MemberName("org.jetbrains.compose.resources", "painterResource")
}
