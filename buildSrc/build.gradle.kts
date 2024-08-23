plugins {
    `kotlin-dsl`
}

repositories {
    mavenLocal()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("com.github.jmongard:git-semver-plugin:0.12.10")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.3.3")
}