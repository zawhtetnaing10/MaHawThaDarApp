package com.zawhtetnaing.mahawthadarreader.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zawhtetnaing.mahawthadarreader.R
import com.zawhtetnaing.mahawthadarreader.adapters.PopularAdapter
import kotlinx.android.synthetic.main.fragment_popular.view.*

class PopularFragment : Fragment() {

    private lateinit var mAdapter : PopularAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_popular, container, false)

        setUpRecycler(view)

        return view
    }

    private fun setUpRecycler(view: View) {
        mAdapter = PopularAdapter()
        with(view.rvPopular) {
            adapter = mAdapter
        }
    }
}