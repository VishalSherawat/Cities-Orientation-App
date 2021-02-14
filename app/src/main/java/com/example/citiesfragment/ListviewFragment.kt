package com.example.citiesfragment

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

/**
 * A simple [Fragment] subclass.
 * Use the [ListviewFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListviewFragment() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_listview, container, false)

        val cityData = arrayOf(City("New Delhi", "India", 30.3),
                City("New York", "USA", 18.8),
                City("Paris", "France", 12.2),
                City("Rome", "Italy", 2.8),
                City("Amsterdam", "Netherlands", 1.1)
        )
        val cities = view.findViewById<ListView>(R.id.cities)

        val cityAdapter = activity?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, cityData.map { it.name }) }

        cities.adapter = cityAdapter

        cities.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(activity, CityDetail::class.java).apply {
                putExtra("Country", cityData[position].country)
                putExtra("Population", cityData[position].population.toString())
            }

            if(activity?.resources?.configuration?.orientation == Configuration.ORIENTATION_PORTRAIT) {
                startActivity(intent)
            }
        }

        return view
    }
}