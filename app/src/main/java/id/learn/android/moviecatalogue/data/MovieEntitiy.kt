package id.learn.android.moviecatalogue.data

import com.google.gson.annotations.SerializedName

data class MovieEntitiy(
    var idMovie: Long? = null,
    var popularity: Float? = null,
    var originalTitle: String? = null,
    var originalLanguage: String? = null,
    var posterPath: String? = null,
    var releaseDate: String? = null,
    var overview: String? = null,
    var voteAvarage: Float? = null

)