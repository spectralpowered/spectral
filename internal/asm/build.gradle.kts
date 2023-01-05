plugins {
    `maven-publish`
}

dependencies {
    api(project(":spectral-util"))
    api("org.ow2.asm:asm:_")
    api("org.ow2.asm:asm-commons:_")
    api("org.ow2.asm:asm-util:_")
    api("org.ow2.asm:asm-tree:-")
    api("com.google.guava:guava:_")
    api("com.github.spectralpowered:maple-ir:63e94212fd")
    api("org.jgrapht:jgrapht-core:_")
}

publishing {
    repositories {
        mavenLocal()
        maven(url = "https://maven.spectralpowered.io") {
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