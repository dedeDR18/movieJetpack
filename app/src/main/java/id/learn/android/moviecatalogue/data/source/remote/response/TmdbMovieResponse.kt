package id.learn.android.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TmdbMovieResponse(
    @field:SerializedName("page")
    val page: Int? = null,
    @field:SerializedName("total_results")
    val totalResult: Int? = null,
    @field:SerializedName("total_pages")
    val totalPages: Int? = null,
    @field:SerializedName("results")
    val results: List<MovieItem>? = null
) : Parcelable