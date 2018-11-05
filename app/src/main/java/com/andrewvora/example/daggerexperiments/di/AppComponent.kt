package com.andrewvora.example.daggerexperiments.di

import com.andrewvora.example.daggerexperiments.MyApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * Created on 11/4/2018.
 */
@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ActivityInjectorModule::class,
    FragmentInjectorModule::class,
    AppModule::class])
interface AppComponent : AndroidInjector<MyApplication>