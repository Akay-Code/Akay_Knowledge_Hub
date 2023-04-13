package com.example.assignment_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ToastActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        val btnUp = findViewById<Button>(R.id.btnUpload)

        btnUp.setOnClickListener{
            Toast.makeText(applicationContext, "Uploading... ", Toast.LENGTH_SHORT).show()
        }

        val btnDown = findViewById<Button>(R.id.btnDownload)

        btnDown.setOnClickListener{
            Toast.makeText(applicationContext , "Downloading..." , Toast.LENGTH_SHORT).show()
        }

        val btnLoad = findViewById<Button>(R.id.btnLoad)

        btnLoad.setOnClickListener{
            Toast.makeText(applicationContext , "Loading , Please Wait !" , Toast.LENGTH_SHORT).show()
        }


    }
}