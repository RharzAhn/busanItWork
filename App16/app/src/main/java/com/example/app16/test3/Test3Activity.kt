package com.example.app16.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.app16.R
import com.example.app16.databinding.ActivityTest3Binding

class Test3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityTest3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val url="https://miro.medium.com/max/1190/1*p-0IZQkJk5CuCzt6FdfhGA.png"

        Glide.with(this)
            .load(url)
            .override(500,500)
            .placeholder(R.drawable.loading)
            .error(R.drawable.error)
            .into(binding.imageView2)
    }
}