package com.example.tradeapp.presentation.main_screen

import androidx.lifecycle.ViewModel
import com.example.tradeapp.data.repositories.ResaleRepositoriesImpl
import com.example.tradeapp.domain.models.AllProducts
import com.example.tradeapp.domain.models.Category
import com.example.tradeapp.domain.models.Featured
import com.example.tradeapp.domain.models.Resale
import com.example.tradeapp.domain.repositories.ResaleRepositories
import com.example.tradeapp.domain.use_cases.FetchAllCategoryUseCase
import com.example.tradeapp.domain.use_cases.FetchAllFeaturedUseCase
import com.example.tradeapp.domain.use_cases.FetchAllProductsUseCase
import com.example.tradeapp.domain.use_cases.FetchAllResaleUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FragmentMainViewModel : ViewModel() {

    private val repositories: ResaleRepositories = ResaleRepositoriesImpl()
    private val fetchAllResaleUseCase = FetchAllResaleUseCase(repositories)

    private val fetchAllFeaturedUseCase = FetchAllFeaturedUseCase(repositories)

    private val fetchAllProductsUseCase = FetchAllProductsUseCase(repositories)

    private val _resaleFlow = MutableStateFlow<List<Resale>>(emptyList())
    val resaleFlow = _resaleFlow.asStateFlow()

    private val _allProductsFlow = MutableStateFlow<List<AllProducts>>(emptyList())
    val allProductsFlow = _allProductsFlow.asStateFlow()


    private val _featuredFlow = MutableStateFlow<List<Featured>>(emptyList())
    val featuredFlow = _featuredFlow.asStateFlow()

    init {
        val resale = fetchAllResaleUseCase.invoke()
        _resaleFlow.tryEmit(resale)

        val featured = fetchAllFeaturedUseCase.invoke()
        _featuredFlow.tryEmit(featured)

        val allProducts = fetchAllProductsUseCase.invoke()
        _allProductsFlow.tryEmit(allProducts)


    }
}