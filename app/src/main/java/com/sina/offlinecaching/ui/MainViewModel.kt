package com.sina.offlinecaching.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sina.offlinecaching.data.api.ServiceApi
import com.sina.offlinecaching.data.model.Restaurant
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    serviceApi: ServiceApi
) : ViewModel() {


    private val restaurantLiveData = MutableLiveData<List<Restaurant>>()
    val restaurant: LiveData<List<Restaurant>> = restaurantLiveData

    init {

        viewModelScope.launch {
            val restaurants = serviceApi.getRestaurants()
            delay(2000)
            restaurantLiveData.postValue(restaurants)
        }
    }

}