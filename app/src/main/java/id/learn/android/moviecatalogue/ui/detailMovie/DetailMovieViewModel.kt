package id.learn.android.moviecatalogue.ui.detailMovie

import androidx.lifecycle.ViewModel
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.utils.DataDummy

class DetailMovieViewModel : ViewModel() {

    fun getMovieById(movieId: Int): MovieEntitiy {
        return DataDummy.generateMovie(movieId)
    }
}