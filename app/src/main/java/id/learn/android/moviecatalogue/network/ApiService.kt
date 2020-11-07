package id.learn.android.moviecatalogue.network

import id.learn.android.moviecatalogue.data.source.remote.response.TmdbMovieResponse
import id.learn.android.moviecatalogue.data.source.remote.response.TmdbTvShowResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("movie?api_key=b54ae81b398a5890951b1449f680b6e3&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1")
    fun getMovieDiscover(): Call<TmdbMovieResponse>

    @GET("tv?api_key=b54ae81b398a5890951b1449f680b6e3&language=en-US&sort_by=popularity.desc&page=1&timezone=America%2FNew_York&include_null_first_air_dates=false")
    fun getTvShowDiscover(): Call<TmdbTvShowResponse>


}