package com.seokdev.movie_list.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seokdev.movie_list.models.entity.Audit

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
open class AuditListConverter {
    @TypeConverter
    fun fromString(value : String) : List<Audit>? {
        val listType = object : TypeToken<List<Audit>>() {}.type
        return Gson().fromJson<List<Audit>>(value, listType)
    }

    @TypeConverter
    fun fromList(list : List<Audit>?) : String {
        val gson = Gson()
        return gson.toJson(list)
    }
}