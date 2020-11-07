package id.learn.android.moviecatalogue.ui.detailMovie

import androidx.lifecycle.ViewModel
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.source.TmdbRepository
import id.learn.android.moviecatalogue.utils.DataDummy

class DetailMovieViewModel(private val tmdbRepository: TmdbRepository) : ViewModel() {

    fun getMovieById(movieId: Int): MovieEntitiy {
        return MovieEntitiy(1,"1232.23".toFloat(), "asdasd", "asdasdasd", "/asdasdasd.jpg","9281093", "kajslhdkjashdkjas", "13.2".toFloat())
    }
}