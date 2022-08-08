package com.example.androiddaggerroommvvm

import android.app.Application
import com.example.androiddaggerroommvvm.di.AppComponent
import com.example.androiddaggerroommvvm.di.AppModule
import com.example.androiddaggerroommvvm.di.DaggerAppComponent

class MyApp : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    fun getAppComponent():AppComponent{
        return appComponent
    }
}