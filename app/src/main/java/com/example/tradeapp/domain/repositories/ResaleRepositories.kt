package com.example.tradeapp.domain.repositories

import com.example.tradeapp.domain.models.AllProducts
import com.example.tradeapp.domain.models.Category
import com.example.tradeapp.domain.models.Featured
import com.example.tradeapp.domain.models.Resale

interface ResaleRepositories {

    fun FetchResale(): List<Resale>
    fun FetchFeatured(): List<Featured>
    fun FetchCategory(): List<Category>
    fun FetckAllProducts(): List<AllProducts>

}