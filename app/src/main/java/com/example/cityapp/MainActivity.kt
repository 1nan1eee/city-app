package com.example.cityapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.cityapp.ui.screens.MainNavHost
import com.example.cityapp.ui.theme.CityAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CityAppTheme { // управление экранами
                val navController = rememberNavController()
                MainNavHost(navController)
            }
        }
    }
}
