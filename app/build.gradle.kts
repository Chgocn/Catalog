plugins {
    id("com.android.application")
    kotlin("android")
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.kotlin.symbolProcessing)
//    alias(libs.plugins.safeArgs)
//    alias(libs.plugins.kotlin.serialization)
//    alias(libs.plugins.testLogger)
//    alias(libs.plugins.junit5Android)
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "cn.chgocn.catalog.example"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    namespace = "cn.chawloo.versioncontrolplugin"
}

dependencies {
//    api(libs.kotlin)
//    api(libs.playCore)
//    api(libs.coreKtx)
//    api(libs.fragmentKtx)
//    api(libs.viewBindingPropertyDelegate)
//    api(libs.timber)
//    api(libs.constraintLayout)
//    api(libs.appCompat)
//    api(libs.recyclerView)
//    api(libs.coroutines)
//    api(libs.material)
//    api(libs.composeMaterial)
//    api(libs.accompanistFlowLayout)
//    api(libs.bundles.koin)
//    api(libs.bundles.retrofit)
//    api(libs.bundles.navigation)
//    api(libs.bundles.lifecycle)
//    api(libs.bundles.room)
//    api(libs.bundles.compose)
//    api(libs.bundles.rxAndroid)
//    api(libs.bundles.rxAndroid2)
//    api(libs.bundles.smartRefresh)
//    api(libs.bundles.moshi)
//    api(libs.searchLayout)
//    api(libs.roundImageView)
//    api(libs.glideLib)
//    api(libs.picasso)
//    kapt(libs.glideCompiler)
////    api(libs.bundles.search)
////    api(libs.bundles.router)
//    // router
//    api(libs.routerApi)
//    api(libs.wechat)
////    api(libs.alipay)
//    api(libs.bannerViewPager)
//    api(libs.pagerGridLayout)
//    api(libs.ultimateBarX)
//    api(libs.circularImage)
//    api(libs.dateTimePicker)
//    api(libs.pwdEditText)
//    api(libs.pwdKeyBoard)
//    api(libs.agentWeb)
//    api(libs.rxTools)
//    api(libs.imagePicker)
//    api(libs.permission)
//    api(libs.permissionKtx)
//    api(libs.pictureSelector)
//    api(libs.pictureUcrop)
//    api(libs.eventBus)
//    api(libs.bundles.longan)
//    api(libs.bundles.picker)
//    api(libs.photoView)
//    api(libs.gestureView)
//    api(libs.photoPreview)
//    api(libs.zxing)
//    api(libs.zxingEmbedded)
//    api(libs.stateLayout)
//    api(libs.brv)
////    kapt(libs.routerCompiler)
//
//    testImplementation(projects.libraryTestUtils)
//    testImplementation(libs.bundles.test)
//
//    testRuntimeOnly(libs.junitJupiterEngine)
}