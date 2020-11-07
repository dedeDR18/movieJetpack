package id.learn.android.moviecatalogue.ui.detailMovie

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import id.learn.android.moviecatalogue.R
import id.learn.android.moviecatalogue.data.MovieEntitiy
import kotlinx.android.synthetic.main.activity_detail_movie.*


class DetailMovieActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.activity_detail_film)

        val vm = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailMovieViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getInt(EXTRA_MOVIE, 0)
            val movie = vm.getMovieById(movieId)
            showData(movie)
        }

    }

    @SuppressLint("SetTextI18n")
    private fun showData(movie: MovieEntitiy) {
//        Glide.with(this)
//            .load(movie.poster)
//            .into(ivPosterMovie)
//        titlee.text = movie.title
//        dateRelease.text = movie.date_release
//        score.text = movie.user_score.toString() + " %"
//        director.text = movie.director
//        writer.text = movie.writer
//        description.text = movie.desc
//        duration.text = movie.duration
    }
}