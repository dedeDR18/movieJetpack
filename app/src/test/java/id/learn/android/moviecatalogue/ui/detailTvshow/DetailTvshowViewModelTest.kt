package id.learn.android.moviecatalogue.ui.detailTvshow

import id.learn.android.moviecatalogue.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvshowViewModelTest {

    private lateinit var vm: DetailTvshowViewModel
    private val dummyTvshow = DataDummy.generateDummyTvshows()[0]
    private val dummyTvshowId = dummyTvshow.tvshowId

    @Before
    fun setUp() {
        vm = DetailTvshowViewModel()
    }

    @Test
    fun getTvshowById() {
        val tvshow = vm.getTvshowById(dummyTvshowId)
        assertNotNull(tvshow)
        assertEquals(dummyTvshow.tvshowId, tvshow.tvshowId)
        assertEquals(dummyTvshow.poster, tvshow.poster)
        assertEquals(dummyTvshow.title, tvshow.title)
        assertEquals(dummyTvshow.desc, tvshow.desc)
        assertEquals(dummyTvshow.date_release, tvshow.date_release)
        assertEquals(dummyTvshow.duration, tvshow.duration)
        assertEquals(dummyTvshow.user_score, tvshow.user_score)
        assertEquals(dummyTvshow.kreator, tvshow.kreator)
    }
}