package com.example.nutricionalvaluedisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Nutricional Value Display"
        val textView: TextView = findViewById(R.id.textView)
        val text: String ="Hello, let's learn more about nutrients and calories on fruits!"
        textView.text = text
        textView.movementMethod = ScrollingMovementMethod()
    }
}