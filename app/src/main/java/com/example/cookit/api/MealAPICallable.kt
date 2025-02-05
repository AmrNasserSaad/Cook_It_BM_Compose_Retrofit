package com.example.cookit.api

import com.example.cookit.constants.Constants.CATEGORIES_ENDPOINT
import com.example.cookit.constants.Constants.CATEGORY_QUERY
import com.example.cookit.constants.Constants.FILTER_ENDPOINT
import com.example.cookit.constants.Constants.INGREDIENT_QUERY
import com.example.cookit.constants.Constants.LOOKUP_ENDPOINT
import com.example.cookit.models.CategoryRoot
import com.example.cookit.models.MealRoot
import retrofit2.http.GET
import retrofit2.http.Query

interface MealAPICallable {
    @GET(CATEGORIES_ENDPOINT)
    suspend fun getCategories(): CategoryRoot

    @GET(FILTER_ENDPOINT)
    suspend fun getMeals(@Query(CATEGORY_QUERY) categoryName: String): MealRoot

    @GET(LOOKUP_ENDPOINT)
    suspend fun getRecipe(@Query(INGREDIENT_QUERY) mealId: String): MealRoot
}