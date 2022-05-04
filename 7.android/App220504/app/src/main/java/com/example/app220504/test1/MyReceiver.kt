package com.example.app220504.test1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val data=intent.getStringExtra("data")
        Toast.makeText(context,"reciver data:$data",Toast.LENGTH_SHORT).show()
    }
}