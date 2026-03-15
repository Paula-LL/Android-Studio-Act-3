package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculator14Act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_layout)


        val addButton = findViewById<Button>(R.id.addButton);
        val subButton = findViewById<Button>(R.id.subButton);
        val multButton = findViewById<Button>(R.id.multButton);
        val divButton = findViewById<Button>(R.id.divButton);
        val equalButton = findViewById<Button>(R.id.equalButton);

        val firstNumber = findViewById<EditText>(R.id.number1);
        val secondNumber = findViewById<EditText>(R.id.number2);

        val answer = findViewById<TextView>(R.id.answerView);

        addButton.setOnClickListener {
            val result =
                firstNumber.text.toString().toDouble() + secondNumber.text.toString().toDouble()
            equalButton.setOnClickListener{
                answer.text = "Result: $result"
            }
        }

        subButton.setOnClickListener {
            val result =
                firstNumber.text.toString().toDouble() - secondNumber.text.toString().toDouble()
            equalButton.setOnClickListener{
                answer.text = "Result: $result"
            }
        }

        multButton.setOnClickListener {
            val result =
                firstNumber.text.toString().toDouble() * secondNumber.text.toString().toDouble()
            equalButton.setOnClickListener{
                answer.text = "Result: $result"
            }
        }

        divButton.setOnClickListener {
            val val2 = secondNumber.text.toString().toDouble()
            if (val2 != 0.0) {
                val result = firstNumber.text.toString().toDouble() / val2
                equalButton.setOnClickListener{
                    answer.text = "Result: $result"
                }
            } else {
                equalButton.setOnClickListener{
                    answer.text = "Can't be divides by 0."
                }
            }
        }
    }
}