@file:Suppress("UNUSED_VARIABLE")

import org.gradle.api.tasks.wrapper.Wrapper.DistributionType
import kotlin.io.readLine
import org.gradle.kotlin.dsl.support.unzipTo
import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler
import java.io.FileOutputStream
import java.net.URL

plugins {
    `java-library`
    kotlin("jvm")
    id("com.github.gmazzo.buildconfig") version "3.1.0"
    id("com.google.devtools.ksp") version "1.7.20-1.0.8"
}

tasks.wrapper {
    gradleVersion = "7.6"
    distributionType = DistributionType.ALL
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "io.spectralpowered"
    version = "0.1.0"

    repositories {
        mavenLocal()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.spectralpowered.io")
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

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

/*
 * ===== SPECTRAL PROJECT TASKS =====
 */

val baseDir = rootProject.project.buildDir
val binDir = baseDir.resolve("bin/")
val decompDir = baseDir.resolve("decomp/")
val gamepackFile = binDir.resolve("gamepack.jar")
val gamepackDeobFile = binDir.resolve("gamepack.deob.jar")
val gamepackDir = project(":spectral-gamepack").projectDir.resolve("src/main/java/")

tasks {
    /*
     * === LATEST VANILLA GAMEPACK DOWNLOAD TASK ===
     */
    val downloadLatestGamepack by register("downloadLatest") {
        group = "gamepack"
        doLast {
            println("Downloading latest Old School RuneScape gamepack.")
            if(binDir.exists()) binDir.deleteRecursively()
            binDir.mkdirs()
            gamepackFile.createNewFile()
            URL("http://oldschool1.runescape.com/gamepack.jar").openConnection().getInputStream().use { input ->
                FileOutputStream(gamepackFile).use { output ->
                    input.copyTo(output)
                }
            }
            println("Successfully downloaded gamepack.")
        }
    }

    /*
     * === DEOBFUSCATE VANILLA GAMEPACK TASK ===
     */
    val deobfuscateGamepack by register("deobfuscate") {
        group = "gamepack"
        dependsOn(downloadLatestGamepack)
        doLast {
            println("Deobfuscating latest Old School RuneScape gamepack.")
            project(":spectral-deobfuscator").tasks.named<JavaExec>("run") {
                args = mutableListOf(gamepackFile.toString(), gamepackDeobFile.toString())
            }.get().exec()
            println("Successfully deobfuscated gamepack.")
        }
    }

    /*
     * === DECOMPILE REMAPPED GAMEPACK TASK ===
     */
    val decompileGamepack by register("decompile") {
        group = "gamepack"
        dependsOn(deobfuscateGamepack)
        doLast {
            println("Decompiling updated Old School RuneScape gamepack.")
            if(decompDir.exists()) decompDir.deleteRecursively()
            decompDir.mkdirs()
            val args = listOf(gamepackDeobFile.toString(), "-asc=1", decompDir.toString())
            ConsoleDecompiler.main(args.toTypedArray())
            val outFile = decompDir.resolve("gamepack.deob.jar")
            unzipTo(decompDir, outFile)
            outFile.deleteRecursively()
            println("Successfully decompiled gamepack.")
        }
    }

    /*
     * === FULL GAMEPACK UPDATE TASK ===
     */
    val updateRevisionGamepack by register("updateRevision") {
        group = "gamepack"
        dependsOn(decompileGamepack)
        doFirst {
            println("Updating Old School RuneScape gamepack revision.")
        }
        doLast {
            println("Successfully updated gamepack.")
        }
    }

    /*
     * === COPY DECOMPILED GAMEPACK SOURCES TO MODULE TASK ===
     */
    val copyDecompiledSourcesGamepack by register("copyDecompiledSources") {
        group = "gamepack"
        doFirst {
            println("!WARNING! This task will overwrite contents in directory 'spectral/internal/gamepack/'!")
            println("Please type \"Yes\" in console to continue.")
            print("\n> ")
            val response = readLine()?.toLowerCase() ?: return@doFirst
            if(response.startsWith("yes") || response.endsWith("yes")) {
                println("Copying decompiled gamepack sources to module.")
                if(gamepackDir.exists()) gamepackDir.deleteRecursively()
                gamepackDir.mkdirs()
                decompDir.listFiles()!!.forEach { srcFile ->
                    if(srcFile.name.contains("bouncycastle")) return@forEach
                    srcFile.copyRecursively(gamepackDir.resolve(srcFile.name), overwrite = true)
                }
                println("Successfully copied gamepack sources.")
            }
        }
    }
}