package com.r200429840comp3025f23.adhdbulletjournalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.r200429840comp3025f23.adhdbulletjournalproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}