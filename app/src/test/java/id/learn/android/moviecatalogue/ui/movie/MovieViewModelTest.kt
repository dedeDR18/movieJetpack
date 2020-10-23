package id.learn.android.moviecatalogue.ui.movie

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MovieViewModelTest {

    private lateinit var vm: MovieViewModel

    @Before
    fun setUp() {
        vm = MovieViewModel()
    }


    @Test
    fun getMovies() {
        val listMovie = vm.getMovies()
        assertNotNull(listMovie)
        assertEquals(10, listMovie.size)
    }
}