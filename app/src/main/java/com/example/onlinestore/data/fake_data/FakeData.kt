package com.example.onlinestore.data.fake_data

import com.example.onlinestore.domain.models.AllCategory
import com.example.onlinestore.domain.models.CategoryEvent
import java.util.UUID

class FakeData {
    companion object{
        fun fakeAllCategory() = listOf(
            AllCategory(
                UUID.randomUUID().toString(),
                title ="Snopy Headphone",
                descripition = "Snopy SN- BT96 Pretty Back\n Bluetooth Headphone",
                prise = 2250,
                imageUrl =  "https://imobilka-optom.ru/image/cache/catalog/pics/86251.970-1000x1000.jpg"
                ),
            AllCategory(
                UUID.randomUUID().toString(),
                title ="Mack Book",
                descripition = "Mover. Maker.\n Boundary breaker. ",
                prise = 120000,
                imageUrl =  "https://rare-gallery.com/thumbs/510272-colour-interior.jpg"
            ),
            AllCategory(
                UUID.randomUUID().toString(),
                title ="Li-Ning YUEYING ",
                descripition = "Мужские кроссовки для бега",
                prise = 2250,
                imageUrl =  "https://avatars.dzeninfra.ru/get-zen_doc/2746730/pub_5f3512b0bfb29f5b5d7f4350_5f3512faeae0783182a660f5/scale_1200"
            ),
        )
        fun fakeCategoryEvent()= listOf(
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
    }
}