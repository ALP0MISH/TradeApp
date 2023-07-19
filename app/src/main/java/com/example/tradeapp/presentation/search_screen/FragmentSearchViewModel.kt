package com.example.tradeapp.presentation.search_screen

import androidx.lifecycle.ViewModel
import com.example.tradeapp.data.repositories.ResaleRepositoriesImpl
import com.example.tradeapp.domain.models.AllProducts
import com.example.tradeapp.domain.models.Category
import com.example.tradeapp.domain.repositories.ResaleRepositories
import com.example.tradeapp.domain.use_cases.FetchAllCategoryUseCase
import com.example.tradeapp.domain.use_cases.FetchAllProductsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FragmentSearchViewModel : ViewModel() {

    private val repositories : ResaleRepositories = ResaleRepositoriesImpl()
    private val fetchAllCategoryUseCase =   FetchAllCategoryUseCase(repositories)

    private val _allCategoryFlow = MutableStateFlow<List<Category>>(emptyList())
    val allCategoryFlow = _allCategoryFlow.asStateFlow()



    init {
        val category = fetchAllCategoryUseCase.invoke()
        _allCategoryFlow.tryEmit(category)


    }

}