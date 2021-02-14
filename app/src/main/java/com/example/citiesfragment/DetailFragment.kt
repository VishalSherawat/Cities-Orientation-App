package com.example.citiesfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        val cityCountry = activity?.intent?.getStringExtra("Country")
        cityCountry?.let {
            val country: TextView = view.findViewById(R.id.country)
            country.text = getString(R.string.country_detail, it)
        }

        val cityPopulation = activity?.intent?.getStringExtra("Population")
        cityPopulation?.let {
            val population: TextView = view.findViewById(R.id.population)
            population.text = getString(R.string.population_detail, it)
        }

        return view
    }
}