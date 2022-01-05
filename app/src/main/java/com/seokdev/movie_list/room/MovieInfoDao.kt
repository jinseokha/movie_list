package com.seokdev.movie_list.room

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.seokdev.movie_list.models.entity.Movie
import com.seokdev.movie_list.models.entity.MovieInfo

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
interface MovieInfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovieInfoList(movies : List<MovieInfo>)

    @Update
    fun updateMovieInfo(movie : MovieInfo)

    @Query("SELECT * FROM MovieInfo WHERE movieNm = :movieNm_")
    fun getMovieInfo(movieNm_ : String) : MovieInfo
}