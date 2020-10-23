package id.learn.android.moviecatalogue.ui.tvshow

import androidx.lifecycle.ViewModel
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.utils.DataDummy

class TvShowViewModel : ViewModel() {

    fun getTvShows(): List<TvShowEntitiy> = DataDummy.generateDummyTvshows()

}