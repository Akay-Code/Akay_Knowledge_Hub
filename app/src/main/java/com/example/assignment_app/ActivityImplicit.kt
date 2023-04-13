package com.example.assignment_app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class ActivityImplicit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit)

        val openCam = findViewById<Button>(R.id.btnToCam)

        openCam.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        val openWebpage = findViewById<Button>(R.id.btnToWebsite)

        openWebpage.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data =Uri.parse("https://developer.android.com/guide/components/intents-filters")
            startActivity(intent)
        }


    }
}