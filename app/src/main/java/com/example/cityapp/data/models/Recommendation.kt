package com.example.cityapp.data.models

data class Recommendation(
    val id: Int,
    val title: String,
    val address: String,
    val description: String,
    val imageResId: Int,
    val category: String
)
