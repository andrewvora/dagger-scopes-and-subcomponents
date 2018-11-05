package com.andrewvora.example.daggerexperiments.di

import com.andrewvora.example.daggerexperiments.network.NetworkClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created on 11/4/2018.
 */
@Module
class AppModule {

    @Singleton
    @Provides
    fun providesNetworkClient(): NetworkClient {
        return NetworkClient()
    }
}