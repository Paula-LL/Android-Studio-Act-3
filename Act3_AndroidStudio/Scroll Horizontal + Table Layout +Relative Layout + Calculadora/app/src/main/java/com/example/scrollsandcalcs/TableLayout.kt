package com.example.scrollsandcalcs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TableLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablelayout_layout)

        //(val horizontalScroll = findViewById<Button>(R.id.hScroll);

        /* horizontalScroll.setOnClickListener{
             val horizontalScroll = Intent(this, HorizontalScroll::class.java);
             startActivity(horizontalScroll);
         }*/
    }
}