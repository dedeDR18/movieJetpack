package id.learn.android.moviecatalogue.data.source

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.data.source.remote.RemoteDataSource
import id.learn.android.moviecatalogue.data.source.remote.response.MovieItem
import id.learn.android.moviecatalogue.data.source.remote.response.TvShowItem

class TmdbRepository private constructor(private val remoteDataSource: RemoteDataSource) :
    TmdbDataSource {

    companion object {
        @Volatile
        private var instance: TmdbRepository? = null

        fun getInstance(remoteData: RemoteDataSource): TmdbRepository =
            instance ?: synchronized(this) {
                instance ?: TmdbRepository(remoteData)
            }
    }



    override fun getAllMovie(): LiveData<List<MovieEntitiy>> {
        val movieResult = MutableLiveData<List<MovieEntitiy>>()
        remoteDataSource.getListMovie(object : RemoteDataSource.LoadMovieCallback {
            override fun onAllMovieReceived(movieResponse: List<MovieItem>) {
                val movieList = ArrayList<MovieEntitiy>()
                for (response in movieResponse) {
                    val movie = MovieEntitiy(
                        response.idMovie,
                        response.popularity,
                        response.originalTitle,
                        response.originalLanguage,
                        response.posterPath,
                        response.releaseDate,
                        response.overview,
                        response.voteAvarage
                    )
                    movieList.add(movie)
                }
                Log.d("TEST", "GETMOVIE")
                movieResult.postValue(movieList)
            }
        })
        return movieResult
    }

    override fun getAllTvshow(): LiveData<List<TvShowEntitiy>> {
        val tvshowResult = MutableLiveData<List<TvShowEntitiy>>()
        remoteDataSource.getListTvshow(object : RemoteDataSource.LoadTvshowCallback {
            override fun onAllTvshowCallback(tshowResponse: List<TvShowItem>) {
                val tvshowList = ArrayList<TvShowEntitiy>()
                for (res in tshowResponse) {
                    val tvshow = TvShowEntitiy(
                        res.idTvShow,
                        res.popularity,
                        res.originalLanguage,
                        res.originalName,
                        res.posterPath,
                        res.overview,
                        res.firstAirDate,
                        res.voteAvarage
                    )
                    tvshowList.add(tvshow)
                }
                Log.d("TEST", "GETTVSHOW")
                tvshowResult.postValue(tvshowList)
            }
        })
        return tvshowResult
    }



}