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

package com.davils.buildsrc.icon.plugin

import com.davils.buildsrc.icon.dsl.IconGeneratorExtension
import com.davils.buildsrc.icon.task.GenerateIconsTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.Directory
import org.gradle.kotlin.dsl.register
import java.io.File

internal class IconGeneratorPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val extension = target.extensions.create(
            "icon",
            IconGeneratorExtension::class.java,
            target.objects,
            target.layout,
        )

        val generateIconsTask = target.tasks.register<GenerateIconsTask>("generateIcons") {
            group = "code generation"
            description = "Generates icon painters and icon composables from drawable XML files."

            copyright.set(target.provider { extension.copyright })
            packageName.set(target.provider { extension.packageName })
            resourceClassName.set(target.provider { extension.nameOfResClass })
            resourcePackageName.set(target.provider { extension.packageOfResClass })
            painterObjectName.set(target.provider { extension.painterObjectName })
            kDocEnabled.set(target.provider { extension.kDoc.enabled })
            kDocUrlPattern.set(target.provider { extension.kDoc.docUrlPattern })
            kDocSince.set(target.provider { extension.kDoc.since })
            inputDirectory.set(target.layout.dir(target.provider { toFile(extension.inputDirectory) }))
            outputDirectory.set(target.layout.dir(target.provider { toFile(extension.outputDir) }))
        }

        target.tasks.configureEach {
            if (name.startsWith("compile") && name.contains("Kotlin")) {
                dependsOn(generateIconsTask)
            }
        }
    }

    private fun toFile(value: Any): File = when (value) {
        is File -> value
        is Directory -> value.asFile
        else -> error("Unsupported directory value type: ${value::class.qualifiedName}")
    }
}
