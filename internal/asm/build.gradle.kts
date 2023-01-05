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