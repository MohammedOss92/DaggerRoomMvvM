package com.example.androiddaggerroommvvm.di

import android.app.Application
import android.content.Context
import com.example.androiddaggerroommvvm.database.AppDatabase
import com.example.androiddaggerroommvvm.database.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val application: Application) {

    @Singleton
    @Provides
    fun getUserDao(appDatabase:AppDatabase):UserDao{
        return appDatabase.getUserDao()
    }

    @Singleton
    @Provides
    fun getRoomDbInstance():AppDatabase{
        return AppDatabase.getDatabaseInstance(provideAppContext())
    }

    @Singleton
    @Provides
    fun provideAppContext():Context{
        return application.applicationContext
    }
}