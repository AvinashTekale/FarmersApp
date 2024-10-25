package com.example.farmerapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.farmerapp.databinding.ActivityLoginBinding
import com.example.farmerapp.databinding.ActivityStartBinding

class LoginActivity : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState:  Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        // Set the content view using the binding root


        // Set an OnClickListener for the nextButton
        binding.Login.setOnClickListener {
            val intent = Intent(this, SignUpActivity2::class.java)
            startActivity(intent)


        }
        binding.Create.setOnClickListener {
            val intent = Intent(this, SignUpActivity2::class.java)
            startActivity(intent)


        }
    }
}