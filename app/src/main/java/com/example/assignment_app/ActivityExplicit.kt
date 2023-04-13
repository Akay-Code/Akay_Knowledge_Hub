package com.example.assignment_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityExplicit : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

        val btnToast = findViewById<Button>(R.id.btnToToast)
        btnToast.setOnClickListener{
            intent = Intent(applicationContext , ToastActivity::class.java)
            startActivity(intent)
        }

        val btnScroll = findViewById<Button>(R.id.btnToScroll)
        btnScroll.setOnClickListener{
            intent = Intent(applicationContext , SrollActivity::class.java)
            startActivity(intent)
        }
    }

}