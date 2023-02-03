package com.example.quizzmy

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val button_Exit = findViewById<Button>(R.id.button_Exit)
        val button_Start = findViewById<Button>(R.id.button)

        button_Exit.setOnClickListener(this::exitApp)
        button_Start.setOnClickListener(this::startNew)
    }

    fun startNew(View: View) {
        val intent = Intent(this, SecondActivity:: class.java)
        startActivity(intent)
    }


    fun exitApp(View: View) {
        finish()
    }
}
