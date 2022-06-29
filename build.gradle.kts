plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    id("maven-publish")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    implementation(libs.kotlinx.serialization.core)
}

publishing {
    publications {
        create<MavenPublication>("core") {
            groupId = "com.practice.network-entities"
            artifactId = "core"
            version = "1.0"

            from(components["java"])
            artifact(tasks.kotlinSourcesJar)
        }
    }
}