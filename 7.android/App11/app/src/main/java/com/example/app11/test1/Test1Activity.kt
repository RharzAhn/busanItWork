package com.example.app11.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.app11.DetailActivity
import com.example.app11.R
import com.example.app11.databinding.ActivityTest1Binding

class Test1Activity : AppCompatActivity() {
    lateinit var binding:ActivityTest1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val requestLauncher:ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){
            val resultData=it.data?.getStringExtra("resultData")
            binding.tvLauncher.text="result:$resultData"
        }

        binding.btnOpen.setOnClickListener {
            val intent=Intent(this, DetailActivity::class.java)
                intent.putExtra("name","홍길동")
            intent.putExtra("age",10)
            requestLauncher.launch(intent)

        }
    }
}