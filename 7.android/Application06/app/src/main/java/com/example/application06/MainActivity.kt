package com.example.application06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup
import com.example.application06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener,CompoundButton.OnCheckedChangeListener {
    var str1=""
    lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.checkBox1.setOnCheckedChangeListener(this)
        binding.checkBox2.setOnCheckedChangeListener(this)
        //setContentView(R.layout.activity_main)
//        binding.button.setOnClickListener(View.OnClickListener {
//            binding.textView.setText("버튼1 클릭했어요")
//        })
//        binding.button2.setOnClickListener(View.OnClickListener {
//            binding.textView.setText("버튼2 클릭했어요")
//        })
//        binding.button3.setOnClickListener(View.OnClickListener {
//            binding.textView.setText("버튼3 클릭했어요")
//        })
//        binding.checkBox1.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
//            if(b){
//                str1+=binding.checkBox1.text
//                //binding.textView.setText(binding.checkBox1.text)
//            }else{
//                str1=str1.replace(binding.checkBox1.text.toString(),"")
//                //binding.textView.setText("")
//            }
//            binding.textView.setText(str1)
//        })
//        binding.checkBox2.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
//            if(b){
//                str1+=binding.checkBox2.text
//                //binding.textView.setText(binding.checkBox1.text)
//            }else{
//                str1=str1.replace(binding.checkBox1.text.toString(),"")
//                //binding.textView.setText("")
//            }
//            binding.textView.setText(str1)
//        })
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode){
            //KeyEvent.KEYCODE_BACK->Log.d("pgm","Back Button을 눌렀어요")
            KeyEvent.KEYCODE_VOLUME_UP->Log.d("pgm","Volum_up 버튼을 눌렀어요")
            KeyEvent.KEYCODE_VOLUME_DOWN->Log.d("pgm","Volum_down 버튼을 눌렀어요")
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onBackPressed() {
        Log.d("pgm","Back Button을 눌렀어요")
    }

    override fun onClick(p0: View?) {
        //TODO("Not yet implemented")
        //binding.textView.text="aaaaa"
        when(p0){
            binding.button->binding.textView.text="버튼1 클릭"
            binding.button2->binding.textView.text="버튼2 클릭"
            binding.button3->binding.textView.text="버튼3 클릭"
        }
    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        //TODO("Not yet implemented")
        when(p0){
            binding.checkBox1->{
                if(p1){
                    str1+=binding.checkBox1.text
                }else{
                    str1=str1.replace(binding.checkBox1.text.toString(),"")
                }
            }
            binding.checkBox2->{
                if(p1){
                    str1+=binding.checkBox1.text
                }else{
                    str1=str1.replace(binding.checkBox1.text.toString(),"")
                }
            }
        }
        binding.textView.setText(str1)
    }
}