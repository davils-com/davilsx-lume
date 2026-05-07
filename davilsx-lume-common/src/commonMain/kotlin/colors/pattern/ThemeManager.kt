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

package colors.pattern


import colors.model.ThemeVariant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

public object ThemeManager {
    private val _paletteId = MutableStateFlow("tailwind")
    public val paletteId: StateFlow<String> = _paletteId.asStateFlow()

    private val _variant = MutableStateFlow(ThemeVariant.LIGHT)
    public val variant: StateFlow<ThemeVariant> = _variant.asStateFlow()

    public fun setPalette(id: String) {
        _paletteId.value = id
    }

    public fun setVariant(value: ThemeVariant) {
        _variant.value = value
    }
}