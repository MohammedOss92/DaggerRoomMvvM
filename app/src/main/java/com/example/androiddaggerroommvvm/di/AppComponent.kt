package com.example.androiddaggerroommvvm.di

import com.example.androiddaggerroommvvm.MainActivityViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(mainActivityViewModel: MainActivityViewModel)
}