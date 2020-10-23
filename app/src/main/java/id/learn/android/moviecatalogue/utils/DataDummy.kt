package id.learn.android.moviecatalogue.utils

import id.learn.android.moviecatalogue.R
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.TvShowEntitiy

object DataDummy {

    fun generateDummyMovies(): List<MovieEntitiy> {

        val movies = ArrayList<MovieEntitiy>()

        movies.add(
            MovieEntitiy(
                0,
                R.drawable.m_poster_a_start_is_born,
                "A Start Is Born",
                "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
                "05/10/2018",
                75,
                "2h 16m",
                "Robert Carson",
                "Bradley Cooper"
            )
        )
        movies.add(
            MovieEntitiy(
                1,
                R.raw.m_poster_alita,
                "Alita : Battle Angel",
                "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                "14/02/2019",
                71,
                "2h 2m",
                "James Cameron",
                "Robert Rodriguez"
            )
        )
        movies.add(
            MovieEntitiy(
                2,
                R.raw.m_poster_aquaman,
                "Aquaman",
                "Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah Atlantis dan pewaris sejati takhta.",
                "21/12/2018",
                69,
                "2h 24m",
                "Geoff Jhons",
                "James Wan"
            )
        )
        movies.add(
            MovieEntitiy(
                3,
                R.raw.m_poster_bohemian,
                "Bohemian Rhapsody",
                "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor, dan gitaris bass John Deacon menggemparkan dunia musik saat mereka membentuk band rock 'n' roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band tetap bersama di tengah kesuksesan dan kelebihan.",
                "02/11/2018",
                80,
                "2h 15m",
                "Peter Morgan",
                "Bryan Singer"
            )
        )
        movies.add(
            MovieEntitiy(
                4,
                R.raw.m_poster_cold_persuit,
                "Cold Persuit",
                "Kehidupan keluarga yang tenang dari Nels Coxman, seorang pengemudi bajak salju, berubah setelah pembunuhan putranya. Nels memulai perburuan dendam untuk Viking, raja obat bius yang dianggapnya bertanggung jawab atas pembunuhan tersebut, melenyapkan rekan-rekan Viking satu per satu. Saat Nels semakin dekat dengan Viking, tindakannya membawa konsekuensi yang lebih tidak terduga dan kejam, karena ia membuktikan bahwa balas dendam ada dalam eksekusi.",
                "08/02/2019",
                56,
                "1h 59m",
                "Frank Baldwin",
                "Hans Petter Moland"
            )
        )
        movies.add(
            MovieEntitiy(
                5,
                R.raw.m_poster_creed,
                "Creed II",
                "Antara kewajiban pribadi dan pelatihan untuk pertarungan besar berikutnya melawan lawan yang memiliki ikatan dengan masa lalu keluarganya, Adonis Creed menghadapi tantangan dalam hidupnya.",
                "21/11/2018",
                69,
                "2h 10m",
                "Sascha Penn",
                "Steven Caple Jr"
            )
        )
        movies.add(
            MovieEntitiy(
                6,
                R.raw.m_poster_crimes,
                "Crimes",
                "Gellert Grindelwald telah melarikan diri dari penjara dan telah mulai mengumpulkan pengikut ke tujuannya — meninggikan penyihir di atas semua makhluk non-magis. Satu-satunya yang bisa menghentikannya adalah penyihir yang pernah disebutnya sebagai sahabat terdekatnya, Albus Dumbledore. Namun, Dumbledore akan perlu mencari bantuan dari penyihir yang telah menggagalkan Grindelwald sebelumnya, mantan muridnya, Newt Scamander, yang setuju untuk membantu, tidak menyadari bahaya yang ada di depan. Garis-garis digambar saat cinta dan kesetiaan diuji, bahkan di antara teman-teman dan keluarga sejati, di dunia sihir yang semakin terbagi.",
                "16/11/2018",
                69,
                "2h",
                "J.K Rowling",
                "David Yates"
            )
        )
        movies.add(
            MovieEntitiy(
                7,
                R.raw.m_poster_glass,
                "Glass",
                "Dalam serangkaian pertemuan yang meningkat, mantan penjaga keamanan David Dunn menggunakan kemampuan supernaturalnya untuk melacak Kevin Wendell Crumb, seorang pria yang memiliki dua puluh empat kepribadian yang terganggu. Sementara itu, kehadiran bayangan Elijah Price muncul sebagai seorang orkestra yang menyimpan rahasia penting bagi keduanya.",
                "18/01/2019",
                66,
                "2h 9m",
                "M. Night Shyamalan",
                "M. Night Shyamalan"
            )
        )
        movies.add(
            MovieEntitiy(
                8,
                R.raw.m_poster_how_to_train,
                "How to Train Your Dragon",
                "Ketika Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'dari pasangan yang tak teruji dan sukar ditangkap membuat Night Fury menjauh. Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga dan pengendara harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
                "22/02/2019",
                78,
                "1h 44m",
                "Dean DeBlois",
                "Dean DeBlois"
            )
        )
        movies.add(
            MovieEntitiy(
                9,
                R.raw.m_poster_infinity_war,
                "Avengers: Infinity War",
                "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                "27/04/2018",
                83,
                "2h 29m",
                "Christopher Markus",
                "Joe & Anthony Russo"
            )
        )
        return movies
    }

