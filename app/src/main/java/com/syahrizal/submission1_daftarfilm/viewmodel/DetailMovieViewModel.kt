package com.syahrizal.submission1_daftarfilm.viewmodel

import androidx.lifecycle.ViewModel
import com.syahrizal.submission1_daftarfilm.data.MovieEntity
import com.syahrizal.submission1_daftarfilm.utils.DataDummy.generateDummyMoviesItem

class DetailMovieViewModel : ViewModel() {

    private lateinit var movieName: String

    fun setSelectedMovie(movieName: String) {
        this.movieName = movieName
    }

    fun getDetailMovie(): MovieEntity {
        lateinit var movie: MovieEntity
        val movieEntities = generateDummyMoviesItem()
        for (movieEntity in movieEntities)
            if (movieEntity.movieName == movieName) movie = movieEntity
        return movie
    }
}