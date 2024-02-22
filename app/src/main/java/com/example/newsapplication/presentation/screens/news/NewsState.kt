package com.example.newsapplication.presentation.screens.news

import com.example.newsapplication.domain.models.NewUI

data class NewsState(
    val news: List<NewUI>
) {
    companion object {
        val InitState = NewsState(news = emptyList())
    }
}