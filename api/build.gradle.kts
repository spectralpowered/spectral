plugins {
    `maven-publish`
}

dependencies {
    api(project(":spectral-commons"))
    api(project(":spectral-util"))
    api(project(":spectral-logger"))
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