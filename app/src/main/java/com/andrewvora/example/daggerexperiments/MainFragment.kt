package com.andrewvora.example.daggerexperiments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.andrewvora.example.daggerexperiments.logger.FragmentLogger
import com.andrewvora.example.daggerexperiments.network.NetworkClient
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

/**
 * Created on 11/4/2018.
 */
class MainFragment : Fragment() {

    @Inject lateinit var networkClient: NetworkClient
    @Inject lateinit var logger: FragmentLogger

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        fragment_text.text = logger.log("").toString()
    }
}