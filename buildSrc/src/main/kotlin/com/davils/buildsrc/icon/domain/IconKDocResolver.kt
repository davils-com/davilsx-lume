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

internal data class KDocConfig(
    val enabled: Boolean,
    val docUrlPattern: String,
    val since: String,
)

internal enum class GeneratedSymbolType {
    PAINTER,
    ICON,
}

internal class IconKDocResolver(
    private val config: KDocConfig,
) {
    fun resolve(spec: IconSpec, symbolType: GeneratedSymbolType): String {
        val url = if (config.enabled && config.docUrlPattern.isNotBlank()) {
            config.docUrlPattern.replace("%{icon}", spec.docSlug)
        } else {
            ""
        }

        return when (symbolType) {
            GeneratedSymbolType.PAINTER -> painterDoc(spec, url)
            GeneratedSymbolType.ICON -> composableDoc(spec, url)
        }
    }

    private fun painterDoc(spec: IconSpec, url: String): String = buildString {
        appendLine("Returns a `Painter` for the `${spec.resourceName}` icon.")
        appendOptionalUrl(url)
        appendLine("@return The `Painter` for the icon.")
        appendSince()
    }.trimEnd()

    private fun composableDoc(spec: IconSpec, url: String): String = buildString {
        appendLine("Composable for the `${spec.composableFunctionName}` icon.")
        appendOptionalUrl(url)
        appendLine("@param modifier The `Modifier` to be applied to the icon.")
        appendLine("@param color The `Color` of the icon.")
        appendLine("@param contentDescription The description of the icon for accessibility.")
        appendSince()
    }.trimEnd()

    private fun StringBuilder.appendOptionalUrl(url: String) {
        if (url.isBlank()) return
        appendLine()
        appendLine("For more information see the official icon documentation: $url")
        appendLine()
    }

    private fun StringBuilder.appendSince() {
        if (config.since.isBlank()) return
        appendLine("@since ${config.since}")
    }
}
