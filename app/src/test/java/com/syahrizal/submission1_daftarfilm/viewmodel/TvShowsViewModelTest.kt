package com.syahrizal.submission1_daftarfilm.viewmodel

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class TvShowsViewModelTest {

    private lateinit var viewModel: TvShowsViewModel

    @Before
    fun setUp() {
        viewModel = TvShowsViewModel()
    }

    @Test
    fun getTvShows() {
        val tvShowEntities = viewModel.getTVShows()
        assertNotNull(tvShowEntities)
        assertEquals(10, tvShowEntities.size)
    }
}