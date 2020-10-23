package id.learn.android.moviecatalogue.ui.detailTvshow

import androidx.lifecycle.ViewModel
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.utils.DataDummy

class DetailTvshowViewModel : ViewModel() {

    fun getTvshowById(tvshowId: Int): TvShowEntitiy {
        return DataDummy.generateTvshow(tvshowId)
    }
}