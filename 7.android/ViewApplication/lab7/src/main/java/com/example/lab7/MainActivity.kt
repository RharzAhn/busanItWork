package com.example.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var flag=false
        var flag2=false
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            if(flag){
                binding.tv1.text=getString(R.string.txt_data2)
                flag=true
            }else{
                binding.tv1.text=getString(R.string.txt_data1)
                flag=false
            }
        }
        binding.button2.setOnClickListener {
            if(flag2){
                binding.imageView.setImageResource(R.drawable.gradient_drawable)
                flag2=false
            }else{
                binding.imageView.setImageResource(R.drawable.drawble_rect)
                flag2=true
            }
        }
    }
}