package com.zawhtetnaing.mahawthadarreader.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import com.zawhtetnaing.mahawthadarreader.R
import com.zawhtetnaing.mahawthadarreader.adapters.NewBooksAdapter

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mNewBooksAdapter: NewBooksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
        }

        setUpRecycler()
    }

    private fun setUpRecycler() {
        mNewBooksAdapter = NewBooksAdapter()
        with(rvNewBooks) {
            adapter = mNewBooksAdapter
        }
    }

}
