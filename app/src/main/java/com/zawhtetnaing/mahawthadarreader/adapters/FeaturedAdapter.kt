package com.zawhtetnaing.mahawthadarreader.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.mahawthadarreader.R
import com.zawhtetnaing.mahawthadarreader.view.holders.FeaturedViewHolder

class FeaturedAdapter : RecyclerView.Adapter<FeaturedViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeaturedViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_featured,parent,false)
        return FeaturedViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 7
    }

    override fun onBindViewHolder(holder: FeaturedViewHolder, position: Int) {

    }
}