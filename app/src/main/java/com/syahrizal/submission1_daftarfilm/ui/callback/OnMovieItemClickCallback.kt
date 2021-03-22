package com.syahrizal.submission1_daftarfilm.ui.callback

import com.syahrizal.submission1_daftarfilm.data.MovieEntity

interface OnMovieItemClickCallback {
    fun onItemClicked(data: MovieEntity)
    fun onItemShared(data: MovieEntity)
}