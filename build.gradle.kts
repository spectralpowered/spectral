import java.net.URL

plugins {
    java
    `java-base`
    kotlin("jvm")
    id("com.github.gmazzo.buildconfig") version "3.1.0"
    id("com.google.devtools.ksp") version "1.7.20-1.0.8"
}

tasks.wrapper {
    gradleVersion = "7.6"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "io.spectralpowered"
    version = "0.1.0"

    repositories {
        mavenLocal()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation(kotlin("reflect"))
        testImplementation(kotlin("test"))
    }

    tasks.test {
        useJUnitPlatform()
    }
}

apply<DecompileGamepackPlugin>()
apply<UpdateGamepackPlugin>()

dependencies {
    implementation(project(":spectral-deobfuscator"))
}

tasks {
    named<UpdateGamepackPlugin.UpdateTask>("updateGamepack") {
        doLast {
            println("Downloading latest Oldschool RuneScape gamepack.jar.")
            URL("http://oldschool.runescape.com/gamepack.jar").readBytes().also {
                project.buildDir.resolve("bin/gamepack.jar").writeBytes(it)
            }

            println("Deobfuscating...")
            project(":spectral-deobfuscator").tasks.named<JavaExec>("run") {
                jvmArgs = listOf("${project.buildDir.resolve("bin/gamepack.jar")}", "${project.buildDir.resolve("bin/gamepack.deob.jar")}")
                exec()
            }
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}