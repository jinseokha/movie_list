package com.seokdev.movie_list.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seokdev.movie_list.models.entity.Director
import com.seokdev.movie_list.models.entity.Genre

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
open class GenreListConverter {
    @TypeConverter
    fun fromString(value : String) : List<Genre>? {
        val listType = object : TypeToken<List<Genre>>() {}.type
        return Gson().fromJson<List<Genre>>(value, listType)
    }

    @TypeConverter
    fun fromList(list : List<Genre>?) : String {
        val gson = Gson()
        return gson.toJson(list)
    }
}