package id.learn.android.moviecatalogue.ui.detailMovie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.source.TmdbRepository
import id.learn.android.moviecatalogue.utils.DataDummy

class DetailMovieViewModel(private val tmdbRepository: TmdbRepository) : ViewModel() {

    fun getMovieById(movieId: Long, apiKey: String, language: String): LiveData<MovieEntitiy> = tmdbRepository.getMovieDetail(movieId, apiKey, language)
}