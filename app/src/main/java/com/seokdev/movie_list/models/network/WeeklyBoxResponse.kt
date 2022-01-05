package com.seokdev.movie_list.models.network


import com.seokdev.movie_list.models.NetworkResponseModel
import com.seokdev.movie_list.models.entity.BoxOfficeResult
import com.seokdev.movie_list.models.entity.DailyBoxOffice
import com.seokdev.movie_list.models.entity.WeeklyBoxOffice

data class WeeklyBoxResponse(
    val boxOfficeResult: BoxOfficeResult
) : NetworkResponseModel