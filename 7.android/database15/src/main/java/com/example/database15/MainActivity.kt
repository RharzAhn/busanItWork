package com.example.database15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.database15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: MyAdapter
    var datas:MutableList<String>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val requestLauncher=registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){
                it.data!!.getStringExtra("result")?.let{
                    datas?.add(it)
                    adapter.notifyDataSetChanged()
                }
            }
            binding.mainTab.setOnClickListener { //이버튼을 누르면
                val intent= Intent(this, AddActivity::class.java)
                requestLauncher.launch(intent)

            }
            datas=mutableListOf<String>()

            val db=MyDBHelpr(this).readableDatabase
            val cursor=db.rawQuery("select*from TODO_TB",null)
            cursor.run {
                while (moveToNext()) {
                    datas?.add(cursor.getString(1))
                }
            }
                db.close()

        val layoutManager = LinearLayoutManager(this)
        binding.mainRecyclerView.layoutManager=layoutManager
        adapter= MyAdapter(datas)
        binding.mainRecyclerView.adapter=adapter
        binding.mainRecyclerView.addItemDecoration(
            DividerItemDecoration(this,LinearLayoutManager.VERTICAL)
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.menu_main_setting){
            val intent=Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}