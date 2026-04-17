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

package com.davils.buildsrc.iconize

import com.android.build.api.variant.impl.capitalizeFirstChar
import com.davils.buildsrc.iconize.extension.IconizeExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.register

/**
 * Gradle Plugin for icon generation and management.
 *
 * This plugin sets up the [IconizeExtension] and registers generation tasks
 * based on the configured icon packs.
 *
 * @since 1.0.0
 */
public class Iconize : Plugin<Project> {
    /**
     * Applies the Iconize plugin to the given project.
     *
     * @param project The Gradle project to apply the plugin to.
     * @since 1.0.0
     */
    override fun apply(project: Project) {
        val iconizeExtension = project.extensions.create<IconizeExtension>("iconize", project.objects, project)
        project.registerGenerationTasks(iconizeExtension)
    }

    /**
     * Registers icon generation tasks for each pack defined in the extension.
     *
     * Uses the `all` listener on the packs container to ensure tasks are registered
     * immediately when a pack is added, avoiding the need for `afterEvaluate`.
     *
     * @param extension The Iconize extension containing the pack configurations.
     * @since 1.0.0
     */
    private fun Project.registerGenerationTasks(extension: IconizeExtension) {
        val generateAllIcons = project.tasks.register("generateAllIcons") {
            group = "iconize"
            description = "Generates all icons for all configured packs."
        }

        val packs = extension.getPacks()
        packs.all {
            val taskName = "generate${name.capitalizeFirstChar()}Icons"
            val packTask = tasks.register<IconizeIconGenerationTask>(taskName) {
                group = "iconize"
                description = "Generates ${this@all.name} icons."
            }

            generateAllIcons.configure {
                dependsOn(packTask)
            }
        }
    }
}
