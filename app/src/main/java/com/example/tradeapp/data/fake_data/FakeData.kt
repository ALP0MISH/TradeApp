package com.example.tradeapp.data.fake_data

import com.example.tradeapp.domain.models.AllProducts
import com.example.tradeapp.domain.models.Category
import com.example.tradeapp.domain.models.Featured
import com.example.tradeapp.domain.models.Resale
import java.util.UUID

class FakeData {

    companion object {

        fun fakeAll() = listOf(

            AllProducts(
                id = UUID.randomUUID().toString(),
                title = "Louis Vuitton x Nike Air Force 1 (Sotheby’s)",
                price = "$126,500",
                favorite = false,
                description = "Sotheby’s Louis Vuitton x Nike Air Force 1 Low",
                imageId = "https://sneakerfreak.ru/wp-content/uploads/2022/12/Louis-Vuitton-x-Nike-Air-Force-1-Sothebys-scaled.jpg",
            ),


            AllProducts(
                id = UUID.randomUUID().toString(),
                title = "Jordan 1 Retro High Shinedown Attention Attention PE",
                price = "$50,000",
                favorite = false,
                description = "These sneakers were made especially for the band Shinedown in honor of the release of their latest album Attention Attention",
                imageId = "https://u.kanobu.ru/editor/images/99/e3b3d214-aa64-4ebc-baf4-564e95a0ea68.webp",
            ),



            AllProducts(
                id = UUID.randomUUID().toString(),
                title = "Rolex Cosmograph",
                price = "$86,000",
                favorite = false,
                description =  "Rolex Cosmograph Daytona 40mm Yellow Gold 116508-0013",
                imageId = "https://alimentola.info/uploads/posts/2022-01/1641417476_39-alimentola-info-p-chasi-roleks-brilliantovie-devushka-krasiv-40.jpg"
            ),

            AllProducts(
                id = UUID.randomUUID().toString(),
            title = "Orient AG03001W",
            price = "$34,200",
            favorite = false,
            description =  "Japanese mechanical wristwatch Orient AG03001W",
            imageId = "https://www.alltime.ru/obj/catalog/watch/orient/img/big/AG03001W.jpg"
        ),
            AllProducts(
                id = UUID.randomUUID().toString(),
                title = "Voutilainen",
                price = "$35,000",
                favorite = false,
                description ="Selfwinding Perpetual Calendar Ultra-Thin." ,
                imageId = "https://www.alltime.ru/obj/article/image-blog/rejting_chasov/rejting_chasov_6.jpg",
            ),

            AllProducts(
                id = UUID.randomUUID().toString(),
                title = "Skullcandy Method Active Wireless Headphones",
                price = "$48",
                imageId = "https://thumb.tildacdn.com/tild3365-3834-4530-b931-306639303339/-/format/webp/method_active_wirele.jpg",
                 description = "Wireless sports headphones Skullcandy Method Active Wireless - waterproof (IPX7), with a magnetic mount are perfect for active training",
                favorite = false,
            ),

            AllProducts(
                id = UUID.randomUUID().toString(),
                title = "Skullcandy Venue Headphones",
                price = "$48",
                imageId = "https://thumb.tildacdn.com/tild6338-6362-4761-a435-366432316137/-/format/webp/venue_black.jpg",
                description = "Overhead wireless headphones Skullcandy Venue have a fairly minimalistic design and a small company logo on the side",
                favorite = false,

                ),

                AllProducts(
                    id = UUID.randomUUID().toString(),
                    title = "JBL Flip Essential (Original) Column",
                    price = "$79",
                    imageId = "https://www.gadget.kg/upload/catalog/57/item_5622/7efab3899b54f83ea028702115ff49b7.jpg",
                    description = "JBL Flip Essential is equipped with a built–in lithium-ion battery" +
                            " with a capacity of 3000 mAh, which will allow you to listen to music for" +
                            " up to 10 hours without having to recharge. The time to fully charge " +
                            "the battery from \"zero\" is about 3.5 hours.",
                    favorite = false,
            ),
        )

        fun fakeFeatured() = listOf(
            Featured(
                id = UUID.randomUUID().toString(),
                title = "FOSSIL ME3110",
                price = "$19,100",
                favorite = false,
                imageId = "https://s11.stc.all.kpcdn.net/woman/wp-content/uploads/2022/02/shablon9-1.jpg",
                isFeaturedCategory = true
            ),


            Featured(
                id = UUID.randomUUID().toString(),
                title = "Nike MAG Back to the Future",
                price = "$44,000",
                imageId = "https://u.kanobu.ru/editor/images/53/ea8dd1e3-8af8-43c5-8c70-c531ac487711.webp",
                isFeaturedCategory = true,
                favorite = true,
            ),



            Featured(
                id = UUID.randomUUID().toString(),
                title = "Casio G-SHOCK",
                price = "$7,400",
                favorite = false,
                imageId = "https://www.alltime.ru/obj/article/image-blog/dorogie-chasy/dorogie-chasy_31.jpg",
                isFeaturedCategory = true
            ),


            Featured(
                id = UUID.randomUUID().toString(),
                title = "Nike SB Dunk Low Freddy Krueger",
                price = "$35,000",
                imageId = "https://u.kanobu.ru/editor/images/49/fc7b6912-47ca-4758-8ddb-7c61075b85bd.webp",
                isFeaturedCategory = true,
                favorite = false,

                ),

            Featured(
                    id = UUID.randomUUID().toString(),
                    title = "Voutilainen",
                    price = "$35,000",
                    favorite = false,
                    imageId = "https://www.alltime.ru/obj/article/image-blog/rejting_chasov/rejting_chasov_6.jpg",
                    isFeaturedCategory = true
                ),

            Featured(
                id = UUID.randomUUID().toString(),
                title = "Skullcandy Ink'd Wireless Headphones",
                price = "$38",
                imageId = "https://thumb.tildacdn.com/tild3761-3332-4966-b237-363537653730/-/format/webp/inkd_wireless_white.jpg",
                isFeaturedCategory = true,
                favorite = false,
            ),

            Featured(
                id = UUID.randomUUID().toString(),
                title = "Skullcandy Crusher Wireless Headphones",
                price = "$122",
                imageId = "https://thumb.tildacdn.com/tild3730-3261-4563-b964-363734653631/-/format/webp/Crusher_Wireless_Bla.jpg",
                isFeaturedCategory = true,
                favorite = false,
            ),

            Featured(
                id = UUID.randomUUID().toString(),
                title = "Portable Bluetooth speaker with Backlight Fighter 308",
                price = "$10",
                imageId = "https://www.gadget.kg/upload/catalog/59/item_5875/52cd23b1ddd58a6faf27fcbb5f0523c9.jpg",
                isFeaturedCategory = true,
                favorite = false,
            ),

            )
            fun FakeResale() = listOf(
                Resale(
                    id = UUID.randomUUID().toString(),
                    title = "Jordan 1 Retro High Shinedown Attention Attention PE",
                    description = "These sneakers were made especially for the band Shinedown in honor of the release of their latest album Attention Attention",
                    imageId = "https://actions.s1.citilink.ru/304864_content.jpg",
                ),

                Resale(
                    id = UUID.randomUUID().toString(),
                    title = "Rolex Cosmograph",
                    description =  "Rolex Cosmograph Daytona 40mm Yellow Gold 116508-0013",
                    imageId = "https://static.halyavshiki.com/ei/r/w870/b14681393c1f33f04c675325124b1f80.jpg"
                    ),

                Resale(
                    id = UUID.randomUUID().toString(),
                    title = "Voutilainen",
                    description ="Selfwinding Perpetual Calendar Ultra-Thin." ,
                    imageId = "https://i.ytimg.com/vi/OFk29ABc3gw/maxresdefault.jpg",
                ),

                )

        fun fakeCategory() = listOf(

            Category(
                id = UUID.randomUUID().toString(),
                title = "Louis Vuitton x Nike Air Force 1 (Sotheby’s)",
                isSimpleNote = false,
                description = "Louis Vuitton",
                imageId = "https://sneakerfreak.ru/wp-content/uploads/2022/12/Louis-Vuitton-x-Nike-Air-Force-1-Sothebys-scaled.jpg",
            ),


            Category(
                id = UUID.randomUUID().toString(),
                title = "Jordan 1 Retro High Shinedown Attention Attention PE",
                isSimpleNote = true,
                description = "Jordan",
                imageId = "https://u.kanobu.ru/editor/images/99/e3b3d214-aa64-4ebc-baf4-564e95a0ea68.webp",
            ),



            Category(
                id = UUID.randomUUID().toString(),
                title = "Rolex Cosmograph",
                isSimpleNote = false,
                description =  "Rolex Cosmograph",
                imageId = "https://alimentola.info/uploads/posts/2022-01/1641417476_39-alimentola-info-p-chasi-roleks-brilliantovie-devushka-krasiv-40.jpg"
            ),

            Category(
                id = UUID.randomUUID().toString(),
                title = "Orient AG03001W",
                isSimpleNote = true,
                description =  "Japanese mechanical",
                imageId = "https://www.alltime.ru/obj/catalog/watch/orient/img/big/AG03001W.jpg"
            ),
            Category(
                id = UUID.randomUUID().toString(),
                title = "Voutilainen",
                isSimpleNote = true,
                description = "Voutilainen" ,
                imageId = "https://www.alltime.ru/obj/article/image-blog/rejting_chasov/rejting_chasov_6.jpg",
            ),

            Category(
                id = UUID.randomUUID().toString(),
                title = "Skullcandy Method Active Wireless Headphones",
                isSimpleNote = true,
                imageId = "https://thumb.tildacdn.com/tild3365-3834-4530-b931-306639303339/-/format/webp/method_active_wirele.jpg",
                description = "Wireless Headphone",
            ),

            Category(
                id = UUID.randomUUID().toString(),
                title = "Skullcandy Venue Headphones",
                isSimpleNote = true,
                imageId = "https://thumb.tildacdn.com/tild6338-6362-4761-a435-366432316137/-/format/webp/venue_black.jpg",
                description = "Headphones",

                ),

            Category(
                id = UUID.randomUUID().toString(),
                title = "JBL Flip Essential (Original) Column",
                imageId = "https://www.gadget.kg/upload/catalog/57/item_5622/7efab3899b54f83ea028702115ff49b7.jpg",
                description = "Column",
                isSimpleNote = true
            ),
        )



    }
}