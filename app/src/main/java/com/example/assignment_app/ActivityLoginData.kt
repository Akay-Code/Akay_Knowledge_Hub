package com.example.assignment_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityLoginData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_data)

        val details = intent.getStringArrayListExtra(ActivityLogin.KEY )
        val email = details?.get(0).toString()
        val name = details?.get(1).toString()
        val id = details?.get(2).toString()

        val welcomeText = findViewById<TextView>(R.id.textViewWelcome)
        welcomeText.text = "Welcome \n $name 😊"

        val idText = findViewById<TextView>(R.id.textViewUserName)
        idText.text = "UserId \n $id"

        val emailText = findViewById<TextView>(R.id.textViewUserEmail)
        emailText.text = "User Email Id \n $email"
    }
}