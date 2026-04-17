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
    `lume-iconize`
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
        nameOfResClass = "IconizeResources"
        packageOfResClass = "com.davils.lume.icons.resources"
    }
}

iconize {
    basePackage = "com.davils.lume.icons"
    iconDirectory = file(layout.projectDirectory.dir("src/commonMain/resources/drawable"))
    sourceDirectory = file(layout.projectDirectory.dir("src/commonMain/kotlin"))

    resources {
        nameOfResClass = "IconizeResources"
        packageOfResClass = "com.davils.lume.icons.resources"
    }

    pack("lucide") {
        fileExtensions = listOf("xml")
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

        kDoc {
            enabled = true
            urlPattern = "https://lucide.dev/icons/%{icon}"
            since = "1.0.0"
        }
    }
}