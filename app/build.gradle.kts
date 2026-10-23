plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.student.kitchenchef"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.student.kitchenchef"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    // Modern arayüz (Compose) sistemini aktif ediyoruz
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
}

dependencies {
    // Uygulamanın çalışması için temel Jetpack Compose kütüphaneleri
    val composeBom = platform("androidx.compose:compose-bom:2024.02.00")
    implementation(composeBom)
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.8.2")

    // --- BİZİM ŞIK TASARIM İÇİN EKLEDİĞİMİZ KÜTÜPHANELER ---
    // 1. İkon Kütüphanesi (Ateş ve saat ikonu için)
    implementation("androidx.compose.material:material-icons-extended")
    // 2. Resim Kütüphanesi (İnternetten yemek fotoğrafları çekmek için Coil)
    implementation("io.coil-kt:coil-compose:2.6.0")
}
