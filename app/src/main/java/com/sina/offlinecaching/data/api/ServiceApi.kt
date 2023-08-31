package com.sina.offlinecaching.data.api

import com.sina.offlinecaching.data.model.Restaurant
import retrofit2.http.GET

interface ServiceApi {

    companion object {
        const val BASE_URL = "https://random-data-api.com/api/"
    }

    @GET("restaurant/random_restaurant?size=20")
    suspend fun getRestaurants(): List<Restaurant>

}