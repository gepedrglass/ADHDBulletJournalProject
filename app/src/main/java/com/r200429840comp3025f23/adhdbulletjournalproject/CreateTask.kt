package com.r200429840comp3025f23.adhdbulletjournalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.r200429840comp3025f23.adhdbulletjournalproject.databinding.ActivityCreateTaskBinding
import com.r200429840comp3025f23.adhdbulletjournalproject.databinding.ActivityMainBinding

class CreateTask : AppCompatActivity() {

    private lateinit var binding : ActivityCreateTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Binds the "Cancel" button to the main activity.
        binding.createTaskCancelBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.createTaskSubmitBtn.setOnClickListener {
            if (binding.createTaskTitleEditText.text.toString().isNotEmpty() &&
                binding.createTextNotesMultilineText.toString().isNotEmpty())
            {

            }
            else
                Toast.makeText(this, "Both name and descripton must have values", Toast.LENGTH_LONG).show()
        }

    }
}