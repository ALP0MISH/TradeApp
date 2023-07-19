package com.example.tradeapp.data.repositories

import com.example.tradeapp.data.fake_data.FakeData
import com.example.tradeapp.domain.models.AllProducts
import com.example.tradeapp.domain.models.Category
import com.example.tradeapp.domain.models.Featured
import com.example.tradeapp.domain.models.Resale
import com.example.tradeapp.domain.repositories.ResaleRepositories

class ResaleRepositoriesImpl: ResaleRepositories {
    override fun FetchResale(): List<Resale> {
      return  FakeData.FakeResale()
    }

    override fun FetchFeatured(): List<Featured> {
        return FakeData.fakeFeatured()
    }

    override fun FetchCategory(): List<Category> {
        return FakeData.fakeCategory()
    }

    override fun FetckAllProducts(): List<AllProducts> {
        return FakeData.fakeAll()
    }

}