plugins {
    application
}

dependencies {
    implementation(project(":spectral-logger"))
    api(project(":spectral-asm"))
}

application {
    mainClass.set("io.spectralpowered.injector")
}