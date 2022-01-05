package com.seokdev.movie_list.models.network


import com.google.gson.annotations.SerializedName
import com.seokdev.movie_list.models.entity.Movie

data class MovieListResponse(
    val movieListResult: MovieListResult? = null
) {
    data class MovieListResult(
        val movieList: List<Movie?>? = null,
        val source: String? = null,
        val totCnt: Int? = null
    )
}