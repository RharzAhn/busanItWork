package com.example.app9.test5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app9.R
import com.example.app9.databinding.ActivityTest5Binding
import com.example.app9.databinding.ItemPagerBinding

class Test5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityTest5Binding.inflate(layoutInflater)
        //setContentView(R.layout.activity_test5)
        setContentView(binding.root)
    }
}

class MyPagerViewHolder(val binding: ItemPagerBinding):RecyclerView.ViewHolder(binding.root)

class MypagerAdapter(val datas:Array<Int>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder = MyPagerViewHolder(ItemPagerBinding.inflate(
        LayoutInflater.from(parent.context),parent,false))



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding=(holder as MyPagerViewHolder).binding
        binding.imageView2
    }

    override fun getItemCount(): Int {
        return datas.size
    }

}