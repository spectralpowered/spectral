plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    implementation("org.jboss.windup.decompiler:decompiler-fernflower:2.3.0.Final")
}