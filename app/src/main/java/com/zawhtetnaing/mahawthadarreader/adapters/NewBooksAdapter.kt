package com.zawhtetnaing.mahawthadarreader.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.mahawthadarreader.R
import com.zawhtetnaing.mahawthadarreader.view.holders.NewBooksViewHolder
import com.zawhtetnaing.mahawthadarreader.view.holders.PopularViewHolder

class NewBooksAdapter : RecyclerView.Adapter<NewBooksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewBooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_new, parent, false)
        return NewBooksViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 7
    }

    override fun onBindViewHolder(holder: NewBooksViewHolder, position: Int) {

    }

}