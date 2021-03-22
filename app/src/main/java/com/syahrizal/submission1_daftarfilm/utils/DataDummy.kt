package com.syahrizal.submission1_daftarfilm.utils

import com.syahrizal.submission1_daftarfilm.R
import com.syahrizal.submission1_daftarfilm.data.MovieEntity
import com.syahrizal.submission1_daftarfilm.data.TVShowEntity

object DataDummy {

    private val dataMoviePoster = intArrayOf(
        R.drawable.poster_bohemian,
        R.drawable.poster_marry_queen,
        R.drawable.poster_master_z,
        R.drawable.poster_overlord,
        R.drawable.poster_ralph,
        R.drawable.poster_robin_hood,
        R.drawable.poster_serenity,
        R.drawable.poster_spiderman,
        R.drawable.poster_how_to_train,
        R.drawable.poster_t34
    )

    private val dataMovieName = arrayOf(
        "Bohemian Rhapsody",
        "Mary Queen of Scots",
        "Master Z: Ip Man Legacy",
        "Overlord",
        "Ralph Breaks the Internet",
        "Robin Hood",
        "Serenity",
        "Spiderman",
        "How To Train : The Hidden World",
        "T-34"
    )

    private val dataMovieYear = arrayOf(
        2018,
        2018,
        2018,
        2018,
        2018,
        2018,
        2019,
        2018,
        2019,
        2018
    )

    private val dataMovieGenre = arrayOf(
        "Musik, Drama, Sejarah",
        "Drama, Sejarah",
        "Tindakan",
        "Horor, Perang, Fiksi Ilmiah",
        "Keluarga, Animasi, Komedi, Petualangan",
        "Petualangan, Aksi, Thriller",
        "Thriller, Misteri, Drama",
        "Aksi, Petualangan, Animasi, Fiksi Ilmiah, Komedi",
        "Animasi, Keluarga, Petualangan",
        "Perang, Laga, Drama, Sejarah"
    )

    private val dataMovieTagLine = arrayOf(
        "Hidup tanpa rasa takut selamanya",
        "Tunduk pada Tidak Ada",
        "",
        "Hentikan yang tak terhentikan",
        "Siapa yang Merusak Internet?",
        "Legenda yang Anda tahu. Kisah yang tidak Anda ketahui.",
        "Di Pulau Plymouth, tidak ada yang pernah mati kecuali Anda melanggar aturan",
        "Lebih Dari Satu Orang Memakai Topeng",
        "Persahabatan seumur hidup",
        "Fast And Furious On Tanks"
    )

    private val dataMovieScore = arrayOf(
        80,
        66,
        58,
        67,
        72,
        59,
        54,
        84,
        78,
        69
    )

    private val dataMovieRelease = arrayOf(
        "11/02/2018 (US)",
        "12/21/2018 (US)",
        "12/26/2018 (TW)",
        "11/09/2018 (US)",
        "11/21/2018 (US)",
        "11/21/2018 (US)",
        "01/25/2019 (US)",
        "12/14/2018 (US)",
        "02/22/2019 (US)",
        "01/01/2019 (RU)"
    )


    private val dataMovieDuration = arrayOf(
        "2j 15m",
        "2j 4m",
        "1j 47m",
        "1j 50m",
        "1j 52m",
        "1j 56m",
        "1j 42m",
        "1j 57m",
        "1j 44m",
        "2j 19m"
    )

