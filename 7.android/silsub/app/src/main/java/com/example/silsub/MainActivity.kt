package com.example.silsub

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import com.example.silsub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var selectYear:Int=0
    var selectMonth:Int=0
    var selectDay:Int=0
    var selectHour:Int=0
    var selectMinute:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
        binding.radioCalendar.isChecked=true
        binding.calenderView.visibility=View.VISIBLE
        binding.timePicker.visibility=View.INVISIBLE

        binding.radioCalendar.setOnClickListener{
            binding.calenderView.visibility= View.VISIBLE
            binding.timePicker.visibility=View.INVISIBLE
        }
        binding.radioTime.setOnClickListener{
            binding.calenderView.visibility= View.INVISIBLE
            binding.timePicker.visibility=View.VISIBLE
        }

        binding.chronometer.base=SystemClock.elapsedRealtime()
        binding.chronometer.start()
        binding.chronometer.setTextColor(Color.RED)
        binding.calenderView.setOnDateChangeListener { view, year, month, dayOfmonth ->
            selectYear = year
            selectMonth = month
            selectDay = dayOfmonth
        }
        binding.timePicker.setOnTimeChangedListener { timePicker, hour, minute ->
            selectHour=hour
            selectMinute=minute
        }

        binding.btnEnd.setOnClickListener {
            binding.chronometer.stop()
            binding.chronometer.setTextColor(Color.BLUE)
            binding.tvResult.text="${selectYear.toString()+"년"+selectMonth.toString()+"월"+
                    selectDay.toString()+"일"+selectHour.toString()+"시"+selectMinute.toString()+"분"}"
        }
    }
}