package id.learn.android.moviecatalogue.ui.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.verify
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.data.TvShowEntitiy
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
class TvShowViewModelTest {

    private lateinit var vm: TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var tmdbRepository: TmdbRepository

    @Mock
    private lateinit var observer: Observer<List<TvShowEntitiy>>

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        vm = TvShowViewModel(tmdbRepository)
    }

    @Test
    fun getTvShows() {
        var dummyTvshows = DataDummy.generateDummyTvshows()
        var tvshow = MutableLiveData<List<TvShowEntitiy>>()
        tvshow.value = dummyTvshows

        `when`(tmdbRepository.getAllTvshow()).thenReturn(tvshow)
        val tvshowEntitiy = vm.getTvShows().value
        verify<TmdbRepository>(tmdbRepository).getAllTvshow()
        assertNotNull(tvshowEntitiy)
        assertEquals(20, tvshowEntitiy?.size)

        vm.getTvShows().observeForever(observer)
        verify(observer).onChanged(dummyTvshows)
    }
}