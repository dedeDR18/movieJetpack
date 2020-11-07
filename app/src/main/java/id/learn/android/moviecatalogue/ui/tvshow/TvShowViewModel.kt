package id.learn.android.moviecatalogue.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.data.source.TmdbRepository
import id.learn.android.moviecatalogue.data.source.remote.response.TvShowItem
import id.learn.android.moviecatalogue.utils.DataDummy

class TvShowViewModel(private val tmdbRepository: TmdbRepository) : ViewModel() {


    fun getTvShows(): LiveData<List<TvShowEntitiy>> = tmdbRepository.getAllTvshow()


}