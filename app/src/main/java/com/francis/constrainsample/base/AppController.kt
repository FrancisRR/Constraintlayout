package com.francis.constrainsample.base

import android.app.Application

class AppController : Application() {

    companion object {
        internal lateinit var instance: AppController
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}