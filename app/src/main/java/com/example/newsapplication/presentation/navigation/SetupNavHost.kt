package com.example.newsapplication.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.newsapplication.presentation.screens.news.NewsScreen


sealed class Screen(val route: String) {

    object News : Screen(route = "news_screen")

}


@Composable
fun SetupNavHost(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screen.News.route) {

        composable(route = Screen.News.route) {
            NewsScreen()
        }

    }

}