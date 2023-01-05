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