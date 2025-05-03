package com.example.cityapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cityapp.data.models.repositories.CoffeeShopsRepository
import com.example.cityapp.data.models.repositories.RestaurantsRepository
import com.example.cityapp.data.models.repositories.ChildFriendlyPlacesRepository
import com.example.cityapp.data.models.repositories.ParksRepository
import com.example.cityapp.data.models.repositories.ShoppingCentersRepository

class RecommendationsViewModel : ViewModel() {

    private val coffeeShopsRepo: CoffeeShopsRepository by lazy { CoffeeShopsRepository() }
    private val restaurantsRepo: RestaurantsRepository by lazy { RestaurantsRepository() }
    private val childFriendlyRepo: ChildFriendlyPlacesRepository by lazy { ChildFriendlyPlacesRepository() }
    private val parksRepo: ParksRepository by lazy { ParksRepository() }
    private val shoppingCentersRepo: ShoppingCentersRepository by lazy { ShoppingCentersRepository() }

    val allCoffeeShopsLiveData get()= liveData { emit(coffeeShopsRepo.getAllCoffeeShops()) }
    val allRestaurantsLiveData get()= liveData { emit(restaurantsRepo.getAllRestaurants()) }
    val allChildFriendlyLiveData get()= liveData { emit(childFriendlyRepo.getAllChildFriendlyPlaces()) }
    val allParksLiveData get()= liveData { emit(parksRepo.getAllParks()) }
    val allShoppingCentersLiveData get()= liveData { emit(shoppingCentersRepo.getAllShoppingCenters()) }
}
