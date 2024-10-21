plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.misoft.listadeusuarios"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.misoft.listadeusuarios"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat) // androidx.appcompat:appcompat
    implementation(libs.material) // com.google.android.material:material
    implementation(libs.activity) // androidx.activity:activity
    implementation(libs.constraintlayout) // androidx.constraintlayout:constraintlayout

    // Dependencias para ViewModel y LiveData
    implementation("androidx.lifecycle:lifecycle-viewmodel:2.6.0")  // ViewModel
    implementation("androidx.lifecycle:lifecycle-livedata:2.6.0")   // LiveData (opcional)

    testImplementation(libs.junit) // junit:junit
    androidTestImplementation(libs.ext.junit) // androidx.test.ext:junit
    androidTestImplementation(libs.espresso.core) // androidx.test.espresso:espresso-core
}
