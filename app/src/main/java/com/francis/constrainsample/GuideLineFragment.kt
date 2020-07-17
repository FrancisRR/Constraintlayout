package com.francis.constrainsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.Guideline
import com.francis.constrainsample.base.BaseFragment

class GuideLineFragment:BaseFragment() {

    private val TAG by lazy { Guideline::class.java.simpleName }
    private var parentView:View?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        parentView=inflater.inflate(R.layout.guide_line,container,false)
        return parentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}