package com.francis.constrainsample.home

import android.view.View
import androidx.navigation.findNavController
import com.francis.constrainsample.R
import com.francis.constrainsample.base.BaseViewModel

class HomeViewModel : BaseViewModel() {


    fun guideLineBtnClick(v: View) {
        v.findNavController().navigate(R.id.guideLineFragment)
    }

    fun barrierBtnClick(v: View) {
        v.findNavController().navigate(R.id.barrierFragment)
    }

    fun baseLineBtnClick(v: View) {
        v.findNavController().navigate(R.id.baseLineFragment)
    }

    fun biasBtnClick(v: View) {
        v.findNavController().navigate(R.id.biasFragment)
    }

    fun goneMarginBtnClick(v: View) {
        v.findNavController().navigate(R.id.goneMargineFragment)
    }

    fun ratioBtnClick(v: View) {
        v.findNavController().navigate(R.id.ratioFragment)
    }

    fun circularPositioningBtnClick(v: View) {
        v.findNavController().navigate(R.id.circularPositioningFragment)
    }

    fun percentDimensionBtnClick(v: View) {
        v.findNavController().navigate(R.id.percentDimensionFragment)
    }

}