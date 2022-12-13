plugins {
    application
}

dependencies {
    implementation(project(":spectral-logger"))
    implementation(project(":spectral-asm"))
}

application {
    mainClass.set("io.spectralpowered.deobfuscator.DeobfuscatorKt")
    tasks.run.get().workingDir = rootProject.projectDir
}