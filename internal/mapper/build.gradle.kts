plugins {
    application
    `maven-publish`
}

dependencies {
    implementation(project(":spectral-asm"))
    implementation(project(":spectral-commons"))
    implementation(project(":spectral-util"))
    implementation(project(":spectral-logger"))
}

java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    repositories {
        mavenLocal()
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