package com.sina.offlinecaching.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.sina.offlinecaching.R
import com.sina.offlinecaching.databinding.ActivityMainBinding
import com.sina.offlinecaching.ui.adapter.RestaurantAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val restaurantAdapter = RestaurantAdapter()
        with(binding) {
            recyclerView.apply {
                adapter = restaurantAdapter
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }

        viewModel.restaurant.observe(this@MainActivity) {
            restaurantAdapter.submitList(it)
        }
    }
}