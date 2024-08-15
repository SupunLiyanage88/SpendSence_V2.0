package com.example.spendsence

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val targetPage: ImageView = findViewById(R.id.imageView33)
        targetPage.setOnClickListener {
            val intent = Intent(this, Traget::class.java)
            startActivity(intent)
        }
    }
}