    fun generateDummyTvshows(): List<TvShowEntitiy> {
        val tvshows = ArrayList<TvShowEntitiy>()
        tvshows.add(
            TvShowEntitiy(
                0,
                R.raw.t_poster_arrow,
                "The Arrow",
                "Panah adalah menceritakan kembali petualangan dari legendaris DC pahlawan Green Arrow",
                "10/10/2012",
                64,
                "42m",
                "Greg Berlanti"
            )
        )
        tvshows.add(
            TvShowEntitiy(
                1,
                R.raw.t_poster_doom_patrol,
                "Doom Patrol",
                "Anggota Doom Patrol masing-masing mengalami kecelakaan mengerikan yang memberi mereka kemampuan super - tapi juga membuat mereka terluka dan cacat. Trauma dan tertindas, tim menemukan tujuan melalui The Chief, yang mengumpulkan mereka untuk menyelidiki fenomena paling aneh yang ada - dan untuk melindungi Bumi dari apa yang mereka temukan.",
                "15/02/2019",
                75,
                "49m",
                "Jeremy Carver"
            )
        )
        tvshows.add(
            TvShowEntitiy(
                2,
                R.raw.t_poster_dragon_ball,
                "DragonBall Yabai",
                "Dragon Ball Z Yabai adalah anime animasi aksi-petualangan berdurasi 90 menit yang dibintangi oleh Nozawa Masako sebagai Gohan, Kozo Shioya sebagai Majin-Bu dan Shigeru Nakahara sebagai C-17.",
                "26/02/1986",
                100,
                "2h",
                "Akira Toriyama"
            )
        )
        tvshows.add(
            TvShowEntitiy(
                3,
                R.raw.t_poster_fairytail,
                "Fairy Tail",
                "Lucy adalah seorang gadis berusia 17 tahun, yang ingin menjadi penyihir sejati. Suatu hari ketika mengunjungi Kota Harujion, dia bertemu dengan Natsu, seorang pemuda yang mudah sakit oleh semua jenis transportasi. Tapi Natsu bukan sembarang anak biasa, dia adalah anggota dari salah satu guild penyihir paling terkenal di dunia: Fairy Tail.",
                "12/10/2009",
                74,
                "25m",
                "Hiro Mashima"
            )
        )
        tvshows.add(
            TvShowEntitiy(
                4,
                R.raw.t_poster_family_guy,
                "Family Guy",
                "Seri animasi animasi Freakin 'Sweet yang sakit, terpelintir, dan salah, menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri.",
                "31/01/1999",
                68,
                "22m",
                "Seth MacFarlane"
            )
        )
        tvshows.add(
            TvShowEntitiy(
                5,
                R.raw.t_poster_flash,
                "The Flash",
                "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. Barry bermitra dengan S.T.A.R. Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat, tetapi tidak lama sebelum dunia mengetahui apa yang menjadi Barry Allen ... The Flash.",
                "07/10/2014",
                75,
                "44m",
                "Greg Berlanti"
            )
        )
        tvshows.add(
            TvShowEntitiy(
                6,
                R.raw.t_poster_god,
                "Game of Thrones",
                "Tujuh keluarga bangsawan berjuang untuk menguasai tanah mitos Westeros. Gesekan antara rumah-rumah mengarah ke perang skala penuh. Semua sementara kejahatan yang sangat kuno terbangun di utara terjauh. Di tengah-tengah perang, perintah militer yang diabaikan, Night's Watch, adalah yang berdiri di antara alam manusia dan kengerian es di luarnya.",
                "17/04/2011",
                83,
                "1h",
                "David Benioff"
            )
        )
        tvshows.add(
            TvShowEntitiy(
                7,
                R.raw.t_poster_gotham,
                "Gotham",
                "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
                "22/09/2014",
                73,
                "43m",
                "Bruno Heller"
            )
        )
        tvshows.add(
            TvShowEntitiy(
                8,
                R.raw.t_poster_grey_anatomy,
                "Grey's Anatomy",
                "Ikuti kehidupan pribadi dan profesional sekelompok dokter di Rumah Sakit Gray Sloan Memorial di Seattle.",
                "27/03/2005",
                80,
                "43m",
                "Shonda Rhimes"
            )
        )
        tvshows.add(
            TvShowEntitiy(
                9,
                R.raw.t_poster_hanna,
                "Hanna",
                "Film thriller dan drama coming-of-age ini mengikuti perjalanan seorang gadis muda yang luar biasa saat dia menghindari pengejaran tanpa henti dari agen CIA yang tidak bisa dipesan dan mencoba untuk mengungkap kebenaran di balik siapa dia. Berdasarkan film Joe Wright 2011.",
                "28/03/2019",
                74,
                "50m",
                "David Farr"
            )
        )
        return tvshows
    }

    fun generateMovie(movieId: Int): MovieEntitiy {
        lateinit var movie: MovieEntitiy
        val movies: List<MovieEntitiy> = generateDummyMovies()
        for (i in movies.indices) {
            if (movieId == movies[i].movieId) {
                movie = MovieEntitiy(
                    movies[i].movieId,
                    movies[i].poster,
                    movies[i].title,
                    movies[i].desc,
                    movies[i].date_release,
                    movies[i].user_score,
                    movies[i].duration,
                    movies[i].writer,
                    movies[i].director
                )
            }
        }
        return movie
    }

    fun generateTvshow(tvshowId: Int): TvShowEntitiy {
        lateinit var tvshow: TvShowEntitiy
        val tvshows: List<TvShowEntitiy> = generateDummyTvshows()
        for (i in tvshows.indices) {
            if (tvshowId == tvshows[i].tvshowId) {
                tvshow = TvShowEntitiy(
                    tvshows[i].tvshowId,
                    tvshows[i].poster,
                    tvshows[i].title,
                    tvshows[i].desc,
                    tvshows[i].date_release,
                    tvshows[i].user_score,
                    tvshows[i].duration,
                    tvshows[i].kreator
                )
            }
        }
        return tvshow
    }

}