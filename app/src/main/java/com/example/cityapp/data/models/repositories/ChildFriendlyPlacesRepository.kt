package com.example.cityapp.data.models.repositories

import com.example.cityapp.R
import com.example.cityapp.data.models.Recommendation

class ChildFriendlyPlacesRepository {

    private val childFriendlyPlaces = listOf(
        Recommendation(
            id = 3,
            title = "Центральная площадь",
            address = "Центральная площадь",
            description = "Площадь находится в Октябрьском районе Ижевска, в центральной части города. Пролегает от улицы Пушкинской до улицы Карла Маркса. Есть фонтаны, где очень весело играть детям.",
            imageResId = R.drawable.tsentralnaya_ploshad,
            category = "Места, подходящие для детей"
        ),
        Recommendation(
            id = 3,
            title = "Парк Горького",
            address = "Милиционная, 4",
            description = "Одно из самых известных и старейших общественных пространств Ижевска. Это место сосредоточения городских аттракционов, здесь проходят масштабные мероприятия, праздники и аутентичные фестивали.",
            imageResId = R.drawable.park_gorkogo,
            category = "Места, подходящие для детей"
        ),
        Recommendation(
            id = 3,
            title = "KIDO",
            address = "Петрова, 29",
            description = "Детский центр развлечений, где есть познавательная игротека, город профессий и парк чудес.",
            imageResId = R.drawable.kido,
            category = "Места, подходящие для детей"
        ),
        Recommendation(
            id = 3,
            title = "Квеструм.рф",
            address = "Лихвинцева, 46",
            description = "В Квеструм.рф Вы можете сыграть в квест для взрослых или подростков, пройти самые популярные VR-квесты и игры в мире, поучаствовать в одной из четырех шоу-игр, созданных по мотивам ТВ-шоу.",
            imageResId = R.drawable.kvestrum_rf,
            category = "Места, подходящие для детей"
        ),
        Recommendation(
            id = 3,
            title = "Сигма Парк",
            address = "пер. Широкий, 53",
            description = "Детский развлекательный центр. Здесь можно также заказать проведение праздников.",
            imageResId = R.drawable.sigma_park,
            category = "Места, подходящие для детей"
        )
    )

    fun getAllChildFriendlyPlaces(): List<Recommendation> {
        return childFriendlyPlaces
    }
}
