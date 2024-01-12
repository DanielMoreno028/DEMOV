package com.movieaplication.movieaplication.Adapter

import Services.ApiService.Companion.IMAGE_URL
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewapplication.Movie
import com.movieaplication.movieaplication.R



class MovieViewHolder(view:View) : RecyclerView.ViewHolder(view) {

    val movieName = view.findViewById<TextView>(R.id.titletv)
    val movieYear = view.findViewById<TextView>(R.id.yeartv)
    val actorsName = view.findViewById<TextView>(R.id.actortv)
    val photo = view.findViewById<ImageView>(R.id.iv_img)

    fun render(movieModel: Movie) {
        movieName.text = movieModel.original_title
        movieYear.text = movieModel.release_date.toString()
        actorsName.text = movieModel.overview
        val imageUrl = IMAGE_URL + movieModel.poster_path
        Glide.with(photo.context).load(imageUrl).into(photo)
    }
}
