package com.example.app9.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app9.R
import com.example.app9.databinding.ActivityTest4Binding
import com.example.app9.databinding.ItemBinding
import com.example.app9.databinding.MovieItemBinding

class Test4Activity : AppCompatActivity() {
    lateinit var binding: ActivityTest4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivityTest4Binding.inflate(layoutInflater)
        //setContentView(R.layout.activity_test4)
        setContentView(binding.root)
        var arrTitles= arrayOf("써니","완득이","괴물","라디오스타","비열한거리","왕의남자","아일랜드","웰컴투동막골","헬보이","백투더퓨처")
        var arrPoint= arrayOf(4.5f,4.5f,4.5f,4.5f,4.5f,4.5f,4.5f,4.5f,4.5f,4.5f)
        var arrImages= arrayOf(R.drawable.mov01,R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10)
        binding.recyerView2.layoutManager=LinearLayoutManager(this)
        binding.recyerView2.adapter=MyMovieAdapter(arrImages, arrTitles, arrPoint)
        binding.recyerView2.addItemDecoration(DividerItemDecoration(this,LinearLayoutManager.VERTICAL))
    }
}

class MyViewHoler(val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root)

class MyMovieAdapter(val arrImages:Array<Int>, val arrTitles:Array<String>, var arrPoint:Array<Float>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHoler(MovieItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding=(holder as MyViewHoler).binding
        binding.moviView.setImageResource(arrImages[position])
        binding.tvTitle.text="제목 : ${arrTitles[position]}"
        binding.tvPoint.text="평점 : ${arrPoint[position].toString()}"
    }

    override fun getItemCount(): Int {
        return arrTitles.size
    }

}