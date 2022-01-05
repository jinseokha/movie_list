package com.seokdev.movie_list.models.network


import com.google.gson.annotations.SerializedName
import com.seokdev.movie_list.models.entity.MovieInfo

data class MovieInfoResponse(
    val movieInfoResult: MovieInfoResult
) {
    data class MovieInfoResult(
        val movieInfo: MovieInfo,
        val source: String
    )
}