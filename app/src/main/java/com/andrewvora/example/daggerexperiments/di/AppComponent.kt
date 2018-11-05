package com.andrewvora.example.daggerexperiments.di

import com.andrewvora.example.daggerexperiments.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created on 11/4/2018.
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun activityComponent(module: ActivityModule): ActivityComponent
}