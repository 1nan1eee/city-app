package com.example.cityapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.liveData
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.cityapp.data.models.Recommendation
import com.example.cityapp.ui.components.RecommendationCard
import com.example.cityapp.viewmodel.RecommendationsViewModel
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.cityapp.data.models.Category

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(category: Category) {
    val recommendationsViewModel: RecommendationsViewModel = viewModel()

    // LiveData определяется в зависимости от categoryId
    val recommendationsLiveData = when (category.id) {
        "coffee_shops" -> recommendationsViewModel.allCoffeeShopsLiveData
        "restaurants" -> recommendationsViewModel.allRestaurantsLiveData
        "child_friendly" -> recommendationsViewModel.allChildFriendlyLiveData
        "parks" -> recommendationsViewModel.allParksLiveData
        "shopping_centers" -> recommendationsViewModel.allShoppingCentersLiveData
        else -> liveData { emit(emptyList<Recommendation>()) }
    }

    // наблюдение за LiveData и обновление UI
    val recommendations by recommendationsLiveData.observeAsState(initial = emptyList())
    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = category.name,
                            style = MaterialTheme.typography.titleLarge.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onPrimary // Цвет текста
                            )
                        )
                    }
                },
                colors = topAppBarColors(
                    containerColor = Color(0xFF6B4525),
                    titleContentColor = Color(0xFFFCF2E2)
                )
            )
        }
    )
    { paddingValues ->
        Column(
            modifier = Modifier
                .background(Color(0xFFFCF2E2))
                .fillMaxSize()
                .padding(paddingValues)
                .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 0.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyColumn {
                items(recommendations) { recommendation ->
                    RecommendationCard(recommendation)
                }
            }
        }
    }
}
