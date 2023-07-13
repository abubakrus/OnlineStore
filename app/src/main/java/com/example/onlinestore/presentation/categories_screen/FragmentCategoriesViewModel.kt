package com.example.onlinestore.presentation.categories_screen

import androidx.lifecycle.ViewModel
import com.example.onlinestore.data.repositories.MainRepositoryImpl
import com.example.onlinestore.domain.models.CategoryEvent
import com.example.onlinestore.domain.repositories.MainRepository
import com.example.onlinestore.domain.use_case.FetchAllCategoriesEventUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FragmentCategoriesViewModel : ViewModel() {
    private val categoriesRepository: MainRepository = MainRepositoryImpl()
    private val fetchAllCategoriesEventUseCase = FetchAllCategoriesEventUseCase(categoriesRepository)

    private val _categoriesEventFlow = MutableStateFlow<List<CategoryEvent>>(emptyList())
    val categoriesEventFlow = _categoriesEventFlow.asStateFlow()
    init {
        val categoryEvent = fetchAllCategoriesEventUseCase.invoke()
        _categoriesEventFlow.tryEmit(categoryEvent)
    }
}

