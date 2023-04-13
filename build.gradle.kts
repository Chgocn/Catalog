buildscript {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven(url = "https://maven.aliyun.com/repository/central")
        maven(url = "https://maven.aliyun.com/repository/public")
        maven(url = "https://maven.aliyun.com/repository/google")
        maven(url = "https://maven.aliyun.com/repository/gradle-plugin")
        maven(url = "https://jitpack.io")
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
        classpath("com.alibaba:arouter-register:1.0.2")
        classpath(kotlin("gradle-plugin", version = "1.8.10"))
    }
}
task<Delete>("clean") {
    group = "build"
    delete(rootProject.buildDir)
}