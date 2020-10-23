package id.learn.android.moviecatalogue.ui.movie

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.learn.android.moviecatalogue.R
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.ui.detailMovie.DetailMovieActivity
import kotlinx.android.synthetic.main.item_list_movie.view.*

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var listMovie = ArrayList<MovieEntitiy>()

    fun setMovies(movies: List<MovieEntitiy>) {
        listMovie.clear()
        listMovie.addAll(movies)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int = listMovie.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie)
    }


    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bind(movie: MovieEntitiy) {
            with(itemView) {
                tv_item_title.text = movie.title
                tv_item_date.text = movie.date_release
                tv_item_score.text = movie.user_score.toString() + " %"
                Glide.with(context)
                    .load(movie.poster)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_base_image)
                            .error(R.drawable.ic_base_broken_image)
                    )
                    .into(img_poster)
                setOnClickListener {
                    val intent = Intent(context, DetailMovieActivity::class.java).apply {
                        putExtra(DetailMovieActivity.EXTRA_MOVIE, movie.movieId)
                    }
                    context.startActivity(intent)
                }
            }
        }
    }

}