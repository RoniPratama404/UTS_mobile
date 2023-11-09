package com.benalu.uts_mobile_programming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benalu.uts_mobile_programming.databinding.ActivityHitungLuasBinding

class HitungLuas : AppCompatActivity() {
    private lateinit var binding: ActivityHitungLuasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHitungLuasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Hitung.setOnClickListener {
            val panjang = binding.Panjang.text.toString()
            val lebar = binding.Lebar.text.toString()
            val hasil = panjang.toInt() * lebar.toInt()
            binding.Hasil.text = hasil.toString()
        }
        binding.Kembali.setOnClickListener {
            val Kembali = Intent(this@HitungLuas, Login::class.java)
            startActivity(Kembali)
        }
    }
}