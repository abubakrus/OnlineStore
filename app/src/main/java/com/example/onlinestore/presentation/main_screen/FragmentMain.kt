package com.example.onlinestore.presentation.main_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.onlinestore.R
import com.example.onlinestore.databinding.FragmentMainBinding
import com.example.onlinestore.presentation.main_screen.recycler_view.top_product.TopProductAdapter
import kotlinx.coroutines.flow.onEach

class FragmentMain : Fragment() {
    private val binding: FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }

    private val viewModel: FragmentMainViewModel by viewModels()

    private val topProductAdapter: TopProductAdapter by lazy {
        TopProductAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        observeData()
    }

    private fun initViews() = with(binding) {
        binding.includeMainContent.recyclerViewHorizontal.adapter = topProductAdapter
    }
    private fun observeData(){
        viewModel.uiStateFLow.onEach {uiState ->
            topProductAdapter.updateData(uiState.topProduct)
        }
    }

}