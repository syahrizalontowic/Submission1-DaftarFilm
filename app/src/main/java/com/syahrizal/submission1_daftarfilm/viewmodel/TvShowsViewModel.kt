package com.syahrizal.submission1_daftarfilm.viewmodel

import androidx.lifecycle.ViewModel
import com.syahrizal.submission1_daftarfilm.data.TVShowEntity
import com.syahrizal.submission1_daftarfilm.utils.DataDummy.generateDummyTVShowsItem

class TvShowsViewModel : ViewModel() {

    fun getTVShows(): ArrayList<TVShowEntity> = generateDummyTVShowsItem()
}