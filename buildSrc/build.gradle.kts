plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven(url = "https://raw.githubusercontent.com/open-osrs/hosting/master")
}

dependencies {
    implementation("net.runelite:fernflower:07082019")
}