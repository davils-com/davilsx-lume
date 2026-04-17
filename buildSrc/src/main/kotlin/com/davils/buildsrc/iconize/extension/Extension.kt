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

package com.davils.buildsrc.iconize.extension

import com.davils.buildsrc.iconize.extension.pack.IconizePackExtension
import org.gradle.api.Action
import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Nested
import javax.inject.Inject

/**
 * Gradle extension that exposes the configuration surface of the `iconize` plugin.
 *
 * The extension aggregates project-wide defaults (base package, icon and
 * source directories, generated resources metadata) and the list of
 * registered icon packs. It is intended to be accessed through the `iconize { }`
 * DSL block inside a consumer project.
 *
 * @since 1.0.0
 */
public abstract class IconizeExtension @Inject constructor(factory: ObjectFactory, project: Project) {
    /**
     * Container holding all [IconizePackExtension]s registered for this project.
     *
     * Mutable through [pack]; exposed for internal consumption only via [getPacks].
     *
     * @since 1.0.0
     */
    private val packs: NamedDomainObjectContainer<IconizePackExtension> = factory.domainObjectContainer(IconizePackExtension::class.java)

    /**
     * The base package under which all generated Kotlin sources are placed.
     *
     * Defaults to the project's Gradle `group` coordinate.
     *
     * @since 1.0.0
     */
    public val basePackage: Property<String> = factory.property(String::class.java).convention(project.group.toString())

    /**
     * Directory containing the raw icon resource files (e.g. `*.xml`).
     *
     * Defaults to `src/main/resources/drawable` inside the project.
     *
     * @since 1.0.0
     */
    public val iconDirectory: DirectoryProperty = factory.directoryProperty().convention(project.layout.projectDirectory.dir("src/main/resources/drawable"))

    /**
     * Root directory into which the generated Kotlin sources are written.
     *
     * Defaults to `src/main/kotlin` inside the project.
     *
     * @since 1.0.0
     */
    public val sourceDirectory: DirectoryProperty = factory.directoryProperty().convention(project.layout.projectDirectory.dir("src/main/kotlin"))

    /**
     * Metadata describing the generated Compose `Resources` class used to look up drawables.
     *
     * @since 1.0.0
     */
    @get:Nested
    public abstract val resources: IconizeResourceExtension

    /**
     * Configures the [resources] block via the given [action].
     *
     * @param action Configuration applied to the nested [IconizeResourceExtension].
     * @return Nothing.
     * @since 1.0.0
     */
    public fun resources(action: Action<IconizeResourceExtension>) {
        action.execute(resources)
    }

    /**
     * Registers and configures a new icon pack with the given [name].
     *
     * @param name Unique identifier of the pack (e.g. `lucide`, `davils`).
     * @param action Configuration applied to the newly created [IconizePackExtension].
     * @return Nothing.
     * @since 1.0.0
     */
    public fun pack(name: String, action: Action<IconizePackExtension>) {
        packs.register(name, action)
    }

    /**
     * Exposes the internal pack container to the plugin for task wiring.
     *
     * @return The container of configured [IconizePackExtension]s.
     * @since 1.0.0
     */
    internal fun getPacks(): NamedDomainObjectContainer<IconizePackExtension> = packs
}
