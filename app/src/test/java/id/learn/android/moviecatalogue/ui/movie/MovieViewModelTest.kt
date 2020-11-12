package id.learn.android.moviecatalogue.ui.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.atLeast
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.source.TmdbRepository
import id.learn.android.moviecatalogue.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {

    private lateinit var vm: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var tmdbRepository: TmdbRepository

    @Mock
    private lateinit var observer: Observer<List<MovieEntitiy>>

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        vm = MovieViewModel(tmdbRepository)
    }


    @Test
    fun getMovies() {
        var dummyMovies = DataDummy.generateDummyMovies()
        var movie = MutableLiveData<List<MovieEntitiy>>()
        movie.value = dummyMovies


        `when`(tmdbRepository.getAllMovie()).thenReturn(movie)
        val movieEntitiy = vm.getMovies().value
        verify<TmdbRepository>(tmdbRepository).getAllMovie()
        assertNotNull(movieEntitiy)
        assertEquals(20, movieEntitiy?.size)

        vm.getMovies().observeForever(observer)
        verify(observer).onChanged(dummyMovies)


//        assertNotNull(listMovie)
//        assertEquals(10, listMovie.size)
    }
}