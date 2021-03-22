package com.syahrizal.submission1_daftarfilm.ui.activities

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.syahrizal.submission1_daftarfilm.R
import com.syahrizal.submission1_daftarfilm.utils.DataDummy.generateDummyMoviesItem
import com.syahrizal.submission1_daftarfilm.utils.DataDummy.generateDummyTVShowsItem
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    private val dummyMovie = generateDummyMoviesItem()
    private val dummyTvShow = generateDummyTVShowsItem()

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun loadMovies() {
        Espresso.onView(withId(R.id.rv_film))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.rv_film))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        Espresso.onView(withId(R.id.rv_film))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click())
            )
        Espresso.onView(withId(R.id.sv_detail_film))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.sv_detail_film)).perform(ViewActions.swipeUp())
        Espresso.onView(withId(R.id.riv_item_poster_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_film_name_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_film_name_received))
            .check(ViewAssertions.matches(withText(dummyMovie[0].movieName)))
        Espresso.onView(withId(R.id.tv_item_tahun_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_tahun_received))
            .check(ViewAssertions.matches(ViewMatchers.withText("${dummyMovie[0].year}")))
        Espresso.onView(withId(R.id.tv_item_rilis_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_rilis_received))
            .check(ViewAssertions.matches(withText(dummyMovie[0].release)))
        Espresso.onView(withId(R.id.tv_item_kategori_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_kategori_received))
            .check(ViewAssertions.matches(withText(dummyMovie[0].genre)))
        Espresso.onView(withId(R.id.tv_item_durasi_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_durasi_received))
            .check(ViewAssertions.matches(withText(dummyMovie[0].duration)))
        Espresso.onView(withId(R.id.tv_item_penilaian_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_penilaian_received))
            .check(ViewAssertions.matches(ViewMatchers.withText("${dummyMovie[0].score}%")))
        Espresso.onView(withId(R.id.tv_item_slogan_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_slogan_received))
            .check(ViewAssertions.matches(withText(dummyMovie[0].tagLine)))
        Espresso.onView(withId(R.id.tv_item_ringkasan_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_ringkasan_received))
            .check(ViewAssertions.matches(withText(dummyMovie[0].overview)))
        Espresso.onView(withId(R.id.tv_item_orang_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_orang_received))
            .check(ViewAssertions.matches(withText(dummyMovie[0].person)))
    }

    @Test
    fun shareMovie() {
        Espresso.onView(withId(R.id.rv_film))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click())
            )
        Espresso.onView(withId(R.id.app_bar_share))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.app_bar_share))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
        Espresso.onView(withId(R.id.app_bar_share)).perform(ViewActions.click())
    }

    @Test
    fun loadTvShows() {
        Espresso.onView(ViewMatchers.withText("Serial TV")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rv_serial_tv))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.rv_serial_tv))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTVShow() {
        Espresso.onView(ViewMatchers.withText("Serial TV")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rv_serial_tv))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
        Espresso.onView(withId(R.id.rv_serial_tv))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(9, ViewActions.click())
            )
        Espresso.onView(withId(R.id.sv_detail_serial_tv))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.sv_detail_serial_tv)).perform(ViewActions.swipeUp())
        Espresso.onView(withId(R.id.riv_item_poster_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_serial_tv_name_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_serial_tv_name_received))
            .check(ViewAssertions.matches(withText(dummyTvShow[9].tvShowName)))
        Espresso.onView(withId(R.id.tv_item_tahun_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_tahun_received))
            .check(ViewAssertions.matches(withText(dummyTvShow[9].year.toString())))
        Espresso.onView(withId(R.id.tv_item_kategori_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_kategori_received))
            .check(ViewAssertions.matches(withText(dummyTvShow[9].genre)))
        Espresso.onView(withId(R.id.tv_item_durasi_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_durasi_received))
            .check(ViewAssertions.matches(withText(dummyTvShow[9].duration)))
        Espresso.onView(withId(R.id.tv_item_penilaian_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_penilaian_received))
            .check(ViewAssertions.matches(ViewMatchers.withText("${dummyTvShow[9].score}%")))
        Espresso.onView(withId(R.id.tv_item_slogan_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_slogan_received))
            .check(ViewAssertions.matches(withText(dummyTvShow[9].tagLine)))
        Espresso.onView(withId(R.id.tv_item_ringkasan_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_ringkasan_received))
            .check(ViewAssertions.matches(withText(dummyTvShow[9].overview)))
        Espresso.onView(withId(R.id.tv_item_orang_received))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.tv_item_orang_received))
            .check(ViewAssertions.matches(withText(dummyTvShow[9].person)))
    }

    @Test
    fun shareTVShow() {
        Espresso.onView(ViewMatchers.withText("Serial TV")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rv_serial_tv))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                    9,
                    ViewActions.click()
                )
            )
        Espresso.onView(withId(R.id.app_bar_share))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.app_bar_share))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
        Espresso.onView(withId(R.id.app_bar_share)).perform(ViewActions.click())
    }
}