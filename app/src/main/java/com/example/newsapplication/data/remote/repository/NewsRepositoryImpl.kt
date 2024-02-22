package com.example.newsapplication.data.remote.repository

import com.example.newsapplication.data.remote.service.NewsService
import com.example.newsapplication.domain.models.NewUI
import com.example.newsapplication.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(private val newsService: NewsService) :
    NewsRepository {
    override suspend fun getNews(queryText: String, fromDate: String, sortBy: String): List<NewUI> {
        val result = newsService.getNews(queryText = queryText, fromDate = fromDate, sortBy = sortBy)
        return result.articles?.map {
            NewUI(
                author = it.author.orEmpty(),
                title = it.title.orEmpty(),
                description = it.description.orEmpty(),
                url = it.url.orEmpty(),
                urlToImage = it.urlToImage.orEmpty(),
                publishedAt = it.publishedAt.orEmpty(),
                content = it.content.orEmpty()
            )
        }.orEmpty()
    }
}