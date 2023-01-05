plugins {
    java
}

dependencies {
    implementation("org.bouncycastle:bcprov-jdk15on:_")
    implementation("org.json:json:_")
}

tasks.compileJava {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
}