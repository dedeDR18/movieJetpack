package id.learn.android.moviecatalogue.data

data class MovieEntitiy(
    var movieId: Int,
    var poster: Int,
    var title: String,
    var desc: String,
    var date_release: String,
    var user_score: Int,
    var duration: String,
    var writer: String,
    var director: String

)