plugins {
    application
    id("com.ryandens.javaagent-application") version "0.4.2"
}

dependencies {
    javaagent(project(":spectral-launcher"))
    implementation(project(":spectral-commons"))
    implementation(project(":spectral-logger"))
    implementation(project(":spectral-gamepack"))
    implementation(project(":spectral-mixin"))
    implementation(project(":spectral-injector"))
    implementation(project(":spectral-api"))
    implementation(project(":spectral-client"))
    implementation("io.github.classgraph:classgraph:_")
}

application {
    mainClass.set("io.spectralpowered.launcher.Launcher")
}

tasks {
    named<JavaExec>("run") {
        workingDir = rootProject.projectDir
    }

    named<Jar>("jar") {
        manifest {
            attributes["Premain-Class"] = "io.spectralpowered.launcher.Launcher"
            attributes["Can-Redefine-Classes"] = "true"
            attributes["Can-Retransform-Classes"] = "true"
        }
    }
}