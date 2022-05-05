package com.example.games_kotlin_ui_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.games_kotlin_ui_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)
    }
}