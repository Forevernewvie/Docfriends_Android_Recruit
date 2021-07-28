package com.jaebin.homework.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jaebin.homework.databinding.FragmentConsultBinding

class ConsultFragment :Fragment(){


    private var mBinding : FragmentConsultBinding?=null
    private val binding get() = mBinding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentConsultBinding.inflate(inflater,container,false)
        return binding.root


    }


    override fun onDestroyView() {
        mBinding =null
        super.onDestroyView()
    }

}