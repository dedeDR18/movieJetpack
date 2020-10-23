package id.learn.android.moviecatalogue.ui.tvshow

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowViewModelTest {

    private lateinit var vm: TvShowViewModel

    @Before
    fun setUp() {
        vm = TvShowViewModel()
    }

    @Test
    fun getTvShows() {
        val listTvshow = vm.getTvShows()
        assertNotNull(listTvshow)
        assertEquals(10, listTvshow.size)
    }
}