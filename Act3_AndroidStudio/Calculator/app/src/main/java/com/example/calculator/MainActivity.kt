package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcButton = findViewById<Button>(R.id.calculatorAct);

        calcButton.setOnClickListener{
            val calcButton = Intent(this, Calculator14Act::class.java);
            startActivity(calcButton);
        }

    }
}