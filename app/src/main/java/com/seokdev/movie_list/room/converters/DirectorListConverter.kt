package com.seokdev.movie_list.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seokdev.movie_list.models.entity.Company
import com.seokdev.movie_list.models.entity.Director

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
open class DirectorListConverter {
    @TypeConverter
    fun fromString(value : String) : List<Director>? {
        val listType = object : TypeToken<List<Director>>() {}.type
        return Gson().fromJson<List<Director>>(value, listType)
    }

    @TypeConverter
    fun fromList(list : List<Director>?) : String {
        val gson = Gson()
        return gson.toJson(list)
    }
}