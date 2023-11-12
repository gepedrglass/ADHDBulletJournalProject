package com.r200429840comp3025f23.adhdbulletjournalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.r200429840comp3025f23.adhdbulletjournalproject.databinding.ActivityCreateTaskBinding
import com.r200429840comp3025f23.adhdbulletjournalproject.databinding.ActivityMainBinding

class CreateTask : AppCompatActivity() {

    private lateinit var binding : ActivityCreateTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}