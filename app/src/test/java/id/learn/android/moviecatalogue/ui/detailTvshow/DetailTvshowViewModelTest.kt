package id.learn.android.moviecatalogue.ui.detailTvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import id.learn.android.moviecatalogue.BuildConfig
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
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailTvshowViewModelTest {

    companion object{
        const val API_KEY = BuildConfig.TMDB_API_KEY
        const val LANGUAGE = "en-US"
    }

    private lateinit var vm: DetailTvshowViewModel

    private val dummyTvshow = DataDummy.generateDummyTvshows()[0]

    private val dummyTvshowId = dummyTvshow.idTvShow


    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var tmdbRepository: TmdbRepository

    @Mock
    private lateinit var observer: Observer<TvShowEntitiy>

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        vm = DetailTvshowViewModel(tmdbRepository)
    }

    @Test
    fun getTvshowById() {
        var tvshow = MutableLiveData<TvShowEntitiy>()
        tvshow.value = dummyTvshow

        `when`(tmdbRepository.getTvshowDetail(dummyTvshowId!!, API_KEY, LANGUAGE)).thenReturn(tvshow)
        val tvShowEntitiy = vm.getTvshowById(dummyTvshowId!!, API_KEY, LANGUAGE).value as TvShowEntitiy
        verify(tmdbRepository).getTvshowDetail(dummyTvshowId!!, API_KEY, LANGUAGE)
        assertNotNull(tvShowEntitiy)
        assertEquals(dummyTvshow.idTvShow, tvShowEntitiy.idTvShow)
        assertEquals(dummyTvshow.popularity, tvShowEntitiy.popularity)
        assertEquals(dummyTvshow.originalLanguage, tvShowEntitiy.originalLanguage)
        assertEquals(dummyTvshow.originalName, tvShowEntitiy.originalName)
        assertEquals(dummyTvshow.posterPath, tvShowEntitiy.posterPath)
        assertEquals(dummyTvshow.overview, tvShowEntitiy.overview)
        assertEquals(dummyTvshow.firstAirDate, tvShowEntitiy.firstAirDate)
        assertEquals(dummyTvshow.voteAvarage, tvShowEntitiy.voteAvarage)


       vm.getTvshowById(dummyTvshowId!!, API_KEY, LANGUAGE).observeForever(observer)
        verify(observer).onChanged(dummyTvshow)

    }
}