package com.syahrizal.submission1_daftarfilm.viewmodel

import androidx.lifecycle.ViewModel
import com.syahrizal.submission1_daftarfilm.data.MovieEntity
import com.syahrizal.submission1_daftarfilm.utils.DataDummy.generateDummyMoviesItem

class MoviesViewModel : ViewModel() {

    fun getMovies(): ArrayList<MovieEntity> = generateDummyMoviesItem()
}