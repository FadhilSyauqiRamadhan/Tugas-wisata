package com.Fadhil.wisata.model

import com.Fadhil.wisata.R

data class ModelWisata(
    val gambar : Int,
    val destinasi : String,
    val kota : String,
    val ket : String,
    val detail : String
)

object WisataList {
    fun getModel(): List<ModelWisata> {
        val itemModel1 = ModelWisata(
            R.drawable.fuji,
            "Tokyo Disney Resort",
            "Tokyo",
            "Dengan dua taman hiburan Disney – Tokyo Disneyland dan Tokyo DisneySea – ditambah hotel, pertokoan, dan banyak lagi,  menawarkan banyak keseruan dan pengalaman magis buat kamu.",
            "Dengan dua taman hiburan Disney – Tokyo Disneyland dan Tokyo DisneySea – ditambah hotel, pertokoan, dan banyak lagi,  menawarkan banyak keseruan dan pengalaman magis buat kamu. " +
                    "Ada banyak wahana seru yang bisa kamu eskplor di Tokyo Disneyland. Namun, bersiaplah untuk mengantre untuk wahana-wahana populer. Tips dari Klook, utamakan untuk segera menaiki wahana populer begitu kamu tiba di Tokyo Disneyland. Percayalah, antrean panjang itu terjadi karena wahana tersebut benar-benar seru untuk dinaiki." +
                    "Kalau kamu penggemar rollercoaster, jangan pernah berpikir untuk tidak menaiki  Space Mountain, yang akan membawamu terbang melewati berbagai galaksi dengan kecepatan tinggi; dan Big Thunder Mountain, yang bakal membawamu melarikan diri dari Wild West menggunakan kereta tambang. Selain wahana, kamu dapat mengikuti parade siang hari yang menjadi favorit banyak turis, Dreaming Up! Di parade ini kamu dapat melihat bermacam-macam karakter Disney berjalan mengelilingi taman. Buat Klook, Dreaming Up! Adalah pawai paling magis yang bisa kamu saksikan. Jangan lupa untuk mengeksplor 7 area tematik Tokyo Disneyland: World Bazaar, Tomorrowland, Toontown, Fantasyland, Critter Country, Westernland, dan Adventureland." +
                    "Ini pertama kalinya kamu berkunjung ke Tokyo Disneyland? Tenang, Klook sudah merangkum panduannya buat kamu ." +
                    "Jangan lupa, Tokyo Disney Resort juga memiliki Tokyo DisneySea. Di taman hiburan ini, kamu dapat bermain air sepuasnya di wahana-wahana yang tentunya juga bertema Disney.",
        )


        val itemModel2 = ModelWisata(
            R.drawable.dotonburi,
            "Dotonburi",
            "Osaka",
            "Pernah melihat papan iklan Glico Sign dengan gambar pelari yang mengangkat kedua tangannya? Yep, kalau sudah melihat papan iklan legendaris ini, artinya kamu sudah sampai di Dotonbori, Osaka.",
            "Dotonbori ibarat Shibuya-nya Osaka. Pusat perbelanjaan yang begitu sibuk dan menjadi shopping destination favorit para turis. Di sini kamu dapat berbelanja atau sekadar berfoto di depan papan iklan yang konon sudah dipasang sejak 1935. \n" +
                    "Di kawasan ini pula kamu dapat menikmati berbagai jenis makanan khas dan hiburan malam khas Osaka. Selain itu, di sekitar Dotonbori terdapat beberapa destinasi yang sayang kamu lewatkan, termasuk Tombori River Cruise Osaka yang membuatmu dapat menyusuri Sungai Dotonbori.",
        )


        val itemModel3 = ModelWisata(
            R.drawable.sapporo_snow_festifal,
            "Hokkaido",
            "Sapporo Snow Festifal",
            "Sapporo Snow Festival, yang berlangsung setiap bulan Februari di Kota Sapporo di Hokkaido bukan sekadar pameran patung salju, namun juga sebuah perayaan budaya Sapporo.",
            "Festival ini terkenal dengan patung-patung saljunya yang spektakuler dan monumental, yang dibangun oleh seniman dari berbagai negara. Suasana di malam hari terasa ajaib, dengan patung-patung salju yang diwarnai oleh berbagai lampu warna warni sehingga memancarkan keindahan magis.\n" +
                    "Selain keindahan patung salju, Festival Salju Sapporo juga menyajikan berbagai aktivitas menarik lainnya. Pengunjung dapat menikmati berbagai permainan salju, seperti snow rafting atau snowboarding. Kuliner khas Hokkaido, seperti sup miso yang hangat atau Sapporo ramen, menjadi santapan yang sempurna untuk menghangatkan tubuh di tengah suhu dingin.",
        )


        val itemModel4 = ModelWisata(
            R.drawable.shirakawa_go,
            "Shirakawa-go",
            "Gifu",
            "yang terletak di bagian tengah Jepang terkenal akan rumah-rumah tradisionalnya yang beratap curam dari jerami dan dikelilingi oleh alam yang subur.",
            " Pemandangan menakjubkan dan suasana damai yang menyertainya membuat Situs Warisan Dunia UNESCO ini memang sangat layak untuk dikunjungi!\n" +
                    "Ada beberapa alternatif yang bisa kamu ambil untuk menuju Shirakawa-go. Kamu bisa menggunakan, bus, kereta, atau dengan . \n" +
                    "Rasakan sendiri suasana damai Shirakawa-go dengan mengunjungi destinasi-destinasi favoritnya, mulai dari Ogimachi Village, Deai-bashi Bridge, Shirakawa Hachiman Shinto Shrine, hingga Kanda House. Di musim apa pun kamu berkunjung, Klook jamin perjalananmu ke Shirakawa-go tidak akan mengecewakan.",
        )

        val itemModel5 = ModelWisata(
            R.drawable.biei_blue_pond,
            "Biei Blue Pond",
            "Hokkaido",
            "Biei Blue Pond adalah fenomena alam yang menarik di Hokkaido, dengan warna airnya yang unik, perpaduan menakjubkan antara biru dan hijau yang berubah sesuai dengan cuaca dan musim.",
            "Warna unik ini disebabkan oleh kandungan mineral dalam air kolam, dan semakin indah lagi karena kolamnya dikelilingi oleh hutan pinus yang membuat pemandangan di sini semakin indah.\n" +
                    "Untuk mengunjungi Biei Blue Pond dari Sapporo menggunakan transportasi umum, kamu bisa memanfaatkan bus dari Stasiun Biei ke Shirogane Onsen."
        )

        val itemList: ArrayList<ModelWisata> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList

    }
}


