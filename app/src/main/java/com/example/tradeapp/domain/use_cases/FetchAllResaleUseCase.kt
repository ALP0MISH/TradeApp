package com.example.tradeapp.domain.use_cases

import com.example.tradeapp.domain.models.Resale
import com.example.tradeapp.domain.repositories.ResaleRepositories

class FetchAllResaleUseCase (
    private val repositories: ResaleRepositories
        ) {

    operator fun invoke(): List<Resale> {
      return repositories.FetchResale()
    }

}