package com.example.cookit.models

import com.example.cookit.constants.Constants.MEAL_ID
import com.example.cookit.constants.Constants.MEAL_IMAGE
import com.example.cookit.constants.Constants.MEAL_INSTRUCTIONS
import com.example.cookit.constants.Constants.MEAL_NAME
import com.example.cookit.constants.Constants.MEAL_VIDEO
import com.google.gson.annotations.SerializedName

data class MealRoot(val meals: List<Meal>)

data class Meal(
    @SerializedName(MEAL_ID)
    val id: String,
    @SerializedName(MEAL_NAME)
    val name: String,
    @SerializedName(MEAL_IMAGE)
    val image: String,


    @SerializedName(MEAL_INSTRUCTIONS)
    val instructions: String,
    @SerializedName(MEAL_VIDEO)
    val video: String
)