    private val dataMovieOverview = arrayOf(
        "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor, dan gitaris bass John Deacon menggemparkan dunia musik saat mereka membentuk band rock 'n' roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band tetap bersama di tengah kesuksesan dan kelebihan.",
        "Pada tahun 1561, Mary Stuart, janda Raja Prancis, kembali ke Skotlandia, merebut kembali tahtanya yang sah dan mengancam masa depan Ratu Elizabeth I sebagai penguasa Inggris, karena ia memiliki klaim yang sah atas takhta Inggris. Pengkhianatan, pemberontakan, konspirasi, dan pilihan hidup mereka sendiri membahayakan kedua Ratu. Mereka mengalami biaya pahit kekuasaan, hingga nasib tragis mereka akhirnya terwujud.",
        "Menyusul kekalahannya oleh Tuan Ip, Cheung Tin Chi mencoba hidup bersama putranya yang masih kecil di Hong Kong, menunggu meja di bar yang melayani ekspatriat. Tapi tidak lama kemudian, campuran orang asing, uang, dan pemimpin triad menarik dia sekali lagi untuk bertarung. ",
        "Prancis, Juni 1944. Pada malam D-Day, beberapa pasukan terjun payung Amerika tertinggal di belakang garis musuh setelah pesawat mereka jatuh saat dalam misi untuk menghancurkan menara radio di sebuah desa kecil dekat pantai Normandia. Setelah mencapai target mereka, pasukan Pasukan terjun payung yang masih hidup menyadari bahwa, selain melawan pasukan Nazi yang berpatroli di desa, mereka juga harus melawan sesuatu yang lain. ",
        "Si penjahat video game Ralph dan Vanellope von Schweetz yang tidak cocok harus mengambil risiko dengan melakukan perjalanan ke World Wide Web untuk mencari bagian pengganti untuk menyelamatkan video game Vanellope, Sugar Rush. Di luar kemampuan mereka, Ralph dan Vanellope mengandalkan warga internet - para netizen - untuk membantu menavigasi jalan mereka, termasuk seorang wirausahawan bernama Yesss, yang merupakan kepala algoritme dan jantung serta jiwa situs pembuat tren BuzzzTube. ",
        "Seorang Tentara Salib yang tangguh dalam perang dan komandan Moornya melakukan pemberontakan yang berani melawan mahkota Inggris yang korup.",
        "Kehidupan tenang Baker Dill, seorang kapten kapal nelayan yang tinggal di Pulau Plymouth yang terpencil, di mana dia menghabiskan hari-harinya dengan terobsesi dengan menangkap tuna yang sulit ditangkap saat melawan iblis pribadinya, terputus ketika seseorang dari masa lalunya datang kepadanya untuk mencari bantuan . ",
        "Miles Morales sedang menyulap hidupnya antara menjadi siswa sekolah menengah dan menjadi manusia laba-laba. Ketika Wilson Kingpin Fisk menggunakan super collider, orang lain dari seberang Spider-Verse dipindahkan ke dimensi ini.",
        "Saat Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'tentang pasangan yang tidak terkendali dan sulit dipahami menarik Night Fury pergi. Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga maupun penunggangnya harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka. ",
        "Pada tahun 1944, sekelompok tentara Rusia yang berani berhasil melarikan diri dari penangkaran Jerman dengan tank legendaris T-34 yang setengah hancur. Itu adalah saat-saat keberanian yang tak terlupakan, pertempuran sengit, cinta yang tak terpecahkan, dan keajaiban legendaris."
    )

    private val dataMoviePerson = arrayOf(
        "Anthony McCarten (Screenplay, Story), Bryan Singer (Director), Peter Morgan (Story)",
        "Josie Rourke (Director), Beau Willimon (Screenplay)",
        "Yuen Woo-ping (Director), Chan Tai-Li (Screenplay), Edmond Wong (Screenplay)",
        "Billy Ray (Screenplay, Story), Julius Avery (Director), Mark L. Smith (Screenplay)",
        "Phil Johnston (Director, Story, Writer), Rich Moore (Director, Story), Pamela Ribon (Story, Writer), Josie Trinidad (Story), Jim Reardon (Story)",
        "Ben Chandler (Screenplay, Story), Otto Bathurst (Director), David James Kelly (Screenplay)",
        "Steven Knight (Director, Screenplay)",
        "Rodney Rothman (Director, Screenplay,) Phil Lord (Screenplay, Story), Stan Lee (Characters), Steve Ditko (Characters), Peter Ramsey (Director), Bob Persichetti (Director)",
        "Dean DeBlois (Director, Screenplay, Story), Cressida Cowell (Novel)",
        "Alexey Sidorov (Director, Screenplay)"
    )


