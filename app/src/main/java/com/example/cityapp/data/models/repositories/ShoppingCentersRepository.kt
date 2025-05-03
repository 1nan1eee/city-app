package com.example.cityapp.data.models.repositories

import com.example.cityapp.R
import com.example.cityapp.data.models.Recommendation

class ShoppingCentersRepository {

    private val shoppingCenters= listOf(
        Recommendation(
            id = 5,
            title = "ТРЦ \"Сигма\"",
            address = "пер. Широкий, 53",
            description = "Это место, где можно не только сделать покупки, но и провести время с пользой.",
            imageResId = R.drawable.trts_sigma,
            category = "Торговые центры"
        ),
        Recommendation(
            id = 5,
            title = "ТРК \"Петровский\"",
            address = "Петрова, 29",
            description = "Один из самых больших торговых центров в Ижевске. Здесь посетителям представлен большой выбор магазинов и развлекательных заведений: есть детский парк с автоматами, детский центр \"KIDO\", кинотеатр \"Алмаз Синема\", книжный магазин, хобби магазин, аниме магазин, многочисленные магазины одежды и другое.",
            imageResId = R.drawable.trk_petrovsky,
            category = "Торговые центры"
        ),
        Recommendation(
            id = 5,
            title = "МОЛЛ \"Матрица\"",
            address = "Баранова, 87",
            description = "Идеальное место для шопинга и отдыха! С его просторными магазинами, предлагающими все от модной одежды до электроники, вы обязательно найдете что-то по своему вкусу. В центре есть уютные кафе и рестораны, где можно насладиться вкусной едой и отдохнуть после покупок. МОЛЛ \"Матрица\" — это не просто шопинг, это целый мир удовольствий и эмоций!",
            imageResId = R.drawable.moll_matritsa,
            category = "Торговые центры"
        ),
        Recommendation(
            id = 5,
            title = "ТЦ \"МойПорт\"",
            address = "Кирова, 146",
            description = "Этот современный торговый центр предлагает широкий выбор бутиков, магазинов и ресторанов на любой вкус. Здесь вы найдете как известные бренды, так и уникальные локальные товары. \"МойПорт\" также славится своими культурными событиями: выставками и мастер-классами, которые делают каждое посещение незабываемым. Идеальное место для встреч с друзьями и семейных выходных!",
            imageResId = R.drawable.moy_port,
            category = "Торговые центры"
        )
    )

    fun getAllShoppingCenters(): List<Recommendation> {
        return shoppingCenters
    }
}
