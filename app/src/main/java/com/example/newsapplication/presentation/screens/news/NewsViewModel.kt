package com.example.newsapplication.presentation.screens.news

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapplication.data.remote.repository.NewsRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(private val newsRepositoryImpl: NewsRepositoryImpl) :
    ViewModel() {

        val state = MutableStateFlow(NewsState.InitState)

        fun loadNews() {
            viewModelScope.launch {
                val result = newsRepositoryImpl.getNews("i", fromDate = "", sortBy = "")
                state.update { it.copy(news = result) }
            }
        }

}