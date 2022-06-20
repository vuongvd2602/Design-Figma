package com.example.cvtest

import android.content.Context

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class TablayoutAdapter(fm: FragmentManager, private val totalTabs: Int) : FragmentPagerAdapter(fm)  {
    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return BulletinFragment()
            }
            1 -> {
                return ActivitiesFragment()
            }
            2 -> {

                return MembersFragment()
            }
            3 -> {
                return PendingsFragment()
            }
            else -> return BulletinFragment()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}