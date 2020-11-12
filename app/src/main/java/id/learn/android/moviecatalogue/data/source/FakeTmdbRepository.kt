package id.learn.android.moviecatalogue.data.source

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.data.source.remote.RemoteDataSource
import id.learn.android.moviecatalogue.data.source.remote.response.MovieItem
import id.learn.android.moviecatalogue.data.source.remote.response.TvShowItem

class FakeTmdbRepository(private val remoteDataSource: RemoteDataSource) :
    TmdbDataSource {

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
                tvshowResult.postValue(tvshowList)
            }
        })
        return tvshowResult
    }

    override fun getMovieDetail(
        idMovie: Long,
        apiKey: String,
        language: String
    ): LiveData<MovieEntitiy> {
        val dataMovie = MutableLiveData<MovieEntitiy>()
        remoteDataSource.getDetailMovie(
            idMovie,
            apiKey,
            language,
            object : RemoteDataSource.LoadMovieDetailCallback {
                override fun onDetailMovieCallback(movie: MovieItem) {
                    val m = MovieEntitiy(
                        movie.idMovie,
                        movie.popularity,
                        movie.originalTitle,
                        movie.originalLanguage,
                        movie.posterPath,
                        movie.releaseDate,
                        movie.overview,
                        movie.voteAvarage,
                    )
                    dataMovie.postValue(m)
                }
            })
        return dataMovie
    }

    override fun getTvshowDetail(
        idTvshow: Long,
        apiKey: String,
        language: String
    ): LiveData<TvShowEntitiy> {
        val dataTvshow = MutableLiveData<TvShowEntitiy>()
        remoteDataSource.getDetailTvshow(
            idTvshow,
            apiKey,
            language,
            object : RemoteDataSource.LoadTvshowDetailCallback {
                override fun onDetailTvshowCallback(tvshow: TvShowItem) {
                    val t = TvShowEntitiy(
                        tvshow.idTvShow,
                        tvshow.popularity,
                        tvshow.originalLanguage,
                        tvshow.originalName,
                        tvshow.posterPath,
                        tvshow.overview,
                        tvshow.firstAirDate,
                        tvshow.voteAvarage
                    )
                    dataTvshow.postValue(t)
                }
            })
        return dataTvshow
    }
}