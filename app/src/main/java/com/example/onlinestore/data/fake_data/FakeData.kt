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
                price = 2250,
                imageUrl = "https://imobilka-optom.ru/image/cache/catalog/pics/86251.970-1000x1000.jpg"
            ),
            AllCategory(
                UUID.randomUUID().toString(),
                title = "Mack Book",
                descripition = "Mover.Maker.Boundary breaker.",
                price = 120000,
                imageUrl = "https://www.notebookcheck.com/fileadmin/Notebooks/News/_nc3/HP_Omen_Victus.jpg"
            ),
            AllCategory(
                UUID.randomUUID().toString(),
                title = "Li-Ning YUEYING ",
                descripition = "Мужские кроссовки для бега",
                price = 2250,
                imageUrl = "https://avatars.dzeninfra.ru/get-zen_doc/2746730/pub_5f3512b0bfb29f5b5d7f4350_5f3512faeae0783182a660f5/scale_1200"
            ),
            AllCategory(
                UUID.randomUUID().toString(),
                title = "Jordan 1 Retro",
                descripition = "Мужские кроссовки для бега",
                price = 25500,
                imageUrl = "https://u.kanobu.ru/editor/images/99/e3b3d214-aa64-4ebc-baf4-564e95a0ea68.webp"
            ),
            AllCategory(
                UUID.randomUUID().toString(),
                title = "Orient AG03001W",
                descripition = "Мужские часы",
                price = 85500,
                imageUrl = "https://www.alltime.ru/obj/catalog/watch/orient/img/big/AG03001W.jpg"
            ),
            AllCategory(
                id = UUID.randomUUID().toString(),
                title = "Louis Vuitton x Nike Air Force 1 (Sotheby’s)",
                price = 126500,
                descripition = "Sotheby’s Louis Vuitton x Nike Air Force 1 Low",
                imageUrl = "https://sneakerfreak.ru/wp-content/uploads/2022/12/Louis-Vuitton-x-Nike-Air-Force-1-Sothebys-scaled.jpg",
            ),
            AllCategory(
                id = UUID.randomUUID().toString(),
                title = "Jordan 1 Retro High Shinedown Attention Attention PE",
                price = 5000,
                descripition = "These sneakers were made especially for the band Shinedown in honor of the release of their latest album Attention Attention",
                imageUrl = "https://u.kanobu.ru/editor/images/99/e3b3d214-aa64-4ebc-baf4-564e95a0ea68.webp",
            ),

            AllCategory(
                id = UUID.randomUUID().toString(),
                title = "Rolex Cosmograph",
                price = 86000,
                descripition = "Rolex Cosmograph Daytona 40mm Yellow Gold 116508-0013",
                imageUrl = "https://alimentola.info/uploads/posts/2022-01/1641417476_39-alimentola-info-p-chasi-roleks-brilliantovie-devushka-krasiv-40.jpg"
            ),

            AllCategory(
                id = UUID.randomUUID().toString(),
                title = "Orient AG03001W",
                price = 34200,
                descripition = "Japanese mechanical wristwatch Orient AG03001W",
                imageUrl = "https://www.alltime.ru/obj/catalog/watch/orient/img/big/AG03001W.jpg"
            ),
            AllCategory(
                id = UUID.randomUUID().toString(),
                title = "Voutilainen",
                price = 35000,
                descripition = "Selfwinding Perpetual Calendar Ultra-Thin.",
                imageUrl = "https://www.alltime.ru/obj/article/image-blog/rejting_chasov/rejting_chasov_6.jpg",
            ),

            AllCategory(
                id = UUID.randomUUID().toString(),
                title = "Skullcandy Method Active Wireless Headphones",
                price = 4800,
                imageUrl = "https://thumb.tildacdn.com/tild3365-3834-4530-b931-306639303339/-/format/webp/method_active_wirele.jpg",
                descripition = "Wireless sports headphones Skullcandy Method Active Wireless - waterproof (IPX7), with a magnetic mount are perfect for active training",
            ),

            AllCategory(
                id = UUID.randomUUID().toString(),
                title = "Skullcandy Venue Headphones",
                price = 4800,
                imageUrl = "https://thumb.tildacdn.com/tild6338-6362-4761-a435-366432316137/-/format/webp/venue_black.jpg",
                descripition = "Overhead wireless headphones Skullcandy Venue have a fairly minimalistic design and a small company logo on the side",
            ),
            AllCategory(
                id = UUID.randomUUID().toString(),
                title = "JBL Flip Essential (Original) Column",
                price = 79,
                imageUrl = "https://www.gadget.kg/upload/catalog/57/item_5622/7efab3899b54f83ea028702115ff49b7.jpg",
                descripition = "JBL Flip Essential is equipped with a built–in lithium-ion battery" +
                        " with a capacity of 3000 mAh, which will allow you to listen to music for" +
                        " up to 10 hours without having to recharge. The time to fully charge " +
                        "the battery from \"zero\" is about 3.5 hours.",
            ),
        )

        fun fakeCategoryEvent() = listOf(
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Electronics",
                imageUrl = "https://www.alltime.ru/obj/catalog/watch/casio/img/big/EFA-120L-1A1VEF__3.jpg",
            ),
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Musics",
                imageUrl = "https://uncrate.com/p/2012/02/lazerwood-beats-xl.jpg",
            ),
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Fashion",
                imageUrl = "https://www.cracklimb.com/phone/data/cracklimb/product/20191219_7654bd.jpg",
            ),
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Digital Service",
                imageUrl = "https://resortturkey.ru/wp-content/uploads/2021/04/69953.jpg",
            ),
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Fashion",
                imageUrl = "https://newstimeusa.com/wp-content/uploads/2022/09/0907-Houseplants.jpg",
            ),
            CategoryEvent(
                UUID.randomUUID().toString(),
                title = "Digital Service",
                imageUrl = "https://releika.ru/wp-content/uploads/c/b/a/cba19759bc265ae6e49f3b16845c45af.jpeg",
            )
        )

        fun fakeRecommendationEvent() = listOf(
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "https://static.halyavshiki.com/ei/r/w870/e757711d1fe32e8789d2bf268710dee3.png",
            ),
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "https://telegra.ph/file/fe31a0c0158439bd001d8.jpg",
            ),
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "https://raduga-center.ru/files/images/301273_content.jpg",
            ),
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "https://static.onlinetrade.ru/img/actions/894293-sturling_894.jpg",
            ),
            RecommendationEvent(
                UUID.randomUUID().toString(),
                imageUrl = "https://www.pronline.ru/ri/3662/OSTIN-POKUPAI-BOLShIe---PLATI-MIeNShIe-dlia-publikatsii-na-saitie_2.png",
            ),
        )

        fun fakeTopProduct() = listOf(
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Sport Band",
                price = 2950,
                imageUrl = "https://i.ytimg.com/vi/ANK71MYaqsY/maxresdefault.jpg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Headphones",
                price = 3750,
                imageUrl = "https://jannah.tielabs.com/tech/wp-content/uploads/sites/10/2016/12/headphones-instagram-video-games-razer-159463.jpeg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Laptop Victus",
                price = 82000,
                imageUrl = "https://www.notebookcheck.com/fileadmin/Notebooks/News/_nc3/HP_Omen_Victus.jpg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Cosmograph Daytona",
                price = 950000,
                imageUrl = "https://media.petitegeneve.com/uploads/2020-02-03/Petite-Geneve-Petrovic-2020-02-03-rolex-cosmograph-daytona-ref-116508-01.jpg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Summer  Walk Loafers",
                price = 80000,
                imageUrl = "https://eac-sale.ru/obuv/images/30-12.jpg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Louis Vuitton",
                price = 125000,
                imageUrl = "https://sneakerfreak.ru/wp-content/uploads/2022/12/Louis-Vuitton-x-Nike-Air-Force-1-Sothebys-scaled.jpg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Rolex ",
                price = 659000,
                imageUrl = "https://alimentola.info/uploads/posts/2022-01/1641417476_39-alimentola-info-p-chasi-roleks-brilliantovie-devushka-krasiv-40.jpg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Voutilainen",
                price = 805000,
                imageUrl = "https://www.alltime.ru/obj/article/image-blog/rejting_chasov/rejting_chasov_6.jpg",
            ),
            TopProduct(
                UUID.randomUUID().toString(),
                title = "Skullcandy Headphones",
                price = 8000,
                imageUrl = "https://thumb.tildacdn.com/tild3365-3834-4530-b931-306639303339/-/format/webp/method_active_wirele.jpg",
            ),
            TopProduct(
                id = UUID.randomUUID().toString(),
                title = "FOSSIL ME3110",
                price = 19100,
                imageUrl = "https://s11.stc.all.kpcdn.net/woman/wp-content/uploads/2022/02/shablon9-1.jpg",
            ),


            TopProduct(
                id = UUID.randomUUID().toString(),
                title = "Nike MAG Back to the Future",
                price = 44000,
                imageUrl = "https://u.kanobu.ru/editor/images/53/ea8dd1e3-8af8-43c5-8c70-c531ac487711.webp",
            ),


            TopProduct(
                id = UUID.randomUUID().toString(),
                title = "Casio G-SHOCK",
                price = 7400,
                imageUrl = "https://www.alltime.ru/obj/article/image-blog/dorogie-chasy/dorogie-chasy_31.jpg",
            ),
            TopProduct(
                id = UUID.randomUUID().toString(),
                title = "Nike SB Dunk Low Freddy Krueger",
                price = 35000,
                imageUrl = "https://u.kanobu.ru/editor/images/49/fc7b6912-47ca-4758-8ddb-7c61075b85bd.webp",
            ),
            TopProduct(
                id = UUID.randomUUID().toString(),
                title = "Voutilainen",
                price = 35000,
                imageUrl = "https://www.alltime.ru/obj/article/image-blog/rejting_chasov/rejting_chasov_6.jpg",
            ),
            TopProduct(
                id = UUID.randomUUID().toString(),
                title = "Skullcandy Ink'd Wireless Headphones",
                price = 3800,
                imageUrl = "https://thumb.tildacdn.com/tild3761-3332-4966-b237-363537653730/-/format/webp/inkd_wireless_white.jpg",
            ),
            TopProduct(
                id = UUID.randomUUID().toString(),
                title = "Skullcandy Crusher Wireless Headphones",
                price = 12200,
                imageUrl = "https://thumb.tildacdn.com/tild3730-3261-4563-b964-363734653631/-/format/webp/Crusher_Wireless_Bla.jpg",
            ),
            TopProduct(
                id = UUID.randomUUID().toString(),
                title = "Portable Bluetooth speaker with Backlight Fighter 308",
                price = 100,
                imageUrl = "https://www.gadget.kg/upload/catalog/59/item_5875/52cd23b1ddd58a6faf27fcbb5f0523c9.jpg",
            ),
        )
    }
}
