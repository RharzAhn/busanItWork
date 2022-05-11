package com.example.springconn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.springconn.databinding.ActivityInputBinding
import com.example.springconn.model.UserModel

class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}