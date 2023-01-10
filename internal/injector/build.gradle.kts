plugins {
    application
}

dependencies {
    implementation(project(":spectral-logger"))
    implementation(project(":spectral-asm"))
    implementation("io.github.classgraph:classgraph:_")
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
            "build/libs/gamepack.injected.jar"
        )
    }

    register("injectGamepack") {
        dependsOn(getByName("run"))
        group = "gamepack"
    }
}