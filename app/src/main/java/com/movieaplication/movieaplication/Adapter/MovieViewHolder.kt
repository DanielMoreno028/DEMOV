package com.movieaplication.movieaplication.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.movieaplication.movieaplication.Movies
import com.movieaplication.movieaplication.R



class MovieViewHolder(view:View) : RecyclerView.ViewHolder(view) {

    val movieName = view.findViewById<TextView>(R.id.titletv)
    val movieYear = view.findViewById<TextView>(R.id.yeartv)
    val actorsName = view.findViewById<TextView>(R.id.actortv)
    val photo = view.findViewById<ImageView>(R.id.iv_img)

    fun render(moviesModel: Movies) {
        movieName.text = moviesModel.title
        movieYear.text = moviesModel.year.toString()
        actorsName.text = moviesModel.actors
        Glide.with(photo.context).load(moviesModel.img).into(photo)
    }
}