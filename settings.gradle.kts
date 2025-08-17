pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://jitpack.io")
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositories {
        maven("https://jitpack.io")
        google()
        mavenCentral()
    }
}
rootProject.name = "RezkaAG"
include(":rezkaag")