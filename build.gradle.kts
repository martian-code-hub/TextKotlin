import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
//    java
//    application
    kotlin("jvm") version "1.6.10"
}

group = "TextKotlin"
version = "1.0-SNAPSHOT"

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.4.32"
//    kotlin_version = "1.2.10"

    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/public")
        }
        maven {
            url = uri("https://maven.aliyun.com/repository/gradle-plugin")
        }
        maven {
            url = uri("https://maven.aliyun.com/repository/google")
        }
        maven {
            url = uri("https://maven.aliyun.com/repository/central")
        }
        maven {
            url = uri("https://maven.aliyun.com/repository/jcenter")
        }
        gradlePluginPortal()
//        jcenter()
//        google()
//        mavenCentral()
    }
    
    dependencies {
//        classpath ("com.android.tools.build:gradle:4.1.3");
//        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version");
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:4.1.2")
    }
    
}

apply {
    plugin("kotlin")
}

val kotlin_version: String by extra

repositories {
    maven {
        url = uri("https://maven.aliyun.com/repository/public")
    }
    maven {
        url = uri("https://maven.aliyun.com/repository/gradle-plugin")
    }
    maven {
        url = uri("https://maven.aliyun.com/repository/google")
    }
    maven {
        url = uri("https://maven.aliyun.com/repository/central")
    }
    maven {
        url = uri("https://maven.aliyun.com/repository/jcenter")
    }
//    mavenCentral()
}

dependencies {
//    compile (kotlinModule("stdlib-jdk8", kotlin_version))
//    compile('org.jetbrains.kotlin:kotlin-stdlib:1.4.32');
//    // 协程核心库
//    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3");
//    // 协程Android支持库
//    compile("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.3");
//    // 协程Java8支持库
//    compile("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.4.3");
    implementation(kotlin("stdlib-jdk8"))
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
//application {
//    mainClass.set("com.martian.kotlin.test.StringUtil")
//}