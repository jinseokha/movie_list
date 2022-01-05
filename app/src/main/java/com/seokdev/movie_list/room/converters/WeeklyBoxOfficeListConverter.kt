package com.seokdev.movie_list.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seokdev.movie_list.models.entity.ShowType
import com.seokdev.movie_list.models.entity.WeeklyBoxOffice

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
open class WeeklyBoxOfficeListConverter {
    @TypeConverter
    fun fromString(value : String) : List<WeeklyBoxOffice>? {
        val listType = object : TypeToken<List<WeeklyBoxOffice>>() {}.type
        return Gson().fromJson<List<WeeklyBoxOffice>>(value, listType)
    }

    @TypeConverter
    fun fromList(list : List<WeeklyBoxOffice>?) : String {
        val gson = Gson()
        return gson.toJson(list)
    }
}