package com.example.lab4.test02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.lab4.R

class Test02Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test02)
        val etId:EditText=findViewById(R.id.editId)
        val edPassword:EditText=findViewById(R.id.editPassword)
    }
}