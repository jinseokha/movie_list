package com.seokdev.movie_list.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
open class StringListConverter {
    @TypeConverter
    fun fromString(value: String): List<String>? {
        val listType = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson<List<String>>(value, listType)
    }

    @TypeConverter
    fun fromList(list: List<String>?): String {
        val gson = Gson()
        return gson.toJson(list)
    }
}
