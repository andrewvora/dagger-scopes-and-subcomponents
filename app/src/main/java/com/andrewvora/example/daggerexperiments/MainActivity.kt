package com.andrewvora.example.daggerexperiments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.andrewvora.example.daggerexperiments.logger.ActivityLogger
import com.andrewvora.example.daggerexperiments.network.NetworkClient
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject lateinit var networkClient: NetworkClient
    @Inject lateinit var activityLogger: ActivityLogger
    @Inject lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        activity_text.text = networkClient.fetch().toString()
        activity_text.text = activityLogger.log("").toString()
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentInjector
    }
}
