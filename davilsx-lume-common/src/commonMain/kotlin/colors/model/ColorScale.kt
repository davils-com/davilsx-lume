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

package colors.model

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
public data class ColorScale(
    val c50: Color,
    val c100: Color,
    val c200: Color,
    val c300: Color,
    val c400: Color,
    val c500: Color,
    val c600: Color,
    val c700: Color,
    val c800: Color,
    val c900: Color,
    val c950: Color
) {
    public operator fun get(shade: Int): Color = when (shade) {
        50 -> c50
        100 -> c100
        200 -> c200
        300 -> c300
        400 -> c400
        500 -> c500
        600 -> c600
        700 -> c700
        800 -> c800
        900 -> c900
        950 -> c950
        else -> error("Unsupported shade: $shade")
    }
}