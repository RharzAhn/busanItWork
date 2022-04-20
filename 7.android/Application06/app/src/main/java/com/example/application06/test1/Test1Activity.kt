package com.example.application06.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.application06.R
import com.example.application06.databinding.ActivityTest1Binding

class Test1Activity : AppCompatActivity() {
    lateinit var binding:ActivityTest1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_test1)
        binding.button4.setOnClickListener(MyEventHandler(binding))
        binding.button5.setOnClickListener(MyEventHandler(binding))
    }
}

class MyEventHandler(binding: ActivityTest1Binding):View.OnClickListener{
    lateinit var binding: ActivityTest1Binding
    init {
        this.binding=binding
    }
    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")
        when(p0){
            binding.button4->binding.textView2.text="버튼4 클릭"
            binding.button5->binding.textView2.text="버튼5 클릭"
        }
    }
}