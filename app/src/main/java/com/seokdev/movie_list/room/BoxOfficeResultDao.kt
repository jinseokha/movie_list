package com.seokdev.movie_list.room

import androidx.room.*
import com.seokdev.movie_list.models.entity.BoxOfficeResult
import com.seokdev.movie_list.models.entity.DailyBoxOffice

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
@Dao
interface BoxOfficeResultDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBoxOfficeResult(movies : List<BoxOfficeResult>)

    @Update
    fun updateBoxOfficeResult(movies : BoxOfficeResult)

    @Query("SELECT * FROM BoxOfficeResult WHERE boxofficeType = :boxofficeType_ AND showRange = :showRange_")
    fun getBoxOfficeResult(boxofficeType_ : String, showRange_ : String) : BoxOfficeResult
}