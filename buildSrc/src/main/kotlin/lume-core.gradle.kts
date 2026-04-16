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