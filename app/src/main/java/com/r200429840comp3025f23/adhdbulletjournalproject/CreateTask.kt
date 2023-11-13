package com.r200429840comp3025f23.adhdbulletjournalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
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

        //submitting task data to cloud firestore database
        binding.createTaskSubmitBtn.setOnClickListener {
            var taskTitle = binding.createTaskTitleEditText.text.toString()
            var taskNotes = binding.createTextNotesMultilineText.toString()
            var taskDate = binding.createTaskDateEditText.toString()


            if (taskTitle.isNotEmpty() &&
                taskNotes.isNotEmpty())
            {
                //create an instance of a task
                var task = Task(taskDate, taskTitle, taskNotes)

                // connect to Firebase-Firestore database
                val db = FirebaseFirestore.getInstance().collection("tasks")

                // get a unique ID from firestore
                task.id = db.document().getId()

                // save new Task object to the DB using a unique ID
                db.document().set(task)
                    .addOnSuccessListener { Toast.makeText(this, "DB Updated", Toast.LENGTH_LONG).show()}
                    .addOnFailureListener {exception ->
                        Toast.makeText(this, "Error Writing to DB",Toast.LENGTH_LONG).show()
                        Log.w("DB issue", exception.localizedMessage)
                    }

            }
            else
                Toast.makeText(this, "Both name and descripton must have values", Toast.LENGTH_LONG).show()
        }

    }
}