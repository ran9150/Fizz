plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}
android {
    namespace = "com.example"
    compileSdk = 36
    defaultConfig {
        applicationId = "com.aistudio.fizz.wkqz"
        minSdk = 24
        targetSdk = 36
    }
}