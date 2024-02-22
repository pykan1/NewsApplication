package com.example.newsapplication.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.newsapplication.presentation.navigation.SetupNavHost
import com.example.newsapplication.presentation.theme.NewsApplicationTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navHostController = rememberNavController()
            NewsApplicationTheme {
                SetupNavHost(navHostController)
            }
        }
    }
}
