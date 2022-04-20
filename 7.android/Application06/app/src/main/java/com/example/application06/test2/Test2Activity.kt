package com.example.application06.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.application06.R
import com.example.application06.databinding.ActivityTest1Binding
import com.example.application06.databinding.ActivityTest2Binding

class Test2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityTest2Binding
        super.onCreate(savedInstanceState)
        binding= ActivityTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_test2)
    }
}