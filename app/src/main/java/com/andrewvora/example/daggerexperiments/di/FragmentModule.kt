package com.andrewvora.example.daggerexperiments.di

import com.andrewvora.example.daggerexperiments.logger.FragmentLogger
import dagger.Module
import dagger.Provides

/**
 * Created on 11/4/2018.
 */
@Module
class FragmentModule {

    @FragmentScope
    @Provides
    fun providesFragmentLogger(): FragmentLogger {
        return FragmentLogger()
    }
}