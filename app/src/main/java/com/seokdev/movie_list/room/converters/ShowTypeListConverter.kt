package com.seokdev.movie_list.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seokdev.movie_list.models.entity.Nation
import com.seokdev.movie_list.models.entity.ShowType

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
open class ShowTypeListConverter {
    @TypeConverter
    fun fromString(value : String) : List<ShowType>? {
        val listType = object : TypeToken<List<ShowType>>() {}.type
        return Gson().fromJson<List<ShowType>>(value, listType)
    }

    @TypeConverter
    fun fromList(list : List<ShowType>?) : String {
        val gson = Gson()
        return gson.toJson(list)
    }
}