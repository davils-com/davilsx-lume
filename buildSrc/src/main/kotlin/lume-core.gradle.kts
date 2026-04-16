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

import com.davils.buildsrc.Project

plugins {
    com.android.kotlin.multiplatform.library
    org.jetbrains.kotlin.multiplatform
    com.google.devtools.ksp
    com.davils.kreate
    io.kotest
}

group = Project.Organisation.GROUP

kotlin {
    jvm()
    js(IR) {
        browser()
    }
    iosArm64()
    iosSimulatorArm64()
    iosX64()

    android {
        compileSdk { version = release(Project.Android.COMPILE_SDK) }
        minSdk = Project.Android.MIN_SDK
        withJava()

        withHostTest {
            isIncludeAndroidResources = true
        }
    }
}

kreate {
    platform {
        javaVersion = JavaVersion.VERSION_25
        explicitApi = true
        allWarningsAsErrors = true
    }

    project {
        projectGroup = group.toString()

        docs {
            enabled = true
            outputDirectory = "dokka"
        }

        tests {
            enabled = true
            maxParallelForks = Runtime.getRuntime().availableProcessors()
            timeoutMinutes = 10
            ignoreFailures = false
            alwaysRunTests = false
            failOnNoDiscoveredTests = false

            logging {
                logPassedTests = true
                logSkippedTests = true
                logTestStarted = true
            }

            report {
                enabled = true
                xml = true
                html = false
            }
        }
    }
}