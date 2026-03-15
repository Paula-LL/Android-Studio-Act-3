package com.example.layouts13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tableLayout = findViewById<Button>(R.id.tableLayout);
        val gridLayout = findViewById<Button>(R.id.gridLayout);
        val linearLayout = findViewById<Button>(R.id.linearLayout);

        tableLayout.setOnClickListener{
            val tableLayout = Intent(this, android.widget.TableLayout::class.java);
            startActivity(tableLayout);
        }

        gridLayout.setOnClickListener{
            val gridLayout = Intent(this, android.widget.GridLayout::class.java);
            startActivity(gridLayout);
        }

        linearLayout.setOnClickListener{
            val linearLayout = Intent(this, android.widget.LinearLayout::class.java);
            startActivity(linearLayout);
        }

    }
}