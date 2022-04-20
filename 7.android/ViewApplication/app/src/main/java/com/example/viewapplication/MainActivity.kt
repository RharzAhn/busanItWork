package com.example.viewapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tv:TextView=findViewById(R.id.tv)
        val btn: Button =findViewById(R.id.btn1)
        btn.setOnClickListener(View.OnClickListener {
            tv.setText("버튼을 클릭했음")
        })

//        val name = TextView(this).apply {
//            typeface = Typeface.DEFAULT_BOLD
//            text="Lake Louise"
//        }
//        val image = ImageView(this).also {
//            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.lake_1))
//        }
//        val address = TextView(this).apply {
//            typeface = Typeface.DEFAULT_BOLD
//            text = "Lake Louse, AB, 캐나다"
//        }
//        val layout = LinearLayout(this).apply {
//            orientation = LinearLayout.VERTICAL
//            gravity = Gravity.CENTER
//            addView(name, WRAP_CONTENT, WRAP_CONTENT)
//            addView(image, WRAP_CONTENT, WRAP_CONTENT)
//            addView(address, WRAP_CONTENT, WRAP_CONTENT)
//        }
       // setContentView(R.layout.button_layout)
        //setContentView(layout)
        //setContentView(R.layout.activity_main)
    }
}