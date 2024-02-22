package com.example.newsapplication.domain.repository

import com.example.newsapplication.domain.models.NewUI

interface NewsRepository {

    suspend fun getNews(queryText: String, fromDate: String, sortBy: String): List<NewUI>

}