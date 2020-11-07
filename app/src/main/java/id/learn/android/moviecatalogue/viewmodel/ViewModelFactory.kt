package id.learn.android.moviecatalogue.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.learn.android.moviecatalogue.data.source.TmdbRepository
import id.learn.android.moviecatalogue.di.Injection
import id.learn.android.moviecatalogue.network.ApiClient
import id.learn.android.moviecatalogue.ui.detailMovie.DetailMovieViewModel
import id.learn.android.moviecatalogue.ui.detailTvshow.DetailTvshowViewModel
import id.learn.android.moviecatalogue.ui.movie.MovieViewModel
import id.learn.android.moviecatalogue.ui.tvshow.TvShowViewModel

class ViewModelFactory private constructor(private val mTmdbRepository: TmdbRepository) : ViewModelProvider.NewInstanceFactory(){

    companion object{
        @Volatile
        private var instance: ViewModelFactory? = null
        private val client = ApiClient()

        fun getInstance(): ViewModelFactory =
            instance ?: synchronized(this){
                instance ?: ViewModelFactory(Injection.provideRepository(client))
            }
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when{
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                return MovieViewModel(mTmdbRepository) as T
            }
            modelClass.isAssignableFrom(DetailMovieViewModel::class.java) -> {
                return DetailMovieViewModel(mTmdbRepository) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                return TvShowViewModel(mTmdbRepository) as T
            }
            modelClass.isAssignableFrom(DetailTvshowViewModel::class.java) -> {
                return DetailTvshowViewModel(mTmdbRepository) as T
            }
            else ->
                throw Throwable("unknown viewModel class: "+modelClass.name)
        }
    }

}