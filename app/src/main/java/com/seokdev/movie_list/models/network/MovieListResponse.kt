package com.seokdev.movie_list.models.network


import com.google.gson.annotations.SerializedName

data class MovieListResponse(
    val movieListResult: MovieListResult
) {
    data class MovieListResult(
        val movieList: List<Movie>,
        val source: String,
        val totCnt: Int
    ) {
        data class Movie(
            val companys: List<Any>,
            val directors: List<Any>,
            val genreAlt: String,
            val movieCd: String,
            val movieNm: String,
            val movieNmEn: String,
            val nationAlt: String,
            val openDt: String,
            val prdtStatNm: String,
            val prdtYear: String,
            val repGenreNm: String,
            val repNationNm: String,
            val typeNm: String
        )
    }
}