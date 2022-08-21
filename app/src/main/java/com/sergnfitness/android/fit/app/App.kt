package com.sergnfitness.android.fit.app

import android.app.Application
import com.sergnfitness.android.fit.di.AppComponent
import com.sergnfitness.android.fit.di.AppModule
import com.sergnfitness.android.fit.di.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

    appComponent = DaggerAppComponent
        .builder()
        .appModule(AppModule(context = this))
        .build()

    }
}