package com.example.database15

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.database15.databinding.ItemRecyclerviewBinding

class MyViewHolder(val binding: ItemRecyclerviewBinding) :RecyclerView.ViewHolder(binding.root)
class MyAdapter(val datas:MutableList<String>?):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    =MyViewHolder(ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       val binding=(holder as MyViewHolder).binding
        binding.itemData.text=datas!![position]
    }

    override fun getItemCount(): Int {
        return datas?.size ?:0
    }
}