    private val dataTVShowPoster = intArrayOf(
        R.drawable.poster_iron_fist,
        R.drawable.poster_naruto_shipudden,
        R.drawable.poster_ncis,
        R.drawable.poster_riverdale,
        R.drawable.poster_shameless,
        R.drawable.poster_supergirl,
        R.drawable.poster_supernatural,
        R.drawable.poster_the_simpson,
        R.drawable.poster_the_umbrella,
        R.drawable.poster_the_walking_dead
    )

    private val dataTVShowName = arrayOf(
        "Marvel's Iron Fist",
        "Naruto Shippuden",
        "NCIS",
        "Riverdale",
        "Shameless",
        "Supergirl",
        "Supernatural",
        "The Simpsons",
        "The Umbrella Academy",
        "The Walking Dead"
    )

    private val dataTVShowYear = arrayOf(
        2017,
        2007,
        2003,
        2017,
        2011,
        2015,
        2005,
        1989,
        2019,
        2010
    )

    private val dataTVShowGenre = arrayOf(
        "Kriminal, Drama, Misteri, Laga & amp; Petualangan",
        "Animasi, Laga & Petualangan, Fiksi Ilmiah & Fantasi",
        "Kriminal, Laga & Petualangan, Drama",
        "Misteri, Drama, Kriminal",
        "Drama, Komedi",
        "Drama, Fiksi Ilmiah & Fantasi, Laga & Petualangan",
        "Drama, Misteri, Fiksi Ilmiah & Fantasi",
        "Keluarga, Animasi, Komedi",
        "Laga & Petualangan, Fiksi Ilmiah & Fantasi, Drama",
        "Aksi & Petualangan, Drama, Fiksi Ilmiah & Fantasi"
    )

    private val dataTVShowTagLine = arrayOf(
        " ",
        " ",
        " ",
        "Kota kecil. Rahasia besar.",
        " ",
        "Sebuah kekuatan melawan rasa takut",
        "Antara kegelapan dan pembebasan",
        "Sesuai keinginanmu, bersiaplah, d'oh!",
        "Super. Disfungsional. Keluarga.",
        "Lawan yang mati. Takut yang hidup."
    )

    private val dataTVShowScore = arrayOf(
        66,
        86,
        74,
        86,
        79,
        72,
        82,
        78,
        88,
        80
    )

    private val dataTVShowDuration = arrayOf(
        "55m",
        "25m",
        "45m",
        "45m",
        "1j",
        "42m",
        "45m",
        "22m",
        "55m",
        "42m"
    )

