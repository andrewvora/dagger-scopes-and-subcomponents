package com.andrewvora.example.daggerexperiments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.andrewvora.example.daggerexperiments.di.ActivityComponent
import com.andrewvora.example.daggerexperiments.di.ActivityModule
import com.andrewvora.example.daggerexperiments.logger.ActivityLogger
import com.andrewvora.example.daggerexperiments.network.NetworkClient
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var networkClient: NetworkClient
    @Inject lateinit var activityLogger: ActivityLogger

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        activityComponent = lastCustomNonConfigurationInstance as? ActivityComponent
                ?: createActivityComponent()
        activityComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun createActivityComponent(): ActivityComponent {
        return (application as MyApplication)
            .appComponent
            .activityComponent(ActivityModule())
    }

    override fun onRetainCustomNonConfigurationInstance(): Any {
        return activityComponent
    }
}
