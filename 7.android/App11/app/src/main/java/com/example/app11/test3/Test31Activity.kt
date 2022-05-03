package com.example.app11.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.app11.R
import com.example.app11.databinding.ActivityTest31Binding

class Test31Activity : AppCompatActivity() {
    var count=0
    lateinit var binding:ActivityTest31Binding
    //다른데서도 바인딩을 쓰려면 이렇게 표현, 이럴려면 아래 binding에 var 제거
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTest31Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnA.setOnClickListener {
            val intent= Intent(this,Test32Activity::class.java)
            startActivity(intent)
        }
        binding.btnCount.setOnClickListener {
            count++
            binding.tvCount.text="count: $count"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count",count)
    }
//    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
//        super.onSaveInstanceState(outState, outPersistentState)
//        outState.putInt("count",count)
//    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val data=savedInstanceState.getInt("count")
        binding.tvCount.text="count:$data"
        count=data
    }
}