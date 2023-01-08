plugins {
    java
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.bouncycastle:bcprov-jdk15on:_")
    implementation("org.json:json:_")
}

tasks.compileJava {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
}

tasks.register<JavaExec>("runGamepack") {
    group = "gamepack"
    mainClass.set("GamepackLauncher")
    classpath = sourceSets["main"].runtimeClasspath
}