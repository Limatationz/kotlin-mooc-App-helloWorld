package com.example.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.android.helloworld.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Timber.i("MainActivity created!")

        binding.changeTextButton.setOnClickListener {
            if(binding.helloTextView.text == getString(R.string.hello_android))
                binding.helloTextView.text = getString(R.string.hello_kotlin)
            else
                binding.helloTextView.text = getString(R.string.hello_android)
        }
    }
}