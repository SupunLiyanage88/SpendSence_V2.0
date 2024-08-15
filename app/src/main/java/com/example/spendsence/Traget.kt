package com.example.spendsence

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Traget : AppCompatActivity() { // Extend AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.target_page)

        val backButton: ImageView = findViewById(R.id.imageView31)
        backButton.setOnClickListener {
            // Navigate back
            onBackPressed()
        }

    }
}