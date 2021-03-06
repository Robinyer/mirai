import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.30"
    kotlin("plugin.serialization") version "1.5.20"

    id("net.mamoe.mirai-console") version "2.7.0"
    `maven-publish`
    signing
}

group = "online.ruin_of_future"
version = "1.2.11"

repositories {
    maven(url = "https://maven.aliyun.com/repository/public")
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.squareup.okhttp3:okhttp:4.9.2")
    implementation("org.jsoup:jsoup:1.14.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2-native-mt")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.0")
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
//        kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"
        jvmTarget = "11"
    }
}

tasks.withType<JavaCompile>().configureEach {
    sourceCompatibility = "11"
    targetCompatibility = "11"
}
