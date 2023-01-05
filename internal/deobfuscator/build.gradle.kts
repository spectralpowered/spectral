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

val sourcesJar by tasks.register<Jar>("sourcesJar") {
    from(sourceSets["main"].allJava)
    archiveClassifier.set("sources")
}

val javadocJar by tasks.register<Jar>("javadocJar") {
    dependsOn(tasks.javadoc)
    from(tasks.javadoc.get().destinationDir)
    archiveClassifier.set("javadoc")
}

artifacts {
    add("archives", tasks.jar)
    add("archives", sourcesJar)
    add("archives", javadocJar)
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