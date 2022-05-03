package com.example.app11.test2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app11.R
import com.example.app11.databinding.ActivityTest2Binding

class Test2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"))
//            val intent= Intent("ACTION_DIAL",Uri.parse("010-1111-0129"))
//            intent.action="ACTION_VIEW"
//            intent.data= Uri.parse("http://www.google.com")
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW,Uri.parse("geo:37.77,127.41"))
//            intent.action="ACTION_VIEW"
//            intent.data= Uri.parse("http://www.google.com")
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

    }
}