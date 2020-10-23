package id.learn.android.moviecatalogue.ui.splash

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import id.learn.android.moviecatalogue.R

import org.junit.Rule
import org.junit.Test

class SplashActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule<SplashActivity>(SplashActivity::class.java)

    @Test
    fun testLottieDisplay() {
        Espresso.onView(withId(R.id.animView))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}