package com.francis.constrainsample.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.francis.constrainsample.base.BaseFragment
import com.francis.constrainsample.databinding.HomeFragmentBinding

class HomeFrament : BaseFragment() {

    private val TAG by lazy { HomeFrament::class.java.simpleName }
    private var parentView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binder = HomeFragmentBinding.inflate(inflater, container, false)
        val viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binder.homeViewModel = viewModel
        binder.lifecycleOwner = this
        parentView = binder.root
        return parentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}