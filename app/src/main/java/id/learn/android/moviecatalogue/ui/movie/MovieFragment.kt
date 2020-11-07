package id.learn.android.moviecatalogue.ui.movie

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
import kotlinx.android.synthetic.main.fragment_movie.*


class MovieFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movie, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {
            val vmFactory = ViewModelFactory.getInstance()
            val vm = ViewModelProvider(this, vmFactory)[MovieViewModel::class.java]
            val movieAdapter = MovieAdapter()

            vm.getMovies().observe(requireActivity(), Observer {movies ->
                movieAdapter.setMovies(movies)
            })


            with(rv_movies) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }


}