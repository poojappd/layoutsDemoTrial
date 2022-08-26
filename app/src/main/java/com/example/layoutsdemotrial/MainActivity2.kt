package com.example.layoutsdemotrial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    val view = findViewById<TextView>(R.id.textView7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
    fun update(){
        view.text = "Changed"
    }

}