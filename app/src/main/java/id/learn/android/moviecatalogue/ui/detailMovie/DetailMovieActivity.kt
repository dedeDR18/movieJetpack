package id.learn.android.moviecatalogue.ui.detailMovie

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.learn.android.moviecatalogue.BuildConfig
import id.learn.android.moviecatalogue.R
import id.learn.android.moviecatalogue.data.MovieEntitiy
import id.learn.android.moviecatalogue.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_detail_movie.*


class DetailMovieActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val API_KEY = BuildConfig.TMDB_API_KEY
        const val LANGUAGE = "en-US"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.activity_detail_film)

        val vmFactory = ViewModelFactory.getInstance()

        val vm = ViewModelProvider(
            this,
            vmFactory
        )[DetailMovieViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getLong(EXTRA_MOVIE, 0)
            pgMovie.visibility = View.VISIBLE
            vm.getMovieById(movieId, API_KEY, LANGUAGE).observe(this, Observer { movie ->
                showData(movie)
                pgMovie.visibility = View.GONE
            })
        }

    }

    @SuppressLint("SetTextI18n")
    private fun showData(movie: MovieEntitiy) {
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w600_and_h900_bestv2" + movie.posterPath)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_base_image)
                    .error(R.drawable.ic_base_broken_image)
            )
            .into(ivPosterMovie)
        titlee.text = movie.originalTitle
        dateRelease.text = movie.releaseDate
        vote.text = movie.voteAvarage.toString()
        language.text = movie.originalLanguage
        popularity.text = movie.popularity.toString()
        overview.text = movie.overview
    }
}