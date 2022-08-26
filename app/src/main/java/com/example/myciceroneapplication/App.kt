package com.example.myciceroneapplication

import android.app.Application
import com.github.terrakok.cicerone.Cicerone

class App : Application() {
    companion object{
        lateinit var instance: App
    }

    private val cicerone = Cicerone.create()
    val navigatorHolder = cicerone.getNavigatorHolder()
    val router = cicerone.router

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}