package id.learn.android.moviecatalogue.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.data.source.TmdbRepository
import id.learn.android.moviecatalogue.data.source.remote.response.MovieItem
import id.learn.android.moviecatalogue.utils.DataDummy

class MovieViewModel(private val tmdbRepository: TmdbRepository) : ViewModel() {

    fun getMovies(): LiveData<List<MovieEntitiy>> = tmdbRepository.getAllMovie()

}