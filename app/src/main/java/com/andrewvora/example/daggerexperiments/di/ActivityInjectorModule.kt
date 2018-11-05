package com.andrewvora.example.daggerexperiments.di

import com.andrewvora.example.daggerexperiments.MainActivity
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector

/**
 * Created on 11/4/2018.
 */
@Module(includes = [AndroidInjectionModule::class])
abstract class ActivityInjectorModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    abstract fun contributeMainActivityInjector(): MainActivity
    
}