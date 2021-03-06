package com.example.app16.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.app16.R
import com.example.app16.databinding.ActivityTest1Binding
import org.json.JSONObject


class Test1Activity : AppCompatActivity() {

    lateinit var binding:ActivityTest1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val queue=Volley.newRequestQueue(this)

        binding.button.setOnClickListener {
            val request=JsonObjectRequest(
                Request.Method.GET,
                "https://reqres.in/api/users/2",
                //스프링 할땐 ip주소를 적어주면 된다.
                null,
                Response.Listener<JSONObject>{ response ->
                    val dataJson=response.getJSONObject("data")
                    val id=dataJson.getString("id")
                    val email=dataJson.getString("email")
                    binding.textView.text="$id. $email"
                },
                Response.ErrorListener {
                    binding.textView.text="error"
                }

            )
            queue.add(request)
        }
    }
}