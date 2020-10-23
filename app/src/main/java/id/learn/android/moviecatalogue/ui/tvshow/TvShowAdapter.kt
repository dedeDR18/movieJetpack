package id.learn.android.moviecatalogue.ui.tvshow

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.learn.android.moviecatalogue.R
import id.learn.android.moviecatalogue.data.TvShowEntitiy
import id.learn.android.moviecatalogue.ui.detailTvshow.DetailTvshowActivity
import kotlinx.android.synthetic.main.item_list_tvshow.view.*

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    private var listTvshow = ArrayList<TvShowEntitiy>()

    fun setTvshow(tvshows: List<TvShowEntitiy>) {
        listTvshow.clear()
        listTvshow.addAll(tvshows)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvShowViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_tvshow, parent, false)
        return TvShowViewHolder(view)
    }

    override fun getItemCount(): Int = listTvshow.size

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvshow = listTvshow[position]
        holder.bind(tvshow)
    }

    class TvShowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bind(tvshow: TvShowEntitiy) {
            with(itemView) {
                tv_item_title.text = tvshow.title
                tv_item_date.text = tvshow.date_release
                tv_item_score.text = tvshow.user_score.toString() + " %"
                Glide.with(context)
                    .load(tvshow.poster)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_base_image)
                            .error(R.drawable.ic_base_broken_image)
                    )
                    .into(img_poster)
                setOnClickListener {
                    val intent = Intent(context, DetailTvshowActivity::class.java).apply {
                        putExtra(DetailTvshowActivity.EXTRA_TVSHOW, tvshow.tvshowId)
                    }
                    context.startActivity(intent)
                }
            }
        }
    }

}