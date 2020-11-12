package id.learn.android.moviecatalogue.ui.detailTvshow

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.learn.android.moviecatalogue.BuildConfig
import id.learn.android.moviecatalogue.R
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_detail_tvshow.*
import kotlinx.android.synthetic.main.activity_detail_tvshow.popularity

class DetailTvshowActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TVSHOW = "extra_tvshow"
        const val API_KEY = BuildConfig.TMDB_API_KEY
        const val LANGUAGE = "en-US"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tvshow)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.activity_detail_tvshow)

        val vmFactory = ViewModelFactory.getInstance()
        val vm = ViewModelProvider(
            this,
            vmFactory
        )[DetailTvshowViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val tvshowId = extras.getLong(EXTRA_TVSHOW, 0)
            pgTvshow.visibility = View.VISIBLE
            vm.getTvshowById(tvshowId, API_KEY, LANGUAGE).observe(this, Observer { tvshow ->
                showData(tvshow)
                pgTvshow.visibility = View.GONE
            })

        }

    }

    @SuppressLint("SetTextI18n")
    private fun showData(tvshow: TvShowEntitiy) {
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w600_and_h900_bestv2"+tvshow.posterPath)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_base_image)
                    .error(R.drawable.ic_base_broken_image)
            )
            .into(ivPoster)
        titleTvshow.text = tvshow.originalName
        dateReleaseTvshow.text = tvshow.firstAirDate
        voteTvshow.text = tvshow.voteAvarage.toString()
        popularity.text = tvshow.popularity.toString()
        overviewTvshow.text = tvshow.overview
        languageTvshow.text = tvshow.originalLanguage
    }
}