package com.seokdev.movie_list.room

import androidx.room.Database
import com.seokdev.movie_list.models.entity.*

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-04
 * @desc
 */

@Database(
    entities = [(BoxOfficeResult::class),
        (Movie::class), (MovieInfo::class)],
    version = 3, exportSchema = false
)

class AppDatabase {

}