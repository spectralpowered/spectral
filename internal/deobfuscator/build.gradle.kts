plugins {
    application
}

dependencies {
    implementation(project(":spectral-logger"))
    implementation(project(":spectral-asm"))
    implementation("me.tongfei:progressbar:_")
    implementation("dev.reimer:progressbar-ktx:_")
}

application {
    mainClass.set("io.spectralpowered.deobfuscator.Deobfuscator")
    tasks.run.get().workingDir = rootProject.projectDir
}