plugins {
    java
}

dependencies {
    implementation("org.bouncycastle:bcprov-jdk15on:_")
}

tasks {
    compileJava {
        targetCompatibility = "1.8"
        sourceCompatibility = "1.8"
    }
}