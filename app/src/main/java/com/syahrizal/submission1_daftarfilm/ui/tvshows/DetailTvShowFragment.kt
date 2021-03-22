package com.syahrizal.submission1_daftarfilm.ui.tvshows

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.syahrizal.submission1_daftarfilm.R
import com.syahrizal.submission1_daftarfilm.data.TVShowEntity
import com.syahrizal.submission1_daftarfilm.databinding.FragmentDetailTvShowBinding
import com.syahrizal.submission1_daftarfilm.viewmodel.DetailTvShowViewModel

class DetailTvShowFragment : Fragment() {

    private lateinit var fragmentDetailTvShowBinding: FragmentDetailTvShowBinding
    private lateinit var tvShowNameData: String
    private lateinit var yearData: String
    private lateinit var genreData: String
    private lateinit var tagLineData: String
    private lateinit var scoreData: String
    private lateinit var durationData: String
    private lateinit var overviewData: String
    private lateinit var personData: String

    companion object {
        const val EXTRA_TV_SHOW_NAME = "extra_tv_show_name"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentDetailTvShowBinding =
            FragmentDetailTvShowBinding.inflate(layoutInflater, container, false)
        return fragmentDetailTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setActionBar()
        setHasOptionsMenu(true)
        getDetailTvShowViewModel()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_share, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onNavigateUp(item.itemId)
        shareDetailTvShow(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setActionBar() {
        (activity as AppCompatActivity?)?.supportActionBar?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.detail_judul_serial_tv)
        }
    }

    private fun onNavigateUp(itemId: Int) {
        if (itemId == android.R.id.home) requireActivity().onBackPressed()
    }

    private fun getDetailTvShowViewModel() {
        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailTvShowViewModel::class.java]
        if (arguments != null) {
            val tvShowName = arguments?.getString(EXTRA_TV_SHOW_NAME)
            if (tvShowName != null) {
                viewModel.setSelectedTvShow(tvShowName)
                populateDetailTvShow(viewModel.getDetailTvShow())
            }
        }
    }

    private fun populateDetailTvShow(tvShowEntity: TVShowEntity) {
        fragmentDetailTvShowBinding.apply {
            tvShowNameData = tvShowEntity.tvShowName.toString()
            tvItemSerialTvNameReceived.text = tvShowNameData
            yearData = tvShowEntity.year.toString()
            tvItemTahunReceived.text = yearData
            genreData = tvShowEntity.genre.toString()
            tvItemKategoriReceived.text = genreData
            tagLineData = tvShowEntity.tagLine.toString()
            tvItemSloganReceived.text = tagLineData
            scoreData = tvShowEntity.score.toString()
            tvItemPenilaianReceived.text = StringBuilder("$scoreData%")
            durationData = tvShowEntity.duration.toString()
            tvItemDurasiReceived.text = durationData
            overviewData = tvShowEntity.overview.toString()
            tvItemRingkasanReceived.text = overviewData
            personData = tvShowEntity.person.toString()
            tvItemOrangReceived.text = personData
            Glide.with(this@DetailTvShowFragment)
                .load(tvShowEntity.poster)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .into(rivItemPosterReceived)
        }
    }

    private fun shareDetailTvShow(sharedTvShow: Int) {
        if (sharedTvShow == R.id.app_bar_share) {
            val shareMovie = "${getString(R.string.app_title)}:\n" +
                    "${getString(R.string.judul_film)}: $tvShowNameData\n" +
                    "${getString(R.string.tahun)}: $yearData\n" +
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