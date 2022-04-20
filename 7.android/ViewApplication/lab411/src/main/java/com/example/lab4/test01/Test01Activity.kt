package com.example.lab4.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.lab4.R

class Test01Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_test01)
        val button: Button =findViewById(R.id.btn1)
        val tv=findViewById<TextView>(R.id.tv1)
        button.setOnClickListener(View.OnClickListener {
        tv.setText("Android world")})
    }
}