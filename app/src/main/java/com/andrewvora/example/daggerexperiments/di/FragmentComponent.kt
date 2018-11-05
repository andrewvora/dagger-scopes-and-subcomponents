package com.andrewvora.example.daggerexperiments.di

import com.andrewvora.example.daggerexperiments.MainFragment
import dagger.Subcomponent

/**
 * Created on 11/4/2018.
 */
@FragmentScope
@Subcomponent(modules = [FragmentModule::class])
interface FragmentComponent {
    fun inject(fragment: MainFragment)
}