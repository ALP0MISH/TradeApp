package com.example.tradeapp.domain.use_cases

import com.example.tradeapp.domain.models.AllProducts
import com.example.tradeapp.domain.repositories.ResaleRepositories

class FetchAllProductsUseCase (
    private val repositories: ResaleRepositories
        ) {

    operator fun invoke(): List<AllProducts>{
        return repositories.FetckAllProducts()
    }
}