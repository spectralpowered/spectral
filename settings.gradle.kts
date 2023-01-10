pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.51.0"
}

rootProject.name = "spectral"

module("logger")
module("commons")
module("util")
module("api")
module("launcher")
module("client")
module("internal:asm")
module("internal:deobfuscator")
module("internal:gamepack")
module("internal:mapper")
module("internal:injector")
module("internal:mixin")

fun module(path: String) {
    val split = path.split(":")
    val moduleName = split.lastOrNull() ?: path

    include(moduleName)

    if(split.size > 1) {
        val projectPath = path.replace(":", "/")
        project(":$moduleName").projectDir = file(projectPath)
    }

    project(":$moduleName").name = "spectral-$moduleName"
}

fun gradleModule(path: String) {
    includeBuild(path.replace(":", "/"))
}
