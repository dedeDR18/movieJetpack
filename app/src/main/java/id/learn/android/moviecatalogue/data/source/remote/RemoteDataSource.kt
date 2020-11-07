package id.learn.android.moviecatalogue.data.source.remote

import android.util.Log
import id.learn.android.moviecatalogue.data.source.remote.response.MovieItem
import id.learn.android.moviecatalogue.data.source.remote.response.TmdbMovieResponse
import id.learn.android.moviecatalogue.data.source.remote.response.TmdbTvShowResponse
import id.learn.android.moviecatalogue.data.source.remote.response.TvShowItem
import id.learn.android.moviecatalogue.network.ApiClient
import id.learn.android.moviecatalogue.network.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource private constructor(private val retrofitClient: ApiClient) {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(apiClient: ApiClient): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(apiClient)
            }
    }

    val client = retrofitClient.getRetrofit().create(ApiService::class.java)




    fun getListMovie(callback: LoadMovieCallback){
        client.getMovieDiscover().enqueue(object : Callback<TmdbMovieResponse> {
            override fun onResponse(
                call: Call<TmdbMovieResponse>,
                response: Response<TmdbMovieResponse>
            ) {
                callback.onAllMovieReceived(response.body()?.results as List<MovieItem>)
                Log.d("TEST", "GETMOVIE in REMOTEDATASOURCE")
            }

            override fun onFailure(call: Call<TmdbMovieResponse>, t: Throwable) {
                    t.printStackTrace()

            }

        })
    }

    fun getListTvshow(callback: LoadTvshowCallback){
        client.getTvShowDiscover().enqueue(object : Callback<TmdbTvShowResponse>{
            override fun onResponse(
                call: Call<TmdbTvShowResponse>,
                response: Response<TmdbTvShowResponse>
            ) {
                callback.onAllTvshowCallback(response.body()?.results as List<TvShowItem>)
                Log.d("TEST", "GETTVSHOW in REMOTEDATASOURCE")
            }

            override fun onFailure(call: Call<TmdbTvShowResponse>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }



    interface LoadMovieCallback{
        fun onAllMovieReceived(movieResponse: List<MovieItem>)
    }

    interface LoadTvshowCallback{
        fun onAllTvshowCallback(tshowResponse: List<TvShowItem>)
    }
}