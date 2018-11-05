package com.andrewvora.example.daggerexperiments.network

/**
 * Created on 11/4/2018.
 */
class NetworkClient {
    private var fetches = 0

    fun fetch(): Int {
        println("Fetched!")
        return ++fetches
    }
}