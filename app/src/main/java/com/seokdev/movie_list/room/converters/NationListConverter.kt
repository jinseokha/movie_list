package com.seokdev.movie_list.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seokdev.movie_list.models.entity.Genre
import com.seokdev.movie_list.models.entity.Nation

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
open class NationListConverter {
    @TypeConverter
    fun fromString(value : String) : List<Nation>? {
        val listType = object : TypeToken<List<Nation>>() {}.type
        return Gson().fromJson<List<Nation>>(value, listType)
    }

    @TypeConverter
    fun fromList(list : List<Nation>?) : String {
        val gson = Gson()
        return gson.toJson(list)
    }
}