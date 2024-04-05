package com.howettl.mvvmtemplate2024.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.howettl.mvvmtemplate2024.ui.Greeting

@Composable
fun NavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "hello",
    ) {
        composable("hello") {
            Greeting(name = "Android")
        }
    }
}
