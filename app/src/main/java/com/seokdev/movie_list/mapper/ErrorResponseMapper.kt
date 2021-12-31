package com.seokdev.movie_list.mapper

import com.seokdev.movie_list.models.network.KobisErrorResponse
import com.skydoves.sandwich.ApiErrorModelMapper
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.message

object ErrorResponseMapper : ApiErrorModelMapper<KobisErrorResponse> {

    override fun map(apiErrorResponse: ApiResponse.Failure.Error<*>): KobisErrorResponse {
        return KobisErrorResponse(apiErrorResponse.statusCode.code, apiErrorResponse.message())
    }

}