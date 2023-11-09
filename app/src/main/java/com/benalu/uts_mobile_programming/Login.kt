package com.benalu.uts_mobile_programming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benalu.uts_mobile_programming.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.LoginButton.setOnClickListener {
            val Username = binding.Usernamenya.text.toString()
            val Password = binding.Passwordnya.text.toString()
            val Gagal: String = "Username dan Password Salah"
            if (Username == "admin" && Password == "123") {
                val moveIntent = Intent(this@Login, HitungLuas::class.java)
                startActivity(moveIntent)
            } else {
                binding.Salah.text = Gagal
            }
        }
    }
}