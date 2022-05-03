package com.example.app11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app11.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name=intent.getStringExtra("name")
        val age=intent.getIntExtra("age",0)
        binding.tvDetail.text="결과:$name,$age"
        binding.btnFinish.setOnClickListener {
            intent.putExtra("resultData","DetailActivity Result")
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}