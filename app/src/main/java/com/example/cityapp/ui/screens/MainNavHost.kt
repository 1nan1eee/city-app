package com.example.cityapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cityapp.R
import com.example.cityapp.data.models.Category

@Composable
fun MainNavHost(navController: NavHostController) {
    val categories = listOf(
        Category(id = "coffee_shops", name = "Кофейни", imageResId = R.drawable.coffee_shops),
        Category(id = "restaurants", name = "Рестораны", imageResId = R.drawable.restaurants),
        Category(id = "child_friendly", name = "Места, подходящие для детей", imageResId = R.drawable.child_friendly_places),
        Category(id = "parks", name = "Парки", imageResId = R.drawable.parks),
        Category(id = "shopping_centers", name = "Торговые центры", imageResId = R.drawable.shopping_centers),
    )

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController, categories)
        }

        composable("recommendations/{categoryId}") { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getString("categoryId")
            val category = categories.find { it.id == categoryId } // Поиск категории по id
            if (category != null) {
                CategoryScreen(category)
            }
        }
    }
}
