plugins {
    application
    `maven-publish`
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

publishing {
    repositories {
        mavenLocal()
        maven(url = "https://maven.pkg.github.com/spectralpowered/spectral") {
            authentication {
                create<BasicAuthentication>("basic")
            }
            credentials {
                username = System.getenv("MAVEN_USERNAME")
                password = System.getenv("MAVEN_PASSWORD")
            }
        }
    }

    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()
            from(components["java"])
        }
    }
}

artifacts {
    add("archives", tasks.jar)
}