package com.example.citiesfragment

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = ListviewFragment()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.main_container, fragment)
        fragmentTransaction.commit()

        if(this.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            val fragment2 = DetailFragment()

            val fragmentTransaction2 = supportFragmentManager.beginTransaction()
            fragmentTransaction2.add(R.id.detail_container, fragment2)
            fragmentTransaction2.commit()
        }
    }
}