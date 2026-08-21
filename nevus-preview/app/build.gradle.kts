plugins {
    id("com.android.application")
}

android {
    namespace = "com.nevus.rcpreview02"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.nevus.rcpreview02"
        minSdk = 24
        targetSdk = 36
        versionCode = 2
        versionName = "0.2.0-preview"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
