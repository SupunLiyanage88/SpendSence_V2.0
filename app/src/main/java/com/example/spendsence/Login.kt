package com.example.spendsence

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() { // Extend AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page) // Ensure this layout exists

        val image_log : ImageView = findViewById(R.id.imageView12)
        image_log.setOnClickListener{
            val intent = Intent(this, Email_Login::class.java)
            startActivity(intent)
        }

        val signupB : TextView = findViewById(R.id.textView12)
        signupB.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        val homeBtn : ImageView = findViewById(R.id.imageView11)
        homeBtn.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

    }



}
