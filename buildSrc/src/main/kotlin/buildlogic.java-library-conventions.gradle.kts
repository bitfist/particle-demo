plugins {
    java
    `java-library`
}

val libs = the<org.gradle.accessors.dm.LibrariesForLibs>()

repositories {
    mavenCentral()
    mavenLocal()
}

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    testImplementation(libs.junit)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation(libs.mockito)
}

tasks.test {
    useJUnitPlatform()
}