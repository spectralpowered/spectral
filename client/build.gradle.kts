plugins {
    application
}

dependencies {
    implementation(project(":spectral-logger"))
    implementation(project(":spectral-commons"))
    implementation(project(":spectral-util"))
    implementation("com.formdev:flatlaf:_")
    implementation("com.formdev:flatlaf-intellij-themes:_")
    implementation("com.miglayout:miglayout-swing:_")
}

application {
    mainClass.set("io.spectralpowered.client.SpectralKt")
}