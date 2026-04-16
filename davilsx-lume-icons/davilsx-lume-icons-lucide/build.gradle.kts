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

plugins {
    `lume-core`
    `lume-common`
    `lume-compose`
    `lume-icon-generator`
}

kotlin {
    android {
        namespace = "com.davils.lume.icons.lucide"
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.compose.components.resources)
            }
        }
    }
}

compose {
    resources {
        nameOfResClass = "LumeLucideResources"
        packageOfResClass = "com.davils.lume.icons.lucide.resources"
    }
}

icon {
    copyright = """
        Copyright 2026 Davils

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

            http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
    """.trimIndent()
    nameOfResClass = "LumeLucideResources"
    packageOfResClass = "com.davils.lume.icons.lucide.resources"
    inputDirectory = file(layout.projectDirectory.dir("src/commonMain/resources/drawable"))
    outputDir = (layout.projectDirectory.dir("src/commonMain/kotlin"))
    packageName = "com.davils.lume.icons.lucide"

    kDoc {
        enabled = true
        docUrlPattern = "https://lucide.dev/icons/%{icon}"
        since = "1.0.0"
    }
}