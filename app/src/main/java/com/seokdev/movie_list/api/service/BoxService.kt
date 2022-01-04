package com.seokdev.movie_list.api.service

import com.seokdev.movie_list.models.network.DailyBoxResponse
import com.seokdev.movie_list.models.network.WeeklyBoxResponse
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-01-02
 * @desc
 */

interface BoxService {

    /**
     *  [searchDailyBoxOfficeList](https://www.kobis.or.kr/kobisopenapi/homepg/apiservice/searchServiceInfo.do)
     *
     *  Get the list of daily on KOBIS. This list updates daily.
     *
     *  @param [targetDt] date
     *
     *  @return [DailyBoxResponse] response
     */
    @GET("boxoffice/searchDailyBoxOfficeList.json")
    suspend fun fetchDailyBoxOffice(@Query("targetDt") targetDt : String) : ApiResponse<DailyBoxResponse>

    /**
     *  [searchWeeklyBoxOfficeList](https://www.kobis.or.kr/kobisopenapi/homepg/apiservice/searchServiceInfo.do)
     *
     *  Get the list of weekly on KOBIS. This list updates weekly.
     *
     *  @param [targetDt] date
     *
     *  @return [WeeklyBoxResponse] response
     */
    @GET("boxoffice/searchWeeklyBoxOfficeList.json")
    suspend fun fetchWeeklyBoxOffice(@Query("targetDt") targetDt : String) : ApiResponse<WeeklyBoxResponse>


}