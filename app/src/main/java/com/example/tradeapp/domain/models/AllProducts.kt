package com.example.tradeapp.domain.models

data class AllProducts(
    val id: String,
    val title: String,
    val imageId: String,
    val description: String,
    val price: String,
    val favorite: Boolean,

)
