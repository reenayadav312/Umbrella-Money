package com.aadil.ambrellamoney.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.aadil.ambrellamoney.R
import com.aadil.ambrellamoney.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        bottom_navigation.setItemIconTintList(null)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.HomeFragment -> {
                    loadFragment(HomeFragment())
                    bottom_navigation.setItemIconTintList(null)
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
           
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.home_framelayout, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onBackPressed() {
        val fragment: Fragment = HomeFragment()
        this.supportFragmentManager.beginTransaction()
            .replace(R.id.home_framelayout, fragment, null)
            .commit()
        bottom_navigation.getMenu().getItem(0).setChecked(true)
    }
}