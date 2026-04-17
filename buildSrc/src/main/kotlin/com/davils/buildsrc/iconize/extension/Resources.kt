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

import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import javax.inject.Inject

/**
 * Nested extension describing the Compose multiplatform `Resources` class
 * used to resolve drawables referenced by generated painters.
 *
 * The generator needs to know both the fully-qualified package and the simple
 * class name of the resources aggregator in order to emit the correct
 * `import` and `Res.drawable.<name>` references.
 *
 * @since 1.0.0
 */
public abstract class IconizeResourceExtension @Inject constructor(factory: ObjectFactory, project: Project) {
    /**
     * Simple class name of the generated Compose resources aggregator.
     *
     * Defaults to `Res`, matching the Compose multiplatform default.
     *
     * @since 1.0.0
     */
    public val nameOfResClass: Property<String> = factory.property(String::class.java).convention("Res")

    /**
     * Fully-qualified package of the generated Compose resources aggregator.
     *
     * Defaults to `<project.group>.resources`.
     *
     * @since 1.0.0
     */
    public val packageOfResClass: Property<String> = factory.property(String::class.java).convention("${project.group}.resources")
}