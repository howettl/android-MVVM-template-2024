plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hiltAndroidGradlePlugin)
    alias(libs.plugins.roomPlugin)
}

android {
    namespace = "com.howettl.mvvmtemplate2024"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.howettl.mvvmtemplate2024"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.10"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    room {
        schemaDirectory("$projectDir/schemas")
    }

    ksp {
        arg("room.generateKotlin", "true")
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofitMoshiConverter)

    // hilt
    implementation(libs.hiltAndroid)
    ksp(libs.hiltGradlePlugin)
    ksp(libs.hiltAndroidCompiler)
    ksp(libs.hiltCompiler)
    implementation(libs.hiltNavCompose)

    // room
    implementation(libs.roomRuntime)
    ksp(libs.roomCompiler)
    implementation(libs.roomExtensions)

    // compose navigation
    implementation(libs.composeNavigation)

    // moshi
    implementation(libs.moshi)
    ksp(libs.moshiCodegen)

    // Timber
    implementation(libs.timber)

    // mockk
    testImplementation(libs.mockk)
}