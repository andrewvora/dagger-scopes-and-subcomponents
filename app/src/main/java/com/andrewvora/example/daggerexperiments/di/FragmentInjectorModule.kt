package com.andrewvora.example.daggerexperiments.di

import com.andrewvora.example.daggerexperiments.MainFragment
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created on 11/4/2018.
 */
@Module(includes = [AndroidSupportInjectionModule::class])
abstract class FragmentInjectorModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributesMainFragmentInjector(): MainFragment
}