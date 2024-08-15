package com.example.spendsence

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class on_board02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.on_board_02)


        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {

            val intent = Intent(this, on_board03::class.java)
            startActivity(intent)
        }

            val skipbtn2 = findViewById<TextView>(R.id.textView3)
            skipbtn2.setOnClickListener {
                // Navigate to the Login activity when the Skip button is clicked
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
            }
    }
}
