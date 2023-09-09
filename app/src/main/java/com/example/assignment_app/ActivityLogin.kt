package com.example.assignment_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ActivityLogin : AppCompatActivity() {

    lateinit var databaseReference: DatabaseReference
    companion object {
        const val KEY = "com.example.assignment_app.ActivityLogin.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginBtn = findViewById<Button>(R.id.btnSignIn)
        val username = findViewById<TextInputEditText>(R.id.ipLoginID)

        loginBtn.setOnClickListener {
            // take reference till node "USERS" in database
            val userId = username.text.toString()

            if(userId.isNotEmpty()){
                readData(userId)
            }
            else{
                Toast.makeText(this, "Please enter your login ID", Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun readData(userId: String) {
        databaseReference = FirebaseDatabase.getInstance().getReference("Users")
        databaseReference.child(userId).get().addOnSuccessListener {

            // user exists or not
            if(it.exists()){
                val email = it.child("email").value.toString()
                val name = it.child("name").value.toString()
                val id = it.child("id").value.toString()

                val userDetails = arrayListOf(email, name, id)

                val intentLoginDetails = Intent(this, ActivityLoginData::class.java)
                intentLoginDetails.putExtra(KEY, userDetails)
                startActivity(intentLoginDetails)

            }
            else{
                Toast.makeText(this, "User not found", Toast.LENGTH_SHORT).show()
            }

        }.addOnFailureListener {
            Toast.makeText(this,"Failed!" , Toast.LENGTH_SHORT).show()
        }
    }
}