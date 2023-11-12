package com.r200429840comp3025f23.adhdbulletjournalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.r200429840comp3025f23.adhdbulletjournalproject.databinding.ActivityMainBinding

//All activities in android are a type of AppCompatActivity, they're subclasses.
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.MainCreateTaskButton.setOnClickListener {
            startActivity(Intent(this, CreateTask::class.java))
        }

        Log.i("Lifecycle", "MainActiviy.OnCreate() Called")
    }
}