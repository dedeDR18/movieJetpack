package id.learn.android.moviecatalogue.ui.home


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import id.learn.android.moviecatalogue.R

import id.learn.android.moviecatalogue.utils.EspressoIdlingResource
import kotlinx.android.synthetic.main.fragment_movie.*
import kotlinx.android.synthetic.main.fragment_tv_show.*
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class HomeActivityTest {
//    private val dummyMovies = DataDummy.generateDummyMovies()
//    private val dummyTvshows = DataDummy.generateDummyTvshows()


    @Before
    fun setUp(){
        IdlingRegistry.getInstance().register(EspressoIdlingResource.espressoTestIdlingResource)

    }

    @After
    fun tearDown(){
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.espressoTestIdlingResource)
    }

    @get:Rule
    val activityRule = ActivityTestRule<HomeActivity>(HomeActivity::class.java)



    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(activityRule.activity.rv_movies.adapter!!.itemCount - 1))

    }

    @Test
    fun loadDetailMovies() {
        onView(withId(R.id.rv_movies)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.ivPosterMovie)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.titlee)).check(matches(isDisplayed()))

        onView(withId(R.id.tvDateRelease)).check(matches(isDisplayed()))
        onView(withId(R.id.dateRelease)).check(matches(isDisplayed()))

        onView(withId(R.id.tvVote)).check(matches(isDisplayed()))
        onView(withId(R.id.vote)).check(matches(isDisplayed()))

        onView(withId(R.id.tvLanguage)).check(matches(isDisplayed()))
        onView(withId(R.id.language)).check(matches(isDisplayed()))

        onView(withId(R.id.tvPopulartity)).check(matches(isDisplayed()))
        onView(withId(R.id.popularity)).check(matches(isDisplayed()))

        onView(withId(R.id.tvOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.overview)).check(matches(isDisplayed()))

    }

    @Test
    fun loadTvshows() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(activityRule.activity.rv_tvshow.adapter!!.itemCount - 1)
        )
    }

    @Test
    fun loadDetailTvshow() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tvshow)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.ivPoster)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.titleTvshow)).check(matches(isDisplayed()))

        onView(withId(R.id.tvDateRelease)).check(matches(isDisplayed()))
        onView(withId(R.id.dateReleaseTvshow)).check(matches(isDisplayed()))

        onView(withId(R.id.tvScore)).check(matches(isDisplayed()))
        onView(withId(R.id.voteTvshow)).check(matches(isDisplayed()))

        onView(withId(R.id.tvLanguageTvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.languageTvshow)).check(matches(isDisplayed()))

        onView(withId(R.id.tvPopularity)).check(matches(isDisplayed()))
        onView(withId(R.id.popularity)).check(matches(isDisplayed()))

        onView(withId(R.id.tvOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.overviewTvshow)).check(matches(isDisplayed()))

    }

}
