package uc.team.walpaper.ui.home.fragmentPager

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomAdapter(activity: Fragment, val list: List<String>):FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = FragmentCustom().apply {
            arguments= Bundle().apply{
                putInt("key", position)
            }
        }
        return fragment
    }

}