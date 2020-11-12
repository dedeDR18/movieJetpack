package id.learn.android.moviecatalogue.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import id.learn.android.moviecatalogue.BuildConfig
import id.learn.android.moviecatalogue.data.source.remote.RemoteDataSource
import id.learn.android.moviecatalogue.utils.DataDummy
import id.learn.android.moviecatalogue.utils.LiveDataTestUtil
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TmdbRepositoryTest {

    companion object{
        const val API_KEY = BuildConfig.TMDB_API_KEY
        const val LANGUAGE = "en-US"
    }

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val tmdbRepository = FakeTmdbRepository(remote)

    private val tvshowResponse = DataDummy.generateRemoteDummyTvshows()

    private val tvshowId = tvshowResponse[0].idTvShow

    private val tvshow = tvshowResponse[0]

    private val movieResponse = DataDummy.generateRemoteDummyMovies()

    private val movieId = movieResponse[0].idMovie

    private val movie = movieResponse[0]

    @Test
    fun getAllMovie() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMovieCallback)
                .onAllMovieReceived(movieResponse)
            null
        }.`when`(remote).getListMovie(any())
        val movieEntities = LiveDataTestUtil.getValue(tmdbRepository.getAllMovie())
        verify(remote).getListMovie(any())
        assertNotNull(movieEntities)
        assertEquals(movieResponse.size.toLong(), movieEntities.size.toLong())
    }

    @Test
    fun getAllTvshow() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvshowCallback)
                .onAllTvshowCallback(tvshowResponse)
            null
        }.`when`(remote).getListTvshow(any())
        val tvshowEntities = LiveDataTestUtil.getValue(tmdbRepository.getAllTvshow())
        verify(remote).getListTvshow(any())
        assertNotNull(tvshowEntities)
        assertEquals(tvshowResponse.size.toLong(), tvshowEntities.size.toLong())
    }

    @Test
    fun getMovieDetail() {
        doAnswer { invocation ->
            (invocation.arguments[3] as RemoteDataSource.LoadMovieDetailCallback)
                .onDetailMovieCallback(movie)
            null
        }.`when`(remote).getDetailMovie(eq(movieId!!), eq(API_KEY), eq(LANGUAGE), any())
        val movieEntities = LiveDataTestUtil.getValue(tmdbRepository.getMovieDetail(movieId, API_KEY, LANGUAGE))

       verify(remote).getDetailMovie(eq(movieId!!), eq(API_KEY), eq(LANGUAGE), any())

        assertNotNull(movieEntities)
        assertNotNull(movieEntities.originalTitle)
        assertEquals(movieResponse[0].originalTitle, movieEntities.originalTitle)
    }

    @Test
    fun getTvshowDetail() {
        doAnswer { invocation ->
            (invocation.arguments[3] as RemoteDataSource.LoadTvshowDetailCallback)
                .onDetailTvshowCallback(tvshow)
            null
        }.`when`(remote).getDetailTvshow(eq(tvshowId!!), eq(API_KEY), eq(LANGUAGE), any())
        val tvshowEntities = LiveDataTestUtil.getValue(tmdbRepository.getTvshowDetail(tvshowId, API_KEY, LANGUAGE))

        verify(remote).getDetailTvshow(eq(tvshowId!!), eq(API_KEY), eq(LANGUAGE), any())

        assertNotNull(tvshowEntities)
        assertNotNull(tvshowEntities.originalName)
        assertEquals(tvshowResponse[0].originalName, tvshowEntities.originalName)
    }
}