package com.jaebin.homework.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jaebin.homework.databinding.FragmentUntactBinding

class UntactFragment:Fragment() {

    private var mBinding : FragmentUntactBinding?=null
    private val binding get() = mBinding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentUntactBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onDestroyView() {
        mBinding =null
        super.onDestroyView()
    }
}