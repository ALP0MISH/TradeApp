package com.example.tradeapp.domain.use_cases

import com.example.tradeapp.domain.models.Featured
import com.example.tradeapp.domain.repositories.ResaleRepositories

class FetchAllFeaturedUseCase(
    private val repositories: ResaleRepositories
) {

    operator fun invoke(): List<Featured>{
        return repositories.FetchFeatured()
    }

}