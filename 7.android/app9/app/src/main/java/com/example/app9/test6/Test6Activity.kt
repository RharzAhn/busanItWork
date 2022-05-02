package com.example.app9.test6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.app9.R
import com.example.app9.Test1Fragment
import com.example.app9.Test2Fragment
import com.example.app9.Test3Fragment
import com.example.app9.databinding.ActivityTest6Binding

class Test6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityTest6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPager2.adapter=MyPagerFragmentAdapter(this)
    }
}

class MyPagerFragmentAdapter(activity: Test6Activity):FragmentStateAdapter(activity){
    val fragments:List<Fragment>
    init {
        fragments= listOf(Test1Fragment(), Test2Fragment(), Test3Fragment())
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}