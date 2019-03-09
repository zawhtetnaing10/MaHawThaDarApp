package com.zawhtetnaing.mahawthadarreader.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zawhtetnaing.mahawthadarreader.R
import com.zawhtetnaing.mahawthadarreader.adapters.FeaturedAdapter
import kotlinx.android.synthetic.main.fragment_featured.view.*

class FeaturedFragment : Fragment() {

    private lateinit var mAdapter : FeaturedAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_featured, container, false)

        setUpRecycler(view)

        return view
    }

    private fun setUpRecycler(view: View) {
        mAdapter = FeaturedAdapter()
        with(view.rvFeaturedBooks) {
            adapter = mAdapter
        }
    }
}