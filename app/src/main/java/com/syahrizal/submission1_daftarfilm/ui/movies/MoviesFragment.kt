package com.syahrizal.submission1_daftarfilm.ui.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.syahrizal.submission1_daftarfilm.R
import com.syahrizal.submission1_daftarfilm.data.MovieEntity
import com.syahrizal.submission1_daftarfilm.databinding.FragmentMoviesBinding
import com.syahrizal.submission1_daftarfilm.ui.movies.DetailMovieFragment.Companion.EXTRA_MOVIE_NAME
import com.syahrizal.submission1_daftarfilm.ui.adapter.MoviesAdapter
import com.syahrizal.submission1_daftarfilm.ui.callback.OnMovieItemClickCallback
import com.syahrizal.submission1_daftarfilm.viewmodel.MoviesViewModel

class MoviesFragment : Fragment() {

    private lateinit var fragmentMoviesBinding: FragmentMoviesBinding
    private var movies = ArrayList<MovieEntity>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMoviesBinding = FragmentMoviesBinding.inflate(layoutInflater, container, false)
        return fragmentMoviesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getViewModelData()
        showMoviesList()
    }

    private fun getViewModelData() {
        if (parentFragment != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[MoviesViewModel::class.java]
            movies = viewModel.getMovies()
        }
    }

    private fun showMoviesList() {
        val moviesAdapter = MoviesAdapter()
        moviesAdapter.apply {
            notifyDataSetChanged()
            setMovies(movies)
            setOnItemClickCallback(object : OnMovieItemClickCallback {
                override fun onItemClicked(data: MovieEntity) = setSelectedMovie(data)
                override fun onItemShared(data: MovieEntity) = shareSelectedMovie(data)
            })
        }
        with(fragmentMoviesBinding.rvFilm) {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = moviesAdapter
        }
    }

    private fun setSelectedMovie(data: MovieEntity) {
        val mBundle = Bundle().apply { putString(EXTRA_MOVIE_NAME, data.movieName) }
        NavHostFragment
            .findNavController(this)
            .navigate(R.id.action_homeFragment_to_detailMovieFragment, mBundle)
    }

    private fun shareSelectedMovie(data: MovieEntity) {
        val shareMovie = "${getString(R.string.app_title)}:\n" +
                "${getString(R.string.judul_film)}: ${data.movieName}\n" +
                "${getString(R.string.tahun)}: ${data.year}\n" +
                "${getString(R.string.waktu_rilis)}: ${data.release}\n" +
                "${getString(R.string.kategori)}: ${data.genre}\n" +
                "${getString(R.string.durasi)}: ${data.duration}\n" +
                "${getString(R.string.penilaian)}: ${data.score}\n" +
                "${getString(R.string.slogan)}: ${data.tagLine}\n" +
                "${getString(R.string.ringkasan)}: ${data.overview}\n" +
                "${getString(R.string.orang)}: ${data.person}"
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(requireActivity())
            .setType(mimeType)
            .setChooserTitle(getString(R.string.share_judul_film))
            .setText(shareMovie)
            .startChooser()
    }
}