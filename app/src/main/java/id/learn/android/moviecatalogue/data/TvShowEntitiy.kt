package id.learn.android.moviecatalogue.data

import com.google.gson.annotations.SerializedName

data class TvShowEntitiy(
    var idTvShow: Long? = null,
    var popularity: Float? = null,
    var originalLanguage: String? = null,
    var originalName: String? = null,
    var posterPath: String? = null,
    var overview: String? = null,
    var firstAirDate: String? = null,
    var voteAvarage: Float? = null
)

