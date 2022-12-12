plugins {
    java
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

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}