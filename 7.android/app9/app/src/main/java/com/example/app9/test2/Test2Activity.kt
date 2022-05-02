package com.example.app9.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app9.R
import com.example.app9.databinding.ActivityTest2Binding
import com.example.app9.databinding.ItemBinding

class Test2Activity : AppCompatActivity() {
    lateinit var binding:ActivityTest2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTest2Binding.inflate(layoutInflater)
        //setContentView(R.layout.activity_test2)
        setContentView(binding.root)
        val arrName= arrayOf("강기동","구주용","김경래","김승현","김은진","박정현","신재경","안영륜","안혜민","우소윤")
        val arrPhone= arrayOf("010-1111-1234","010-1112-1234","010-1113-1234","010-1114-1234","010-1115-1234","010-1116-1234","010-1117-1234","010-1118-1234","010-1119-1234","010-1101-1234","010-1111-1234",)

        binding.recyerView.layoutManager=LinearLayoutManager(this)
        binding.recyerView.adapter=MyAdapter(arrName, arrPhone)
        binding.recyerView.addItemDecoration(DividerItemDecoration(this,LinearLayoutManager.VERTICAL))
    }
}
class MyViewHoler(val binding: ItemBinding):RecyclerView.ViewHolder(binding.root)

class MyAdapter(val arrName:Array<String>, val arrPhone:Array<String>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHoler(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding=(holder as MyViewHoler).binding
        binding.tvName.text=arrName[position]
        binding.tvPhone.text=arrPhone[position]
    }

    override fun getItemCount(): Int {
        return arrName.size
    }

}