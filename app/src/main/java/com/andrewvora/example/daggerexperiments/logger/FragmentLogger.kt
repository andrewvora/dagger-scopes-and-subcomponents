package com.andrewvora.example.daggerexperiments.logger

/**
 * Created on 11/4/2018.
 */
class FragmentLogger {
    private var logs = 0

    fun log(s: String): Int {
        println(s)
        return ++logs
    }
}