package com.example.assignment_app

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val call = findViewById<Button>(R.id.toCall)

        call.setOnClickListener{
            intent = Intent(Intent.ACTION_DIAL )
            intent.data = Uri.parse("tel:" + "8178460227")
            startActivity(intent)
        }

        val toastButton = findViewById<Button>(R.id.to_Toast)

        toastButton.setOnClickListener{
            intent = Intent(applicationContext , ToastActivity::class.java)
            startActivity(intent)
        }

        val scrollButton = findViewById<Button>(R.id.to_scroll)

        scrollButton.setOnClickListener{
            intent = Intent(applicationContext , SrollActivity::class.java)
            startActivity(intent)
        }

        val expButton = findViewById<Button>(R.id.to_intent1)

        expButton.setOnClickListener{
            intent = Intent(applicationContext , ActivityExplicit::class.java)
            startActivity(intent)
        }

        val impliButton = findViewById<Button>(R.id.to_intent2)

        impliButton.setOnClickListener{
            val intent = Intent(applicationContext , ActivityImplicit::class.java)
            startActivity(intent)
        }

        val btnWebpage = findViewById<Button>(R.id.to_web)

        btnWebpage.setOnClickListener{
            val intent = Intent(applicationContext , ActivityWebview::class.java)
            startActivity(intent)
        }

        val btnLayoutss = findViewById<Button>(R.id.to_lay)

        btnLayoutss.setOnClickListener{
            val intent = Intent(applicationContext , ActivityLayout::class.java)
            startActivity(intent)
        }

        val btnSign = findViewById<Button>(R.id.btnSign)

        btnSign.setOnClickListener{
            val intent = Intent(this, ActivitySignIn::class.java)
            startActivity(intent)
        }

        val btnlogin = findViewById<Button>(R.id.btnLogin)

        btnlogin.setOnClickListener{
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }
    }
}