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
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.OutputDirectory
import javax.inject.Inject

public abstract class IconizeExtension @Inject constructor(factory: ObjectFactory, project: Project) {
    private val packs: NamedDomainObjectContainer<IconizePackExtension> = factory.domainObjectContainer(IconizePackExtension::class.java)

    public val basePackage: Property<String> = factory.property(String::class.java).convention(project.group.toString())

    @get:InputDirectory
    public val iconDirectory: DirectoryProperty = factory.directoryProperty().convention(project.layout.projectDirectory.dir("src/main/resources/drawable"))

    @get:OutputDirectory
    public val sourceDirectory: DirectoryProperty = factory.directoryProperty().convention(project.layout.projectDirectory.dir("src/main/kotlin"))

    @get:Nested
    public abstract val resources: IconizeResourceExtension

    public fun resources(action: Action<IconizeResourceExtension>) {
        action.execute(resources)
    }

    public fun pack(name: String, action: Action<IconizePackExtension>) {
        packs.register(name, action)
    }

    internal fun getPacks(): NamedDomainObjectContainer<IconizePackExtension> = packs
}

