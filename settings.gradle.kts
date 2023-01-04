plugins {
    id("de.fayard.refreshVersions") version "0.51.0"
}

rootProject.name = "spectral"

module("client")
module("logger")
module("commons")
module("api")
module("util")
module("internal:asm")
module("internal:deobfuscator")
module("runescape")

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