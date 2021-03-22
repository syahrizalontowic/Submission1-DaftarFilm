package com.syahrizal.submission1_daftarfilm.ui.callback

import com.syahrizal.submission1_daftarfilm.data.TVShowEntity

interface OnTVShowItemClickCallback {
    fun onItemClicked(data: TVShowEntity)
    fun onItemShared(data: TVShowEntity)
}
