package com.example.assignment_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlin.math.sign

class ActivitySignIn : AppCompatActivity() {
    lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

//        //declaring variables
        val signup = findViewById<Button>(R.id.btnSignUp)

        val loginId = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.inputloginID)
        val ipName = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.inputName)
        val ipEmail = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.inputEmail)
        val ipPassword = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.inputPassword)


        signup.setOnClickListener {
            val id = loginId.text.toString()
            val name = ipName.text.toString()
            val email = ipEmail.text.toString()
            val password = ipPassword.text.toString()

            //using our class
            val user = UserDatabase(id, name, email, password)

            //creating a reference to the database upto Users , also makeing a database class
            database = FirebaseDatabase.getInstance().getReference("Users")

            //adding the user to the database
            database.child(id).setValue(user).addOnSuccessListener {
                //generate a toast message of success addition to database
                loginId.text?.clear()
                ipName.text?.clear()
                ipEmail.text?.clear()
                ipPassword.text?.clear()

                Toast.makeText(this, "User Added", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener{
                //generate a toast message of failure addition to database
                Toast.makeText(this, "User Not Added", Toast.LENGTH_SHORT).show()
            }
        }

    }


}