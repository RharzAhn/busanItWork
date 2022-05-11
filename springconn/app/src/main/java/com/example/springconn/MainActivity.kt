package com.example.springconn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.springconn.databinding.ActivityMainBinding
import com.example.springconn.model.UserListModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fab.setOnClickListener {
            val intent= Intent(this,InputActivity::class.java)
            startActivity(intent)
        }

        val networkService=(applicationContext as MyApplication).networkService

        val userListCall=networkService.doGetUserList()
        userListCall.enqueue(object : Callback<UserListModel>{
            override fun onResponse(call: Call<UserListModel>, response: Response<UserListModel>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<UserListModel>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}