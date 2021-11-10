package com.example.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.i("MainActivity created!")

        val button = findViewById<Button>(R.id.changeText_button)
        val textView = findViewById<TextView>(R.id.hello_textView)

        button.setOnClickListener { textView.text = "Hello Kotlin" }
    }
}
