package id.learn.android.moviecatalogue.ui.home


import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import id.learn.android.moviecatalogue.R
import id.learn.android.moviecatalogue.utils.DataDummy
import org.junit.Rule
import org.junit.Test


class HomeActivityTest {
    private val dummyMovies = DataDummy.generateDummyMovies()
    private val dummyTvshows = DataDummy.generateDummyTvshows()

    @get:Rule
    val activityRule = ActivityTestRule<HomeActivity>(HomeActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovies.size - 1
            )
        )
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
        onView(withId(R.id.titlee)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.tvDateRelease)).check(matches(isDisplayed()))
        onView(withId(R.id.dateRelease)).check(matches(isDisplayed()))
        onView(withId(R.id.dateRelease)).check(matches(withText(dummyMovies[0].date_release)))
        onView(withId(R.id.tvScore)).check(matches(isDisplayed()))
        onView(withId(R.id.score)).check(matches(isDisplayed()))
        onView(withId(R.id.score)).check(matches(withText("${dummyMovies[0].user_score} %")))
        onView(withId(R.id.tvDuration)).check(matches(isDisplayed()))
        onView(withId(R.id.duration)).check(matches(isDisplayed()))
        onView(withId(R.id.duration)).check(matches(withText(dummyMovies[0].duration)))
        onView(withId(R.id.tvDirector)).check(matches(isDisplayed()))
        onView(withId(R.id.director)).check(matches(isDisplayed()))
        onView(withId(R.id.director)).check(matches(withText(dummyMovies[0].director)))
        onView(withId(R.id.tvWriter)).check(matches(isDisplayed()))
        onView(withId(R.id.writer)).check(matches(isDisplayed()))
        onView(withId(R.id.writer)).check(matches(withText(dummyMovies[0].writer)))
        onView(withId(R.id.tvDesc)).check(matches(isDisplayed()))
        onView(withId(R.id.description)).check(matches(isDisplayed()))
        onView(withId(R.id.description)).check(matches(withText(dummyMovies[0].desc)))
    }

    @Test
    fun loadTvshows() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovies.size - 1
            )
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
        onView(withId(R.id.titleTvshow)).check(matches(withText(dummyTvshows[0].title)))
        onView(withId(R.id.tvDateRelease)).check(matches(isDisplayed()))
        onView(withId(R.id.dateReleaseTvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.dateReleaseTvshow)).check(matches(withText(dummyTvshows[0].date_release)))
        onView(withId(R.id.tvScore)).check(matches(isDisplayed()))
        onView(withId(R.id.scoreTvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.scoreTvshow)).check(matches(withText("${dummyTvshows[0].user_score} %")))
        onView(withId(R.id.tvDurationTvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.durationTVshow)).check(matches(isDisplayed()))
        onView(withId(R.id.durationTVshow)).check(matches(withText(dummyTvshows[0].duration)))
        onView(withId(R.id.tvDirector)).check(matches(isDisplayed()))
        onView(withId(R.id.kreator)).check(matches(isDisplayed()))
        onView(withId(R.id.kreator)).check(matches(withText(dummyTvshows[0].kreator)))
        onView(withId(R.id.tvDesc)).check(matches(isDisplayed()))
        onView(withId(R.id.descriptionTvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.descriptionTvshow)).check(matches(withText(dummyTvshows[0].desc)))
    }

}
