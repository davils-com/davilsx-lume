import org.gradle.kotlin.dsl.invoke

plugins {
    org.jetbrains.kotlin.multiplatform
    com.davils.kreate
    io.kotest
    com.google.devtools.ksp
}

kotlin {
    jvm()
    js(IR) {
        browser()
    }
    iosArm64()
    iosSimulatorArm64()
    iosX64()
}

kreate {
    platform {
        javaVersion = JavaVersion.VERSION_25
        explicitApi = true
        allWarningsAsErrors = true
    }

    project {
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