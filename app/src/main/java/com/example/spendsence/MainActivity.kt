package com.example.spendsence

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.on_board_01)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val startButton = findViewById<Button>(R.id.startbtn)
        startButton.setOnClickListener {
            val intent = Intent(this, on_board02::class.java)
            startActivity(intent)
        }

        val skipbtn1 = findViewById<TextView>(R.id.Skipbtn)
        skipbtn1.setOnClickListener {
            // Navigate to the Login activity when the Skip button is clicked
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}
