package com.example.app11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app11.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnFinish.setOnClickListener {
            finish()
        }
    }
}