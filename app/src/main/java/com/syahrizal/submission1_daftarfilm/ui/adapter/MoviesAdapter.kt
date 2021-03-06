package com.syahrizal.submission1_daftarfilm.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.syahrizal.submission1_daftarfilm.R
import com.syahrizal.submission1_daftarfilm.data.MovieEntity
import com.syahrizal.submission1_daftarfilm.databinding.ItemListMovieBinding
import com.syahrizal.submission1_daftarfilm.ui.callback.OnMovieItemClickCallback

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    private lateinit var onMovieItemClickDetail: OnMovieItemClickCallback
    private lateinit var onMovieItemClickShare: OnMovieItemClickCallback
    private val listMovies = ArrayList<MovieEntity>()

    fun setMovies(moviesItem: ArrayList<MovieEntity>?) {
        if (moviesItem.isNullOrEmpty()) return
        this.listMovies.clear()
        this.listMovies.addAll(moviesItem)
        notifyDataSetChanged()
    }


    fun setOnItemClickCallback(onMovieItemClickCallback: OnMovieItemClickCallback) {
        onMovieItemClickDetail = onMovieItemClickCallback
        onMovieItemClickShare = onMovieItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val itemListMovieBinding =
            ItemListMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(itemListMovieBinding)
    }

    override fun getItemCount(): Int = listMovies.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) =
        holder.bind(listMovies[position])

    inner class MoviesViewHolder(private val binding: ItemListMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {
                tvItemMovieName.text = movie.movieName
                tvItemOverview.text = movie.overview
                tvItemRelease.text = movie.release
                Glide.with(itemView.context)
                    .load(movie.poster)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(rivItemPoster)
                itemView.setOnClickListener { onMovieItemClickDetail.onItemClicked(movie) }
                btnShare.setOnClickListener { onMovieItemClickShare.onItemShared(movie) }
            }
        }
    }
}
