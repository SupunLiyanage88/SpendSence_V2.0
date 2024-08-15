package com.example.spendsence

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.signup_page)

            val backButton: TextView = findViewById(R.id.login_btn_S)
            backButton.setOnClickListener {
                // Navigate back
                onBackPressed()
            }

        }


}