package com.example.kotlinexam

import android.app.Application
import com.example.kotlinexam.di.PrefsModule
import com.example.kotlinexam.util.SharedPreferencesHelper

class PrefsModuleTest(val mockPrefs: SharedPreferencesHelper): PrefsModule() {

    override fun provideSharedPreferences(app: Application): SharedPreferencesHelper {
        return mockPrefs
    }
}