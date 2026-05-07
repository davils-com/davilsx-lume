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

package colors.utils


import androidx.compose.ui.graphics.Color
import colors.model.ColorScale

public fun scale(
    c50: Color,
    c100: Color,
    c200: Color,
    c300: Color,
    c400: Color,
    c500: Color,
    c600: Color,
    c700: Color,
    c800: Color,
    c900: Color,
    c950: Color
): ColorScale = ColorScale(c50, c100, c200, c300, c400, c500, c600, c700, c800, c900, c950)

public fun c(hex: Long): Color = Color(hex)