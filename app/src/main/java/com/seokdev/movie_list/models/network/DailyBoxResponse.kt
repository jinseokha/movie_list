package com.seokdev.movie_list.models.network


import com.google.gson.annotations.SerializedName
import com.seokdev.movie_list.models.NetworkResponseModel
import com.seokdev.movie_list.models.entity.BoxOfficeResult
import com.seokdev.movie_list.models.entity.DailyBoxOffice

data class DailyBoxResponse(
    val boxOfficeResult: BoxOfficeResult
) : NetworkResponseModel