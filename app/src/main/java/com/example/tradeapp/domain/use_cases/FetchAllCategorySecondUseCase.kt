package com.example.tradeapp.domain.use_cases

import com.example.tradeapp.domain.models.Category
import com.example.tradeapp.domain.repositories.ResaleRepositories

class FetchAllCategorySecondUseCase(
    private val repositories: ResaleRepositories
) {
    operator fun invoke(): List<Category> {
        return repositories.FetchCategory()
    }
}