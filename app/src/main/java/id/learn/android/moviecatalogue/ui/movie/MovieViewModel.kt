package id.learn.android.moviecatalogue.ui.movie

import androidx.lifecycle.ViewModel
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovies(): List<MovieEntitiy> = DataDummy.generateDummyMovies()

}