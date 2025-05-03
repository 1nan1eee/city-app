package com.example.cityapp.data.models.repositories

import com.example.cityapp.R
import com.example.cityapp.data.models.Recommendation

class RestaurantsRepository {

    private val restaurants = listOf(
        Recommendation(
            id = 2,
            title = "Старик Хинкалыч",
            address = "Архитектора П.П. Берша, 22 • Пушкинская, 252 • Ленина, 138",
            description = "Ресторан грузинской кухни.",
            imageResId = R.drawable.starik_hinkalych,
            category = "Рестораны"
        ),
        Recommendation(
            id = 2,
            title = "Ялта",
            address = "К. Маркса, 438 • Пушкинская, 130а",
            description = "Ресторан курортного настроения. Сытные завтраки с утра пораньше, а в обед - блюда курортной кухни, богатые овощами, мясом, специями и соусами. Вечером - домашние настойки и другие фирменные напитки. В меню также есть чебуреки, процесс рождения которых гости могут наблюдать на открытой кухне.",
            imageResId = R.drawable.yalta,
            category = "Рестораны"
        ),
        Recommendation(
            id = 2,
            title = "CHICKO",
            address = "Максима Горького, 80",
            description = "Ресторан корейской кухни. Мендонский чикен, сырная монетка, токпокки и рапокки, знаменитый пуноппан и напитки по мотивам известных дорам.",
            imageResId = R.drawable.chicko,
            category = "Рестораны"
        ),
        Recommendation(
            id = 2,
            title = "Дело в рисе",
            address = "Красногеройская, 37",
            description = "Современное кафе азиатской кухни, живущее в ритме большого города.",
            imageResId = R.drawable.delo_v_rise,
            category = "Рестораны"
        ),
        Recommendation(
            id = 2,
            title = "Мама Pizza",
            address = "Петрова, 29 • Майская, 9 • Молодежная, 34 • Восточная, 32 • 9 января, 211 • Баранова, 87 • Школьная, 44Б • Советская, 15 • Пушкинская, 165 • Кирова, 127А • Холмогорова, 11 • Гагарина, 8А",
            description = "Mama Pizza — сеть кафе с домашней итальянской кухней. В меню есть пицца, паста, лимонады солнечного оттенка, тирамису и многие другие позиции, знакомые всем.",
            imageResId = R.drawable.mama_pizza,
            category = "Рестораны"
        )
    )

    fun getAllRestaurants(): List<Recommendation> {
        return restaurants
    }
}
