package com.example.onlinestore.data.fake_data

import com.example.onlinestore.domain.models.AllCategory
import com.example.onlinestore.domain.models.CategoryEvent
import com.example.onlinestore.domain.models.RecommendationEvent
import com.example.onlinestore.domain.models.TopProduct
import java.util.UUID

class FakeData {
    companion object {
        fun fakeAllCategory() = listOf(
            AllCategory(
                UUID.randomUUID().toString(),
                title = "Snopy Headphone",
                descripition = "Snopy SN- BT96 Pretty Back\n Bluetooth Headphone",
                prise = 2250,
                imageUrl = "https://imobilka-optom.ru/image/cache/catalog/pics/86251.970-1000x1000.jpg"
            ),
            AllCategory(
                UUID.randomUUID().toString(),
                title = "Mack Book",
                descripition = "Mover. Maker.\n Boundary breaker. ",
                prise = 120000,
                imageUrl = "https://rare-gallery.com/thumbs/510272-colour-interior.jpg"
            ),
            AllCategory(
                UUID.randomUUID().toString(),
                title = "Li-Ning YUEYING ",
                descripition = "Мужские кроссовки для бега",
                prise = 2250,
                imageUrl = "https://avatars.dzeninfra.ru/get-zen_doc/2746730/pub_5f3512b0bfb29f5b5d7f4350_5f3512faeae0783182a660f5/scale_1200"
            ),
        )

        fun fakeCategoryEvent() = listOf(
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Electronics",
                imageUrl = "https://www.alltime.ru/obj/catalog/watch/casio/img/big/EFA-120L-1A1VEF__3.jpg"
            ),
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Musics",
                imageUrl = "https://uncrate.com/p/2012/02/lazerwood-beats-xl.jpg"
            ),
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Fashion",
                imageUrl = "https://www.cracklimb.com/phone/data/cracklimb/product/20191219_7654bd.jpg"
            ),
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Digital Service",
                imageUrl = "https://resortturkey.ru/wp-content/uploads/2021/04/69953.jpg"
            ),
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Fashion",
                imageUrl = "https://newstimeusa.com/wp-content/uploads/2022/09/0907-Houseplants.jpg"
            ),
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Digital Service",
                imageUrl = "https://releika.ru/wp-content/uploads/c/b/a/cba19759bc265ae6e49f3b16845c45af.jpeg"
            )
        )

        fun fakeRecommendationEvent() = listOf(
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "https://static.halyavshiki.com/ei/r/w870/e757711d1fe32e8789d2bf268710dee3.png"
            ),
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "https://telegra.ph/file/fe31a0c0158439bd001d8.jpg"
            ),
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "https://raduga-center.ru/files/images/301273_content.jpg"
            ),
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "https://static.onlinetrade.ru/img/actions/894293-sturling_894.jpg"
            ),
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "http://c.dns-shop.ru/original/st1/b22c628c07132cf5134131534bcdddd0/e8425cfcec913eb510b35fcac8f04f4623f712552a9556b572b4243072fb7a28.jpg"
            ),
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "https://www.pronline.ru/ri/3662/OSTIN-POKUPAI-BOLShIe---PLATI-MIeNShIe-dlia-publikatsii-na-saitie_2.png"
            ),
        )

        fun fakeTopProduct() = listOf(
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Sport Band",
                prise = 2950,
                imageUrl = "https://i.ytimg.com/vi/ANK71MYaqsY/maxresdefault.jpg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Headphones",
                prise = 3750,
                imageUrl = "https://jannah.tielabs.com/tech/wp-content/uploads/sites/10/2016/12/headphones-instagram-video-games-razer-159463.jpeg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Laptop Victus",
                prise = 82000,
                imageUrl = "https://www.notebookcheck.com/fileadmin/Notebooks/News/_nc3/HP_Omen_Victus.jpg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Cosmograph Daytona",
                prise = 950000,
                imageUrl = "https://media.petitegeneve.com/uploads/2020-02-03/Petite-Geneve-Petrovic-2020-02-03-rolex-cosmograph-daytona-ref-116508-01.jpg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Summer Walk Loafers",
                prise = 80000,
                imageUrl = "https://eac-sale.ru/obuv/images/30-12.jpg",
            ),
        )
    }
}