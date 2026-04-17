// Copyright 2026 Davils
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.    
package com.davils.lume.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import kotlin.String

/**
 * Renders an icon from the `Lucide` pack using a custom [Painter].
 *
 * The icon is drawn at a fixed 24.dp size and tinted with [tint] unless
 * [Color.Unspecified] is provided, in which case the original colors are preserved.
 *
 * @param painter The [Painter] that draws the icon.
 * @param contentDescription Accessibility description. May be `null` for decorative icons.
 * @param modifier The [Modifier] applied to the icon.
 * @param tint The tint [Color]. Use [Color.Unspecified] to disable tinting.
 * @since 1.0.0
 */
@Composable
public fun LumeIcon(
  painter: Painter,
  contentDescription: String?,
  modifier: Modifier = Modifier,
  tint: Color = Color.Black,
) {
  Image(
    painter = painter,
    contentDescription = contentDescription,
    modifier = modifier.size(24.dp),
    colorFilter = if (tint != Color.Unspecified) ColorFilter.tint(tint) else null,
  )
}
