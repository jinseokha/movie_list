package com.seokdev.movie_list.operator

import android.app.Application
import android.widget.Toast
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.StatusCode
import com.skydoves.sandwich.map
import com.skydoves.sandwich.message
import com.skydoves.sandwich.operators.ApiResponseSuspendOperator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GlobalResponseOperator<T> constructor(
    private val application : Application
) : ApiResponseSuspendOperator<T>() {
    override suspend fun onError(apiResponse: ApiResponse.Failure.Error<T>) =
        withContext(Dispatchers.IO) {
            apiResponse.run {
                when (statusCode) {
                    StatusCode.InternalServerError -> toast("InternalServerError")
                    StatusCode.BadGateway -> toast("BadGateway")
                    else -> toast("$statusCode(${statusCode.code}): ${message()}")
                }
            }
        }

    override suspend fun onException(apiResponse: ApiResponse.Failure.Exception<T>) =
        withContext(Dispatchers.Main) {
            apiResponse.run {
                toast(message())
            }
        }

    override suspend fun onSuccess(apiResponse: ApiResponse.Success<T>)
            = Unit

    private fun toast(message : String) {
        Toast.makeText(application, message, Toast.LENGTH_SHORT).show()
    }
}