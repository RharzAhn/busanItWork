package com.example.app9

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val requestLauncher=registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ){
            isGranted->
            if(isGranted){
                Log.d("pgm","callback... granted...")
            }else{
                Log.d("pgm","callback... granted...")
            }

        }
        var status=ContextCompat.checkSelfPermission(
            this,"android.permission.ACCESS_FINE_LOCATION"
        )
        if(status==PackageManager.PERMISSION_GRANTED){
            Log.d("pgm","granted...")
        }else{
            requestLauncher.launch("android.permission.ACCESS_FINE_LOCATION")
        }
    }
}