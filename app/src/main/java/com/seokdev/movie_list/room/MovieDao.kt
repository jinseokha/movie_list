package com.seokdev.movie_list.room

import androidx.room.*
import com.seokdev.movie_list.models.entity.Movie

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovieList(movies : List<Movie>)

    @Update
    fun updateMovie(movie : Movie)

    @Query("SELECT * FROM Movie WHERE movieNm = :movieNm_")
    fun getMovie(movieNm_ : String) : Movie
}