package com.example.food_app_mvvm.data.service

import com.example.food_app_mvvm.data.pojo.MealList
import retrofit2.Call
import retrofit2.http.GET

interface FoodApi {

    @GET("random.php")
    fun getRandomMealList(): Call<MealList>
}
