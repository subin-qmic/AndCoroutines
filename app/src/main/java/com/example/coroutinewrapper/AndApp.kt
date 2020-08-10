package com.example.coroutinewrapper

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes



class AndApp : Application() {

    override fun onCreate() {
        super.onCreate()

        AppCenter.start(
            this, "7ab0e147-88b6-4fcc-89ad-e5ab37e90821",
            Analytics::class.java, Crashes::class.java
        )
    }
}