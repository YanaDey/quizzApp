package com.example.quizzmy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var question0 = 0
    var questionList = listOf("Здесь будет вопрос No1:\n\nA.Вариант 1 \n\nB. Вариант 2 \n\nC. Вариант 3" +
        "Здесь будет вопрос No1:\n\nA.Вариант 1 \n\nB. Вариант 2 \n\nC. Вариант 3")
    var rightAnswer = listOf(2,3)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonA = findViewById<Button>(R.id.button2)
        val buttonB = findViewById<Button>(R.id.button5)
        val buttonC = findViewById<Button>(R.id.button6)

        buttonA.setOnClickListener{
            showToast(1,"")
        }
        buttonB.setOnClickListener{
            showToast(2,"")
        }
        buttonC.setOnClickListener{
            showToast(3,"")
        }
    }

    fun showToast(answer: Int, text: String) {
        if (answer == 1) {
            Toast.makeText(applicationContext, "Правильно", Toast.LENGTH_SHORT).show()
        }else {
            Toast.makeText(applicationContext, "Ответ неверный", Toast.LENGTH_SHORT).show()
        }
    }
}