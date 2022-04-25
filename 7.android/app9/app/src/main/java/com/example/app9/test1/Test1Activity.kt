package com.example.app9.test1

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.app9.R
import com.example.app9.databinding.ActivityTest1Binding

class Test1Activity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_test1)
        var binding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            var toast = Toast.makeText(this, "토스트 메시지", Toast.LENGTH_SHORT)
            toast.addCallback(
                object : Toast.Callback() {
                    override fun onToastHidden() {
                        super.onToastHidden()
                        Log.d("koo", "toast hidden")

                    }

                    override fun onToastShown() {
                        super.onToastShown()
                        Log.d("koo", "toast show")
                    }
                }

            )
            toast.show()

        }
        binding.button2.setOnClickListener {
            DatePickerDialog(this,DatePickerDialog.OnDateSetListener{
                datePicker, year, month, day ->
                Log.d("pgm","date:${year}년, ${month+1}월, ${day}일")
                binding.textView.setText("date:${year}년, ${month+1}월, ${day}일")
            },2022,4,25).show()

        }
        binding.button3.setOnClickListener {
            TimePickerDialog(this,TimePickerDialog.OnTimeSetListener{
                timePicker, i, i2 ->
                binding.textView.setText("time: ${i}시, ${i2}분")
            }, 16, 10, true).show()
        }
        binding.button4.setOnClickListener {
            AlertDialog.Builder(this).run{
                setTitle("test Dialog")
                setIcon(android.R.drawable.ic_dialog_info)
                setMessage("정말 종료하시겠습니까?")
                setPositiveButton("OK",null)
                setNegativeButton("Cancel",null)
                setNeutralButton("More",null)
                setPositiveButton("Yes", DialogInterface.OnClickListener{
                    dialogInterface, i ->
                    binding.textView.setText("YES버튼 클릭")
                })
                //setNegativeButton("No",null)
                show()
            }
        }

        binding.button5.setOnClickListener {
            var str=""
            val items = arrayOf<String>("사과","복숭아","수박","포도")
            AlertDialog.Builder(this).run{
                setIcon(android.R.drawable.ic_dialog_info)
                /*setItems(items, DialogInterface.OnClickListener {
                        dialogInterface, i ->  })*/
                setMultiChoiceItems(items, booleanArrayOf(false,false,false,false),
                DialogInterface.OnMultiChoiceClickListener {
                        dialogInterface, i, b ->
                    if(b){
                        str+=items[i]
                    }else{
                        str=str.replace(items[i],"")
                    }
                }
                    )
                setPositiveButton("닫기", DialogInterface.OnClickListener{
                    dialogInterface, i ->
                    binding.textView.setText(str)
                })
                show()
            }
        }
    }
}