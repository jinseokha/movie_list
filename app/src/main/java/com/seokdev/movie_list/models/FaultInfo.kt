package com.seokdev.movie_list.models


import com.google.gson.annotations.SerializedName

data class FaultInfo(
    @SerializedName("errorCode")
    val errorCode: String,
    @SerializedName("message")
    val message: String
)