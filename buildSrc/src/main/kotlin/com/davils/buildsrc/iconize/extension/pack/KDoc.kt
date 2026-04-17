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

package com.davils.buildsrc.iconize.extension.pack

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import javax.inject.Inject

/**
 * Nested extension controlling KDoc rendering for a single icon pack.
 *
 * When KDoc rendering is enabled the generator emits documentation blocks
 * for every generated declaration and inlines an optional URL pointing to
 * the upstream icon reference.
 *
 * @since 1.0.0
 */
public abstract class IconizePackKDocExtension @Inject constructor(factory: ObjectFactory) {
    /**
     * Whether KDoc blocks are rendered for declarations generated for this pack.
     *
     * Defaults to `false`; automatically toggled to `true` when the pack uses
     * the `kDoc { }` DSL.
     *
     * @since 1.0.0
     */
    public val enabled: Property<Boolean> = factory.property(Boolean::class.java).convention(false)

    /**
     * Optional URL pattern referenced from generated KDoc blocks.
     *
     * The placeholder `%{icon}` is replaced with the kebab-case icon name.
     *
     * @since 1.0.0
     */
    public val urlPattern: Property<String> = factory.property(String::class.java)

    /**
     * Version rendered in the `@since` tag of generated KDoc blocks.
     *
     * When absent, the generator falls back to a sensible default (e.g. `1.0.0`).
     *
     * @since 1.0.0
     */
    public val since: Property<String> = factory.property(String::class.java)
}