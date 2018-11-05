package com.andrewvora.example.daggerexperiments.di

import com.andrewvora.example.daggerexperiments.logger.ActivityLogger
import dagger.Module
import dagger.Provides

/**
 * Created on 11/4/2018.
 */
@Module
class ActivityModule {

    @Provides
    @ActivityScope
    fun providesActivityLogger(): ActivityLogger {
        return ActivityLogger()
    }
}