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

import colors.model.LumenColors
import colors.model.ThemeVariant
import colors.palettes.TailwindPalette

public object PaletteRegistry {
    private val sources = linkedMapOf<String, PaletteSource>()

    init {
        register(TailwindPalette)
        // Other Palettes
    }

    public fun register(source: PaletteSource) {
        sources[source.id] = source
    }

    public fun get(id: String, variant: ThemeVariant): LumenColors {
        val source = sources[id] ?: error("Unknown palette: $id")
        return source.create(variant)
    }

    public fun all(): List<PaletteSource> = sources.values.toList()
}