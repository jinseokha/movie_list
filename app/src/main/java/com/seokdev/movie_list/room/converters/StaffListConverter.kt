package com.seokdev.movie_list.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seokdev.movie_list.models.entity.ShowType
import com.seokdev.movie_list.models.entity.Staff

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
open class StaffListConverter {
    @TypeConverter
    fun fromString(value : String) : List<Staff>? {
        val listType = object : TypeToken<List<Staff>>() {}.type
        return Gson().fromJson<List<Staff>>(value, listType)
    }

    @TypeConverter
    fun fromList(list : List<Staff>?) : String {
        val gson = Gson()
        return gson.toJson(list)
    }
}