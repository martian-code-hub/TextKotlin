import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "TextKotlin"
version = "1.0-SNAPSHOT"

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.10"

    repositories {
//        maven { url 'https://maven.aliyun.com/repository/public'}
//        maven { url 'https://maven.aliyun.com/repository/gradle-plugin' }
//        maven { url 'https://maven.aliyun.com/repository/google' }
//        maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
        mavenCentral()
    }
    
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
    }
    
}

apply {
    plugin("kotlin")
}

val kotlin_version: String by extra

repositories {
//    maven { url 'https://maven.aliyun.com/repository/public'}
//    maven { url 'https://maven.aliyun.com/repository/gradle-plugin' }
//    maven { url 'https://maven.aliyun.com/repository/google' }
//    maven { url 'http://maven.aliyun.com/nexus/content/groups/public/' }
    mavenCentral()
}

dependencies {
    compile(kotlinModule("stdlib-jdk8", kotlin_version))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

