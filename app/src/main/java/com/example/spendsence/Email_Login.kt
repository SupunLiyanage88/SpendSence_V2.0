package com.example.spendsence

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Email_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.email_login)

        val backButton: ImageView = findViewById(R.id.imageView8)
        backButton.setOnClickListener {
            // Navigate back
            onBackPressed()
        }
    }
}