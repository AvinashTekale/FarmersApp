package com.example.farmerapp

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.RawContacts.Data
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.farmerapp.databinding.ActivityLoginBinding
import com.example.farmerapp.databinding.ActivitySignUp2Binding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference

class SignUpActivity2 : AppCompatActivity(){
    private lateinit var auth:FirebaseAuth
    private lateinit var email:String
    private lateinit var password : String
    private lateinit var userName :String
    private lateinit var nameOfResFarmer:String
    private lateinit var database:DatabaseReference




    private val binding: ActivitySignUp2Binding by lazy {
        ActivitySignUp2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.AlreadyHave.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }

    }
}