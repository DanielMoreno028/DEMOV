package com.example.recyclerviewapplication


data class Movies(
    val page: Int?,
    val results: List<Movie>
)

data class Movie(
    val original_title: String?,
    val release_date: String?,
    val overview: String?,
    val poster_path: String?,
    val vote_average: Float?
)
