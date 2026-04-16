plugins {
    `lume-core`
    `lume-compose`
}

kotlin {
    android {
        namespace = "com.davils.lume.common"
    }

    sourceSets {
        commonMain {
            dependencies {
                api(libs.bundles.common.common.api)
            }
        }

        androidMain {
            dependencies {
                api(libs.bundles.common.android.api)
            }
        }

        jvmMain {
            dependencies {
                api(compose.desktop.currentOs)
            }
        }
    }
}