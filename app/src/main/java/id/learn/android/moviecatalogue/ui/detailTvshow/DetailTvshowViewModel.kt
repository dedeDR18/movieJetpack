package id.learn.android.moviecatalogue.ui.detailTvshow

import androidx.lifecycle.ViewModel
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.data.source.TmdbRepository
import id.learn.android.moviecatalogue.utils.DataDummy

class DetailTvshowViewModel(private val tmdbRepository: TmdbRepository) : ViewModel() {

    fun getTvshowById(tvshowId: Int): TvShowEntitiy {
        return TvShowEntitiy(1, 123.213.toFloat(), "asdasdasd", "asdasdasd", "/asdasdasdas.jpg", "asdasdasdasdasda", "12312312", "213.22".toFloat())
    }
}