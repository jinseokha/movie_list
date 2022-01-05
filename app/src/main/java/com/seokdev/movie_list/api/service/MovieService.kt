package com.seokdev.movie_list.api.service

import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-04
 * @desc
 */
interface MovieService {

    /**
     *  [searchMovieList](https://www.kobis.or.kr/kobisopenapi/homepg/apiservice/searchServiceInfo.do)
     *
     *  Get the list of searchMovieName on KOBIS.
     *
     *  @param [curPage] pageNum (default : "1")
     *  @param [itemPerPage] Result Row Num (default : "10")
     *  @param [movieNm] search Movie Name
     *
     *  @return [MovieListResponse] response
     */
    @GET("movie/searchMovieList.json")
    suspend fun fetchSearchMovieNm(
        @Query("curPage") curPage : String,
        @Query("itemPerPage") itemPerPage : String,
        @Query("movieNm") movieNm : String
    ) : ApiResponse<MovieListResponse>

    /**
     *  [searchMovieList](https://www.kobis.or.kr/kobisopenapi/homepg/apiservice/searchServiceInfo.do)
     *
     *  Get the list of searchMovie Director Name on KOBIS.
     *
     *  @param [curPage] pageNum (default : "1")
     *  @param [itemPerPage] Result Row Num (default : "10")
     *  @param [directorNm] search Movie Director Name
     *
     *  @return [MovieListResponse] response
     */
    @GET("movie/searchMovieList.json")
    suspend fun fetchSearchDirectorNm(
        @Query("curPage") curPage : String,
        @Query("itemPerPage") itemPerPage : String,
        @Query("directorNm") directorNm : String
    ) : ApiResponse<MovieListResponse>



}