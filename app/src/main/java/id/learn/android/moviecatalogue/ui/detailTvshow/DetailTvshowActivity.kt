package id.learn.android.moviecatalogue.ui.detailTvshow

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.learn.android.moviecatalogue.R
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import kotlinx.android.synthetic.main.activity_detail_tvshow.*

class DetailTvshowActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tvshow)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.activity_detail_tvshow)

        val vm = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailTvshowViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val tvshowId = extras.getInt(EXTRA_TVSHOW, 0)
            val tvshow = vm.getTvshowById(tvshowId)
            showData(tvshow)

        }

    }

    @SuppressLint("SetTextI18n")
    private fun showData(tvshow: TvShowEntitiy) {
        Glide.with(this)
            .load(tvshow.poster)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_base_image)
                    .error(R.drawable.ic_base_broken_image)
            )
            .into(ivPoster)
        titleTvshow.text = tvshow.title
        dateReleaseTvshow.text = tvshow.date_release
        scoreTvshow.text = tvshow.user_score.toString() + " %"
        kreator.text = tvshow.kreator
        descriptionTvshow.text = tvshow.desc
        durationTVshow.text = tvshow.duration
    }
}