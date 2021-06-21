package com.example.android.helloworld

import android.app.Application
import timber.log.Timber

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.i("MainApplication created!")
    }
}