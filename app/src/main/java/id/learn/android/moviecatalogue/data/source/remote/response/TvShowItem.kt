package id.learn.android.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShowItem(
    @field:SerializedName("id")
    val idTvShow: Long? = null,
    @field:SerializedName("popularity")
    val popularity: Float? = null,
    @field:SerializedName("original_language")
    val originalLanguage: String? = null,
    @field:SerializedName("original_name")
    val originalName: String? = null,
    @field:SerializedName("poster_path")
    val posterPath: String? = null,
    @field:SerializedName("overview")
    val overview: String? = null,
    @field:SerializedName("first_air_date")
    val firstAirDate: String? = null,
    @field:SerializedName("vote_average")
    val voteAvarage: Float? = null

) : Parcelable