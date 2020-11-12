package id.learn.android.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.data.source.remote.response.MovieItem
import id.learn.android.moviecatalogue.data.source.remote.response.TvShowItem

interface TmdbDataSource {
    fun getAllMovie(): LiveData<List<MovieEntitiy>>

    fun getAllTvshow(): LiveData<List<TvShowEntitiy>>

    fun getMovieDetail(idMovie: Long, apiKey: String, language: String): LiveData<MovieEntitiy>

    fun getTvshowDetail(idTvshow: Long, apiKey: String, language: String): LiveData<TvShowEntitiy>
}