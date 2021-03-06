package com.syahrizal.submission1_daftarfilm.ui.movies

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.syahrizal.submission1_daftarfilm.viewmodel.DetailMovieViewModel
import com.syahrizal.submission1_daftarfilm.R
import com.syahrizal.submission1_daftarfilm.data.MovieEntity
import com.syahrizal.submission1_daftarfilm.databinding.FragmentDetailMovieBinding

class DetailMovieFragment : Fragment() {

    companion object {
        const val EXTRA_MOVIE_NAME = "extra_movie_name"
    }

    private lateinit var fragmentDetailMovieBinding: FragmentDetailMovieBinding
    private lateinit var movieNameData: String
    private lateinit var yearData: String
    private lateinit var genreData: String
    private lateinit var tagLineData: String
    private lateinit var scoreData: String
    private lateinit var releaseData: String
    private lateinit var durationData: String
    private lateinit var overviewData: String
    private lateinit var personData: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentDetailMovieBinding =
            FragmentDetailMovieBinding.inflate(layoutInflater, container, false)
        return fragmentDetailMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setActionBar()
        setHasOptionsMenu(true)
        getDetailMovieViewModel()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_share, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onNavigateUp(item.itemId)
        shareDetailMovie(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setActionBar() {
        (activity as AppCompatActivity?)?.supportActionBar?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.detail_judul_film)
        }
    }

    private fun onNavigateUp(itemId: Int) {
        if (itemId == android.R.id.home) requireActivity().onBackPressed()
    }

    private fun getDetailMovieViewModel() {
        val viewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[DetailMovieViewModel::class.java]
        if (arguments != null) {
            val movieName = arguments?.getString(EXTRA_MOVIE_NAME)
            if (movieName != null) {
                viewModel.setSelectedMovie(movieName)
                populateDetailMovie(viewModel.getDetailMovie())
            }
        }
    }

    private fun populateDetailMovie(movieEntity: MovieEntity) {
        fragmentDetailMovieBinding.apply {
            movieNameData = movieEntity.movieName.toString()
            tvItemFilmNameReceived.text = movieNameData
            yearData = movieEntity.year.toString()
            tvItemTahunReceived.text = yearData
            genreData = movieEntity.genre.toString()
            tvItemKategoriReceived.text = genreData
            tagLineData = movieEntity.tagLine.toString()
            tvItemSloganReceived.text = tagLineData
            scoreData = movieEntity.score.toString()
            tvItemPenilaianReceived.text = StringBuilder("$scoreData%")
            releaseData = movieEntity.release.toString()
            tvItemRilisReceived.text = releaseData
            durationData = movieEntity.duration.toString()
            tvItemDurasiReceived.text = durationData
            overviewData = movieEntity.overview.toString()
            tvItemRingkasanReceived.text = overviewData
            personData = movieEntity.person.toString()
            tvItemOrangReceived.text = personData
            Glide.with(this@DetailMovieFragment)
                .load(movieEntity.poster)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .into(rivItemPosterReceived)
        }
    }

    private fun shareDetailMovie(sharedMovie: Int) {
        if (sharedMovie == R.id.app_bar_share) {
            val shareMovie = "${getString(R.string.app_title)}:\n" +
                    "${getString(R.string.judul_film)}: $movieNameData\n" +
                    "${getString(R.string.tahun)}: $yearData\n" +
                    "${getString(R.string.waktu_rilis)}: $releaseData\n" +
                    "${getString(R.string.kategori)}: $genreData\n" +
                    "${getString(R.string.durasi)}: $durationData\n" +
                    "${getString(R.string.penilaian)}: $scoreData\n" +
                    "${getString(R.string.slogan)}: $tagLineData\n" +
                    "${getString(R.string.ringkasan)}: $overviewData\n" +
                    "${getString(R.string.orang)}: $personData"
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle(getString(R.string.share_judul_film))
                .setText(shareMovie)
                .startChooser()
        }
    }
}
