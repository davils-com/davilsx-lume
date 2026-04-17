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

import org.gradle.api.Action
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Nested
import javax.inject.Inject

/**
 * Gradle extension describing a single icon pack to generate.
 *
 * A pack groups a set of icon resources that share a common source and
 * file-name prefix. Configuration options (copyright, allowed file
 * extensions, KDoc rendering) apply exclusively to icons belonging to
 * this pack.
 *
 * @since 1.0.0
 */
public abstract class IconizePackExtension @Inject constructor(
    /**
     * The unique name of the pack.
     *
     * Also used as the file-name prefix (`<name>_<icon>.xml`) and as the
     * Kotlin package suffix for the generated pack-specific files.
     *
     * @since 1.0.0
     */
    public val name: String,
    factory: ObjectFactory,
) {
    /**
     * Optional copyright header prepended to every generated file of this pack.
     *
     * When `null` or blank, only the auto-generated notice is emitted.
     *
     * @since 1.0.0
     */
    public val copyright: Property<String> = factory.property(String::class.java)

    /**
     * File extensions considered as icon sources for this pack.
     *
     * Defaults to `xml` and `svg`. Files with other extensions inside the
     * configured icon directory are ignored.
     *
     * @since 1.0.0
     */
    public val fileExtensions: ListProperty<String> = factory.listProperty(String::class.java).convention(listOf("xml", "svg"))

    /**
     * Nested configuration controlling KDoc rendering for generated declarations.
     *
     * @since 1.0.0
     */
    @get:Nested
    public abstract val kDoc: IconizePackKDocExtension

    /**
     * Enables and configures the [kDoc] block via the given [action].
     *
     * Invoking this method implicitly sets [IconizePackKDocExtension.enabled] to `true`.
     *
     * @param action Configuration applied to the nested [IconizePackKDocExtension].
     * @return Nothing.
     * @since 1.0.0
     */
    public fun kDoc(action: Action<IconizePackKDocExtension>) {
        kDoc.enabled.set(true)
        action.execute(kDoc)
    }
}
