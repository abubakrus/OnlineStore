package com.example.onlinestore.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlinestore.R

class MainActivity : AppCompatActivity() {
    private val binding by lazy {

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}