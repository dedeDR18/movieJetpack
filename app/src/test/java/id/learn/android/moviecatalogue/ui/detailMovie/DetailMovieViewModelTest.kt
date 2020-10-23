package id.learn.android.moviecatalogue.ui.detailMovie


import id.learn.android.moviecatalogue.utils.DataDummy
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {

    private lateinit var vm: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()[0]
    private val dummyMovieId = dummyMovie.movieId

    @Before
    fun setUp() {
        vm = DetailMovieViewModel()
    }

    @Test
    fun getMovieById() {
        val movie = vm.getMovieById(dummyMovieId)
        assertNotNull(movie)
        assertEquals(dummyMovie.movieId, movie.movieId)
        assertEquals(dummyMovie.poster, movie.poster)
        assertEquals(dummyMovie.title, movie.title)
        assertEquals(dummyMovie.desc, movie.desc)
        assertEquals(dummyMovie.date_release, movie.date_release)
        assertEquals(dummyMovie.duration, movie.duration)
        assertEquals(dummyMovie.user_score, movie.user_score)
        assertEquals(dummyMovie.writer, movie.writer)
        assertEquals(dummyMovie.director, movie.director)

    }
}