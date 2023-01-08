plugins {
    application
}

dependencies {
    implementation(project(":spectral-logger"))
    implementation(project(":spectral-asm"))
}

application {
    mainClass.set("io.spectralpowered.injector.Injector")
}

tasks {
    named<JavaExec>("run") {
        workingDir = rootProject.projectDir
        args = listOf(
            "internal/gamepack/build/libs/spectral-gamepack-$version.jar",
            "internal/mixin/build/libs/spectral-mixin-$version.jar",
            "internal/injector/build/libs/gamepack.injected.jar"
        )
    }

    register("injectGamepack") {
        dependsOn(project(":spectral-gamepack").tasks.jar)
        dependsOn(project(":spectral-mixin").tasks.jar)
        dependsOn(named<JavaExec>("run"))
        group = "gamepack"
    }
}