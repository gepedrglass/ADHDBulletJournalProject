package com.r200429840comp3025f23.adhdbulletjournalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.r200429840comp3025f23.adhdbulletjournalproject.databinding.ActivityMainBinding
import com.r200429840comp3025f23.adhdbulletjournalproject.databinding.ActivitySettingsBinding

class Settings : AppCompatActivity() {

    private lateinit var binding : ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.settingsBackButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}