package com.example.spendsence

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class on_board03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.on_board_03) // Ensure this layout exists

        val loginB: Button = findViewById(R.id.button2)
        loginB.setOnClickListener {
            val intent = Intent(this, Login::class.java) // Navigate to Login activity
            startActivity(intent)
        }
    }
}
