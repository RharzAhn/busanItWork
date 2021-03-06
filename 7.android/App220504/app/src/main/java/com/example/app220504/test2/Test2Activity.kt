package com.example.app13.test2

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.os.Message
import android.os.Messenger
import com.example.app13.R
import com.example.app13.databinding.ActivityTest2Binding
import com.example.app220504.databinding.ActivityTest2Binding

class Test2Activity : AppCompatActivity() {
    lateinit var messenger: Messenger

    val connection : ServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
            messenger = Messenger(p1)
        }

        override fun onServiceDisconnected(p0: ComponentName?) {
            TODO("Not yet implemented")
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, MyService::class.java)
        bindService(intent, connection, Context.BIND_AUTO_CREATE)

        binding.button5.setOnClickListener {
            val msg = Message()
            msg.what = 10
            msg.obj = "hello"
            messenger.send(msg)
        }
        binding.button6.setOnClickListener {
            val msg = Message()
            msg.what = 20
            msg.obj = "world"
            messenger.send(msg)
        }
    }
}