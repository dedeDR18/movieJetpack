package id.learn.android.moviecatalogue.ui.detailMovie


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.verify
import id.learn.android.moviecatalogue.BuildConfig
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.data.source.TmdbRepository
import id.learn.android.moviecatalogue.ui.detailTvshow.DetailTvshowViewModelTest
import id.learn.android.moviecatalogue.utils.DataDummy
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class DetailMovieViewModelTest {

    companion object{
        const val API_KEY = BuildConfig.TMDB_API_KEY
        const val LANGUAGE = "en-US"
    }

    private lateinit var vm: DetailMovieViewModel

    private val dummyMovie = DataDummy.generateDummyMovies()[0]

    private val dummyMovieId = dummyMovie.idMovie

    @get:Rule
    var instantTaskExecutor = InstantTaskExecutorRule()

    @Mock
    private lateinit var tmdbRepository: TmdbRepository

    @Mock
    private lateinit var observer: Observer<MovieEntitiy>

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        vm = DetailMovieViewModel(tmdbRepository)
    }

    @Test
    fun getMovieById() {
        var movie = MutableLiveData<MovieEntitiy>()
        movie.value = dummyMovie

        Mockito.`when`(
            tmdbRepository.getMovieDetail(
                dummyMovieId!!,
                API_KEY,
                LANGUAGE
            )
        ).thenReturn(movie)
        val movieEntitiy = vm.getMovieById(dummyMovieId!!,
            API_KEY,
            LANGUAGE
        ).value as MovieEntitiy
        verify(tmdbRepository).getMovieDetail(dummyMovieId!!,
            API_KEY,
            LANGUAGE
        )
        assertNotNull(movieEntitiy)
        assertEquals(dummyMovie.idMovie, movieEntitiy.idMovie)
        assertEquals(dummyMovie.popularity, movieEntitiy.popularity)
        assertEquals(dummyMovie.originalLanguage, movieEntitiy.originalLanguage)
        assertEquals(dummyMovie.originalTitle, movieEntitiy.originalTitle)
        assertEquals(dummyMovie.posterPath, dummyMovie.posterPath)
        assertEquals(dummyMovie.overview, movieEntitiy.overview)
        assertEquals(dummyMovie.releaseDate, movieEntitiy.releaseDate)
        assertEquals(dummyMovie.voteAvarage, movieEntitiy.voteAvarage)


        vm.getMovieById(dummyMovieId!!,
            DetailTvshowViewModelTest.API_KEY,
            DetailTvshowViewModelTest.LANGUAGE
        ).observeForever(observer)
        verify(observer).onChanged(dummyMovie)

    }
}