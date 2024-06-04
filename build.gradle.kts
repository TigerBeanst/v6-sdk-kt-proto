plugins {
    kotlin("jvm") version "1.9.23"
    id("com.squareup.wire") version "5.0.0-alpha01"
}

group = "fail.tiger"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
wire {
    kotlin {}
}