    private val dataTVShowOverview = arrayOf(
        "Danny Rand muncul kembali 15 tahun setelah dianggap mati. Sekarang, dengan kekuatan Iron Fist, dia berusaha untuk merebut kembali masa lalunya dan memenuhi takdirnya.",
        "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Ceritanya berkisar pada Uzumaki Naruto yang lebih tua dan sedikit lebih dewasa dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi yang mirip ular, Orochimaru. Setelah 2 dan setengah tahun Naruto akhirnya kembali ke desanya di Konoha, dan mulai menjalankan ambisinya, meskipun itu tidak akan mudah, karena Dia telah mengumpulkan beberapa musuh (yang lebih berbahaya), seperti organisasi shinobi; Akatsuki. ",
        "Dari pembunuhan dan spionase hingga terorisme dan kapal selam yang dicuri, tim agen khusus menyelidiki kejahatan apa pun yang memiliki sedikit pun bukti yang terkait dengan personel Angkatan Laut dan Korps Marinir, terlepas dari pangkat atau posisinya.",
        "Berlatar masa sekarang, serial ini menawarkan pandangan yang berani dan subversif tentang Archie, Betty, Veronica dan teman-teman mereka, menjelajahi kepastian kehidupan kota kecil, kegelapan dan keanehan yang menggelegak di bawah fasad Riverdale yang sehat.",
        "Frank Gallagher dari Chicago adalah ayah tunggal yang bangga dari enam anak yang cerdas, rajin, dan mandiri, yang tanpanya akan mungkin lebih baik. Ketika Frank tidak berada di bar menghabiskan sedikit uang yang mereka miliki, dia pingsan di lantai. Tetapi anak-anak telah menemukan cara untuk tumbuh meskipun dia. Mereka mungkin tidak seperti keluarga mana pun yang Anda kenal, tetapi mereka tidak meminta maaf karena menjadi diri mereka yang sebenarnya. ",
        "Kara Zor-El yang berusia dua puluh empat tahun, yang diambil oleh keluarga Danvers ketika dia berusia 13 tahun setelah diusir dari Krypton, harus belajar merangkul kekuatannya setelah sebelumnya menyembunyikannya. Danvers mengajarinya untuk berhati-hati. dengan kekuatannya, sampai dia harus mengungkapkannya selama bencana tak terduga, menempatkannya dalam perjalanan kepahlawanannya. ",
        "Ketika mereka masih kecil Sam dan Dean Winchester kehilangan ibu mereka karena kekuatan supernatural yang misterius dan jahat. Selanjutnya, ayah mereka membesarkan mereka menjadi tentara. Dia mengajari mereka tentang kejahatan paranormal yang hidup di sudut-sudut gelap dan di jalan belakang Amerika ... dan dia mengajari mereka cara membunuhnya. Sekarang, Winchester bersaudara melintasi negara dengan Chevy Impala 67 mereka, melawan setiap jenis ancaman supernatural yang mereka temui di sepanjang jalan. ",
        "Berlatar di Springfield, kota rata-rata di Amerika, acara ini berfokus pada kejenakaan dan petualangan sehari-hari keluarga Simpson; Homer, Marge, Bart, Lisa, dan Maggie, serta pemeran virtual ribuan orang. Sejak awal, serial ini memiliki menjadi ikon budaya pop, menarik ratusan selebritas untuk menjadi bintang tamu. Acara ini juga terkenal karena satirnya yang tak kenal takut tentang politik, media, dan kehidupan Amerika secara umum. ",
        "Sebuah keluarga pahlawan super yang disfungsional berkumpul untuk memecahkan misteri kematian ayah mereka, ancaman kiamat, dan banyak lagi.",
        "Wakil Sheriff Rick Grimes terbangun dari koma untuk menemukan dunia pasca-apokaliptik yang didominasi oleh zombie pemakan daging. Dia berangkat untuk menemukan keluarganya dan bertemu dengan banyak penyintas lainnya di sepanjang jalan."
    )

    private val dataTVShowPerson = arrayOf(
        "Scott Buck (Creator)",
        "_",
        "Donald P. Bellisario (Creator), Don McGill (Creator)",
        "Roberto Aguirre-Sacasa (Creator)",
        "Paul Abbott (Creator)",
        "Greg Berlanti (Creator), Ali Adler (Creator), Andrew Kreisberg (Creator)",
        "Eric Kripke (Creator)",
        "Matt Groening (Creator)",
        "Steve Blackman (Creator)",
        "Frank Darabont (Creator)"
    )

    fun generateDummyMoviesItem(): ArrayList<MovieEntity> {
        val movieEntities = ArrayList<MovieEntity>()
        for (position in dataMovieName.indices) {
            val movieEntity = MovieEntity(
                dataMoviePoster[position],
                dataMovieName[position],
                dataMovieYear[position],
                dataMovieRelease[position],
                dataMovieGenre[position],
                dataMovieDuration[position],
                dataMovieScore[position],
                dataMovieTagLine[position],
                dataMovieOverview[position],
                dataMoviePerson[position]
            )
            movieEntities.add(movieEntity)
        }
        return movieEntities
    }

    fun generateDummyTVShowsItem(): ArrayList<TVShowEntity> {
        val tvShowEntities = ArrayList<TVShowEntity>()
        for (position in dataTVShowName.indices) {
            val tvShowEntity = TVShowEntity(
                dataTVShowPoster[position],
                dataTVShowName[position],
                dataTVShowYear[position],
                dataTVShowGenre[position],
                dataTVShowDuration[position],
                dataTVShowScore[position],
                dataTVShowTagLine[position],
                dataTVShowOverview[position],
                dataTVShowPerson[position]
            )
            tvShowEntities.add(tvShowEntity)
        }
        return tvShowEntities
    }
}