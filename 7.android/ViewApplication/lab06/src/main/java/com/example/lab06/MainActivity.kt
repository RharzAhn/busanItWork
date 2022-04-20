package com.example.lab06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import com.example.lab06.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_DOWN->{

                Log.d("pgm","Touch down event")
            }
            MotionEvent.ACTION_UP->{
                Log.d("pgm","Touch up event")
            }
            MotionEvent.ACTION_MOVE->{
                binding.tvResult.text="Touch move event x:${event.x}, y:${event.y}"
                //Log.d("pgm","Touch move event x:${event.x},y:${event.y}")
            }
        }
        return super.onTouchEvent(event)
    }

}