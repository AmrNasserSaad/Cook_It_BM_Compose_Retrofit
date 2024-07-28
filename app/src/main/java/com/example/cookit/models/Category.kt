package com.example.cookit.models

import com.example.cookit.constants.Constants.CATEGORY_IMAGE
import com.example.cookit.constants.Constants.CATEGORY_NAME
import com.google.gson.annotations.SerializedName

data class CategoryRoot(val categories: List<Category>)

data class Category(
    @SerializedName(CATEGORY_NAME)
    val name: String,
    @SerializedName(CATEGORY_IMAGE)
    val image: String,
)