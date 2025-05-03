package com.example.cityapp.data.models.repositories

import com.example.cityapp.R
import com.example.cityapp.data.models.Recommendation

class ParksRepository {

    private val parks = listOf(
        Recommendation(
            id = 4,
            title = "Сквер Победы",
            address = "Расположен в центре города, рядом с музеем им. Кузебая Герда (Коммунаров, 287).",
            description = "Одно из любимых мест отдыха горожан. Здесь можно прогуляться по тенистым тропинкам, покататься на велосипеде или самокате, а также покормить голубей.",
            imageResId = R.drawable.skver_pobedy,
            category = "Парки"
        ),
        Recommendation(
            id = 4,
            title = "Парк Кирова",
            address = "Кирова, 8а",
            description = "Самая большая в Ижевске лесопарковая территория. Это место для прогулок, велоспорта, пробежек. Зимой тут организованы каток и лыжная трасса, благодаря сохраненному рельефу местности, здесь регулярно проходят спортивные состязания по скандинавской ходьбе.",
            imageResId = R.drawable.park_kirova,
            category = "Парки"
        ),
        Recommendation(
            id = 4,
            title = "Парк Горького",
            address = "Милиционная, 4",
            description = "Одно из самых известных и старейших общественных пространств Ижевска. Это место сосредоточения городских аттракционов, здесь проходят масштабные мероприятия, праздники и аутентичные фестивали.",
            imageResId = R.drawable.park_gorkogo,
            category = "Парки"
        ),
        Recommendation(
            id = 4,
            title = "Парк Космонавтов",
            address = "Находится в Индустриальном районе, рядом с Русским домом (Воткинское шоссе, 118).",
            description = "Это место, где можно провести время всей семьей. Здесь есть аттракционы для детей и взрослых, а также дендропарк с разнообразными растениями и скульптурами.",
            imageResId = R.drawable.park_kosmonavtov,
            category = "Парки"
        ),
        Recommendation(
            id = 4,
            title = "Берёзовая роща",
            address = "Расположен в Индустриальном районе рядом с Восточным посёлком, трамвайная ост. ул. Авангардная",
            description = "Это парк культуры и отдыха, расположенный в Ижевске. Он был реконструирован в 2024 году и стал еще более красивым и уютным.",
            imageResId = R.drawable.beryozovaya_rosha,
            category = "Парки"
        )
    )

    fun getAllParks(): List<Recommendation> {
        return parks
    }
}
