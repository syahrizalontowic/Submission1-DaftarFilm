package com.syahrizal.submission1_daftarfilm.ui.adapter

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.syahrizal.submission1_daftarfilm.R
import com.syahrizal.submission1_daftarfilm.ui.movies.MoviesFragment
import com.syahrizal.submission1_daftarfilm.ui.tvshows.TvShowsFragment

class SectionsPagerAdapter(private val mContext: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.tab_film, R.string.tab_serial_tv)
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MoviesFragment()
            1 -> TvShowsFragment()
            else -> Fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? =
        mContext.resources.getString(TAB_TITLES[position])

    override fun getCount(): Int = TAB_TITLES.size
}
