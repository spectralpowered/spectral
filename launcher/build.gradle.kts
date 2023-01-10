plugins {
    application
}

dependencies {
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
}