package com.seokdev.movie_list.models.network


import com.google.gson.annotations.SerializedName
import com.seokdev.movie_list.models.FaultInfo

data class KobisErrorResponse(
    val code : Int,
    val message : String
)