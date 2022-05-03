package com.example.app11

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app11.databinding.ActivityMainBinding

class Student{

}

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name","홍길동")
            intent.putExtra("age",10)
//            startActivity(intent)
            startActivityForResult(intent,100)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==100 && resultCode==Activity.RESULT_OK){
            binding.tvMain.text=data?.getStringExtra("resultData")
        }
    }
}