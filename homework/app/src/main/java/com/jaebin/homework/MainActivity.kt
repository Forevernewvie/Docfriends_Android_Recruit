package com.jaebin.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.jaebin.homework.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private var mBinding: ActivityMainBinding?=null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.nav_host_fragment)
        binding.bottomViewNav.setupWithNavController(navController)
        var badge = binding.bottomViewNav.getOrCreateBadge(R.id.fragment_profile)
        badge.backgroundColor = ContextCompat.getColor(AppContext.instance,R.color.green)
        badge.isVisible=true
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}




