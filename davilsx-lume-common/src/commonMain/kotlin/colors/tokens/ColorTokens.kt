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

package colors.tokens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import colors.model.LumenColorFamily
import colors.model.LumenColors

public val LocalLumenColors: ProvidableCompositionLocal<LumenColors> = staticCompositionLocalOf {
    error("No LumenColors provided")
}

@Composable
public fun tw(family: LumenColorFamily, shade: Int): Color =
    LocalLumenColors.current[family][shade]

// ToDo: Find a more optimal way to do that instead of that ->
public val red50: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][50]
public val red100: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][100]
public val red200: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][200]
public val red300: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][300]
public val red400: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][400]
public val red500: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][500]
public val red600: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][600]
public val red700: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][700]
public val red800: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][800]
public val red900: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][900]
public val red950: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.RED][950]

public val orange50: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][50]
public val orange100: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][100]
public val orange200: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][200]
public val orange300: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][300]
public val orange400: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][400]
public val orange500: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][500]
public val orange600: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][600]
public val orange700: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][700]
public val orange800: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][800]
public val orange900: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][900]
public val orange950: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.ORANGE][950]

public val amber50: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][50]
public val amber100: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][100]
public val amber200: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][200]
public val amber300: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][300]
public val amber400: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][400]
public val amber500: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][500]
public val amber600: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][600]
public val amber700: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][700]
public val amber800: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][800]
public val amber900: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][900]
public val amber950: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.AMBER][950]

public val yellow50: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][50]
public val yellow100: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][100]
public val yellow200: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][200]
public val yellow300: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][300]
public val yellow400: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][400]
public val yellow500: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][500]
public val yellow600: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][600]
public val yellow700: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][700]
public val yellow800: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][800]
public val yellow900: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][900]
public val yellow950: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.YELLOW][950]

public val lime50: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][50]
public val lime100: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][100]
public val lime200: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][200]
public val lime300: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][300]
public val lime400: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][400]
public val lime500: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][500]
public val lime600: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][600]
public val lime700: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][700]
public val lime800: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][800]
public val lime900: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][900]
public val lime950: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.LIME][950]

public val green50: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][50]
public val green100: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][100]
public val green200: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][200]
public val green300: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][300]
public val green400: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][400]
public val green500: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][500]
public val green600: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][600]
public val green700: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][700]
public val green800: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][800]
public val green900: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][900]
public val green950: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.GREEN][950]

public val emerald50: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][50]
public val emerald100: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][100]
public val emerald200: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][200]
public val emerald300: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][300]
public val emerald400: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][400]
public val emerald500: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][500]
public val emerald600: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][600]
public val emerald700: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][700]
public val emerald800: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][800]
public val emerald900: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][900]
public val emerald950: Color @Composable get() = LocalLumenColors.current[LumenColorFamily.EMERALD][950]

/*
TEAL,
CYAN,
SKY,
BLUE,
INDIGO,
VIOLET,
PURPLE,
FUCHSIA,
PINK,
ROSE,
SLATE,
GRAY,
ZINC,
NEUTRAL,
STONE,
TAUPE,
MAUVE,
MIST,
OLIVE
*/