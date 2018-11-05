package com.andrewvora.example.daggerexperiments

import android.app.Activity
import android.app.Application
import com.andrewvora.example.daggerexperiments.di.AppComponent
import com.andrewvora.example.daggerexperiments.di.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created on 11/4/2018.
 * @author Andrew Vorakrajangthiti
 */
class MyApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return activityInjector
    }
}