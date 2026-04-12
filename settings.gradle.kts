plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "lume"
include("davilsx-lume-ui")
include("davilsx-lume-icons")

include("davilsx-lume-icons:davilsx-lume-icons-lucide")