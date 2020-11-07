package id.learn.android.moviecatalogue.ui.tvshow

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import id.learn.android.moviecatalogue.R
import id.learn.android.moviecatalogue.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_tv_show.*


class TvShowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_tv_show, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {
            val vmFactory = ViewModelFactory.getInstance()
            val vm = ViewModelProvider(requireActivity(), vmFactory)[TvShowViewModel::class.java]
            Log.d("TEST", "TVSHOW")
            val tvshowAdapter = TvShowAdapter()

            vm.getTvShows().observe(requireActivity(), Observer {
                tvshowAdapter.setTvshow(it)
            })

            with(rv_tvshow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvshowAdapter
                Log.d("TEST", "ADAPTER")
            }
        }
    }

}