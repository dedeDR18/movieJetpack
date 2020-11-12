package id.learn.android.moviecatalogue.ui.detailTvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.data.source.TmdbRepository
import id.learn.android.moviecatalogue.utils.DataDummy

class DetailTvshowViewModel(private val tmdbRepository: TmdbRepository) : ViewModel() {

    fun getTvshowById(tvshowId: Long, apiKey: String, language: String): LiveData<TvShowEntitiy> = tmdbRepository.getTvshowDetail(tvshowId, apiKey, language)
}