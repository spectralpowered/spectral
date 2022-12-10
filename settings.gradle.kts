plugins {
    id("de.fayard.refreshVersions") version "0.51.0"
}

rootProject.name = "spectral"

include(":logger")
include(":runescape")
include(":asm")
include(":api")
include(":cache")
include(":client")
include(":commons")
include(":deobfuscator")
include(":injector")
include(":mixins")
include(":plugins")
include(":util")