package com.francis.constrainsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.francis.constrainsample.base.BaseFragment

class GoneMargineFragment : BaseFragment() {

    private val TAG by lazy { GoneMargineFragment::class.java.simpleName }
    private var parentView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        parentView = inflater.inflate(R.layout.gone_margine, container, false)
        return parentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}