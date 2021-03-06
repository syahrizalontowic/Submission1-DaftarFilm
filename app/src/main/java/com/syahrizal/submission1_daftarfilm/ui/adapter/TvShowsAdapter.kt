package com.syahrizal.submission1_daftarfilm.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.syahrizal.submission1_daftarfilm.R
import com.syahrizal.submission1_daftarfilm.data.TVShowEntity
import com.syahrizal.submission1_daftarfilm.databinding.ItemListTvShowBinding
import com.syahrizal.submission1_daftarfilm.ui.callback.OnTVShowItemClickCallback

class TvShowsAdapter() : RecyclerView.Adapter<TvShowsAdapter.TVShowsViewHolder>() {

    private lateinit var onItemClickDetail: OnTVShowItemClickCallback
    private lateinit var onItemClickShare: OnTVShowItemClickCallback
    private val listTVShows = ArrayList<TVShowEntity>()

    fun setTVShows(tvShowsItem: ArrayList<TVShowEntity>?) {
        if (tvShowsItem.isNullOrEmpty()) return
        this.listTVShows.clear()
        this.listTVShows.addAll(tvShowsItem)
        notifyDataSetChanged()
    }

    fun setOnItemClickCallback(onTVShowItemClickCallback: OnTVShowItemClickCallback) {
        onItemClickDetail = onTVShowItemClickCallback
        onItemClickShare = onTVShowItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TVShowsViewHolder {
        val itemListTVShowBinding =
            ItemListTvShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TVShowsViewHolder(itemListTVShowBinding)
    }

    override fun getItemCount(): Int = listTVShows.size

    override fun onBindViewHolder(holder: TVShowsViewHolder, position: Int) =
        holder.bind(listTVShows[position])

    inner class TVShowsViewHolder(private val binding: ItemListTvShowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: TVShowEntity) {
            with(binding) {
                tvItemTvShowName.text = tvShow.tvShowName
                tvItemOverview.text = tvShow.overview
                tvItemYear.text = tvShow.year.toString()
                Glide.with(itemView.context)
                    .load(tvShow.poster)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(rivItemPoster)
                itemView.setOnClickListener { onItemClickDetail.onItemClicked(tvShow) }
                btnShare.setOnClickListener { onItemClickShare.onItemShared(tvShow) }
            }
        }
    }
}