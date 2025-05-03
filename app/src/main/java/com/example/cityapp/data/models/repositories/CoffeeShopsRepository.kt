package com.example.cityapp.data.models.repositories

import com.example.cityapp.R
import com.example.cityapp.data.models.Recommendation

class CoffeeShopsRepository {

    private val coffeeShops = listOf(
        Recommendation(
            id = 1,
            title = "Tasty Coffee",
            address = "Пушкинская, 202 • Лихвинцева, 50 • Советская, 22 • Баранова, 26",
            description = "Современная кофейня со своим собственным цехом и производством кофе.",
            imageResId = R.drawable.tasty_coffee,
            category = "Кофейни"
        ),
        Recommendation(
            id = 1,
            title = "Лакрица",
            address = "Максима Горького, 163 • 50-летия ВЛКСМ, 6 • пер. Широкий, 53",
            description = "Современная кофейня с эстетичным сдержанным дизайном. Отлично подходит для фотосессий или если вы блогер.",
            imageResId = R.drawable.lakritsa,
            category = "Кофейни"
        ),
        Recommendation(
            id = 1,
            title = "Чашка",
            address = "Лихвинцева, 46 • Красногеройская, 28 • 50-летия ВЛКСМ, 6 • 10 лет Октября, 30",
            description = "Уютная литературная кофейня, где каждый желающий может взять почитать книгу на любой вкус.",
            imageResId = R.drawable.chashka,
            category = "Кофейни"
        ),
        Recommendation(
            id = 1,
            title = "Абсолютно Комильфо",
            address = "Красноармейская, 164",
            description = "Современная кофейня со своей собственной атмосферой.",
            imageResId = R.drawable.akf,
            category = "Кофейни"
        ),
        Recommendation(
            id = 1,
            title = "Кофе Семь",
            address = "Красная, 133",
            description = "Уютная просторная кофейня недалеко от Парка Горького.",
            imageResId = R.drawable.kofe_sem,
            category = "Кофейни"
        )
    )

    fun getAllCoffeeShops(): List<Recommendation> {
        return coffeeShops
    }
}
