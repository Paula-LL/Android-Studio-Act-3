package com.example.scrollsandcalcs

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val horizontalScroll = findViewById<Button>(R.id.hScroll);
        val tableLayout = findViewById<Button>(R.id.tableLayout);
        val calc14Act = findViewById<Button>(R.id.Act14);
        val gridLayout = findViewById<Button>(R.id.gridLayout);
        val linearLayout = findViewById<Button>(R.id.linearLayout);

        horizontalScroll.setOnClickListener{
            val horizontalScroll = Intent(this, HorizontalScroll::class.java);
            startActivity(horizontalScroll);
        }

        tableLayout.setOnClickListener{
            val tableLayout = Intent(this, android.widget.TableLayout::class.java);
            startActivity(tableLayout);
        }

        /*calc14Act.setOnClickListener{
            val calc14Act = Intent(this, android.widget.CalcLayout::class.java);
            startActivity(calc14Act);
        }*/

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