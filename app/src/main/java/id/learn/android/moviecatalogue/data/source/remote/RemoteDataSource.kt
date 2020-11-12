package id.learn.android.moviecatalogue.data.source.remote

import android.util.Log
import id.learn.android.moviecatalogue.data.source.remote.response.MovieItem
import id.learn.android.moviecatalogue.data.source.remote.response.TmdbMovieResponse
import id.learn.android.moviecatalogue.data.source.remote.response.TmdbTvShowResponse
import id.learn.android.moviecatalogue.data.source.remote.response.TvShowItem
import id.learn.android.moviecatalogue.network.ApiClient
import id.learn.android.moviecatalogue.network.ApiService
import id.learn.android.moviecatalogue.utils.EspressoIdlingResource
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
        EspressoIdlingResource.increment()
        client.getMovieDiscover().enqueue(object : Callback<TmdbMovieResponse> {
            override fun onResponse(
                call: Call<TmdbMovieResponse>,
                response: Response<TmdbMovieResponse>
            ) {
                callback.onAllMovieReceived(response.body()?.results as List<MovieItem>)
                EspressoIdlingResource.decrement()
                Log.d("TEST", "GETMOVIE in REMOTEDATASOURCE")
            }

            override fun onFailure(call: Call<TmdbMovieResponse>, t: Throwable) {
                    t.printStackTrace()

            }

        })
    }

    fun getListTvshow(callback: LoadTvshowCallback){
        EspressoIdlingResource.increment()
        client.getTvShowDiscover().enqueue(object : Callback<TmdbTvShowResponse>{
            override fun onResponse(
                call: Call<TmdbTvShowResponse>,
                response: Response<TmdbTvShowResponse>
            ) {
                callback.onAllTvshowCallback(response.body()?.results as List<TvShowItem>)
                EspressoIdlingResource.decrement()
                Log.d("TEST", "GETTVSHOW in REMOTEDATASOURCE")
            }

            override fun onFailure(call: Call<TmdbTvShowResponse>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }

    fun getDetailMovie(idMovie: Long, apiKey: String, language: String, callback: LoadMovieDetailCallback){
        EspressoIdlingResource.increment()
        client.doGetDetailMovie(idMovie, apiKey, language).enqueue(object : Callback<MovieItem>  {
            override fun onResponse(call: Call<MovieItem>, response: Response<MovieItem>) {
                callback.onDetailMovieCallback(response.body() as MovieItem)
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<MovieItem>, t: Throwable) {
                t.printStackTrace()
            }

        })
    }

    fun getDetailTvshow(idTvshow: Long, apiKey: String, language: String, callback: LoadTvshowDetailCallback){
        EspressoIdlingResource.increment()
        client.doGetDetailTvshow(idTvshow, apiKey, language).enqueue(object : Callback<TvShowItem>{
            override fun onResponse(call: Call<TvShowItem>, response: Response<TvShowItem>) {
                callback.onDetailTvshowCallback(response.body() as TvShowItem)
                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: Call<TvShowItem>, t: Throwable) {
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

    interface LoadMovieDetailCallback{
        fun onDetailMovieCallback(movie: MovieItem)
    }

    interface LoadTvshowDetailCallback{
        fun onDetailTvshowCallback(tvshow: TvShowItem)
    }
}