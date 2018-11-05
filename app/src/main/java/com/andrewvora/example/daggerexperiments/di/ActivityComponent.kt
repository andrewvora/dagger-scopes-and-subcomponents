package com.andrewvora.example.daggerexperiments.di

import com.andrewvora.example.daggerexperiments.MainActivity
import dagger.Subcomponent

/**
 * Created on 11/4/2018.
 */
@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun fragmentComponent(module: FragmentModule): FragmentComponent
}