package com.syahrizal.submission1_daftarfilm.viewmodel

import androidx.lifecycle.ViewModel
import com.syahrizal.submission1_daftarfilm.data.TVShowEntity
import com.syahrizal.submission1_daftarfilm.utils.DataDummy

class DetailTvShowViewModel : ViewModel() {

    private lateinit var tvShowName: String

    fun setSelectedTvShow(tvShowName: String) {
        this.tvShowName = tvShowName
    }

    fun getDetailTvShow(): TVShowEntity {
        lateinit var tvShow: TVShowEntity
        val tvShowEntities = DataDummy.generateDummyTVShowsItem()
        for (tvShowEntity in tvShowEntities)
            if (tvShowEntity.tvShowName == tvShowName) tvShow = tvShowEntity
        return tvShow
    }
}