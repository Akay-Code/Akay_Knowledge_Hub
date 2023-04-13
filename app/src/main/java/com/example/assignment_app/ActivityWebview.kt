package com.example.assignment_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityWebview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val openLeetcode = findViewById<Button>(R.id.btnToLeet)

        openLeetcode.setOnClickListener{
            val intent = Intent(applicationContext , activityopenWeb::class.java)
            startActivity(intent)
        }
    }

}