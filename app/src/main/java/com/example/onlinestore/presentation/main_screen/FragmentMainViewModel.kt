package com.example.onlinestore.presentation.main_screen

import androidx.lifecycle.ViewModel
import com.example.onlinestore.data.repositories.MainRepositoryImpl
import com.example.onlinestore.domain.models.TopProduct
import com.example.onlinestore.domain.repositories.MainRepository
import com.example.onlinestore.domain.use_case.FetchAllTopProductUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class MainFragmentUiState(
    val topProduct: List<TopProduct> = emptyList(),
)

class FragmentMainViewModel : ViewModel() {
    private val mainRepository: MainRepository = MainRepositoryImpl()
    private val fetchAllTopProductUseCase = FetchAllTopProductUseCase(mainRepository)

    private val _uiStateFLow = MutableStateFlow(MainFragmentUiState())
    val uiStateFLow = _uiStateFLow.asStateFlow()
    init {
        val topProduct = fetchAllTopProductUseCase.invoke()
        val uiState = MainFragmentUiState(
            topProduct = topProduct,

        )
        _uiStateFLow.tryEmit(uiState)
    }
}