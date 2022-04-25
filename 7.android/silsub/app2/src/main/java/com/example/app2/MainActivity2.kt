package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    lateinit var ids:Array<Int>
    lateinit var titles:Array<String>
    var i=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        ids= arrayOf(R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,
            R.drawable.pic7,R.drawable.pic8,R.drawable.pic9)
        titles = arrayOf("독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀", "이레느깡 단 베르양", "잠자는 소녀",
            "테라스의 두 자매", "피아노 레슨", "피아노 앞의 소녀들", "해변에서서")
        //시작하는 부분. 첫화면 인덱스로 구현, 버튼도 설정
        binding.button1.isEnabled=false
        binding.button2.isEnabled=true
        binding.tv.text=titles[0]
        binding.imageView.setImageResource(ids[0])
        setContentView(binding.root)
//        setContentView(R.layout.activity_main2)

        //버튼1 클릭이벤트
        binding.button1.setOnClickListener {
            i=btncheck(i-1)
            binding.tv.text = titles[i]
            binding.imageView.setImageResource(ids[i])
        }

        //버튼2 클릭이벤트
        binding.button2.setOnClickListener {
            i=btncheck(i+1)
            binding.tv.text = titles[i]
            binding.imageView.setImageResource(ids[i])
        }
    }

    private fun btncheck(_idx: Int): Int {
        var idx = _idx

        if(idx<=0){
            idx=0
            binding.button1.isEnabled=false
            binding.button2.isEnabled=true
        }else if(idx>=8){
            idx=8
            binding.button1.isEnabled=true
            binding.button2.isEnabled=false
        }else{
            binding.button1.isEnabled=true
            binding.button2.isEnabled=true
        }
        return idx
    }
}