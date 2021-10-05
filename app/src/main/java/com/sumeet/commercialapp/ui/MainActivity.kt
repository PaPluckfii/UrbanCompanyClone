package com.sumeet.commercialapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sumeet.commercialapp.R
import com.sumeet.commercialapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}