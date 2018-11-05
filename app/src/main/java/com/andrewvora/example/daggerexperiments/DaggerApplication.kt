package com.andrewvora.example.daggerexperiments

import android.app.AppComponentFactory
import android.app.Application
import com.andrewvora.example.daggerexperiments.di.AppComponent
import com.andrewvora.example.daggerexperiments.di.DaggerAppComponent

/**
 * Created on 11/4/2018.
 * @author Andrew Vorakrajangthiti
 */
class DaggerApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().build()
    }
}