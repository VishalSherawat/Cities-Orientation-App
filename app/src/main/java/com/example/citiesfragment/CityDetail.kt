package com.example.citiesfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CityDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_city_detail)

        val fragment = DetailFragment()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.detail_container, fragment)
        fragmentTransaction.commit()
    }
}