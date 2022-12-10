plugins {
    kotlin("jvm")
}

object Spectral {

}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "io.spectralpowered"
    version = "0.1.0"

    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation(kotlin("reflect"))
        testImplementation(kotlin("test"))
    }

    tasks {
        compileKotlin {
            kotlinOptions.jvmTarget = "17"
        }
    }
}