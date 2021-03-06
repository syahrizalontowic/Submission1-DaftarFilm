package com.syahrizal.submission1_daftarfilm.viewmodel

import com.syahrizal.submission1_daftarfilm.utils.DataDummy.generateDummyMoviesItem
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = generateDummyMoviesItem()[0]
    private val movieName = dummyMovie.movieName

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel()
        movieName?.let { viewModel.setSelectedMovie(it) }
    }

    @Test
    fun getDetailMovie() {
        viewModel.setSelectedMovie(movieName.toString())
        val movieEntity = viewModel.getDetailMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.poster, movieEntity.poster)
        assertEquals(dummyMovie.movieName, movieEntity.movieName)
        assertEquals(dummyMovie.year, movieEntity.year)
        assertEquals(dummyMovie.release, movieEntity.release)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.score, movieEntity.score)
        assertEquals(dummyMovie.tagLine, movieEntity.tagLine)
        assertEquals(dummyMovie.overview, movieEntity.overview)
        assertEquals(dummyMovie.person, movieEntity.person)
    }
}