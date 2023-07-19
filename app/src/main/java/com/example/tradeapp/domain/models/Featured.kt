package com.example.tradeapp.domain.models

data class Featured(
    val id: String,
    val title: String,
    val imageId: String,
    val isFeaturedCategory:Boolean,
    val price: String,
    val favorite: Boolean,


)
