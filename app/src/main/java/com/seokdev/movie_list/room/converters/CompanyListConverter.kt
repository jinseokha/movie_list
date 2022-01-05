package com.seokdev.movie_list.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seokdev.movie_list.models.entity.Audit
import com.seokdev.movie_list.models.entity.Company

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
open class CompanyListConverter {
    @TypeConverter
    fun fromString(value : String) : List<Company>? {
        val listType = object : TypeToken<List<Company>>() {}.type
        return Gson().fromJson<List<Company>>(value, listType)
    }

    @TypeConverter
    fun fromList(list : List<Company>?) : String {
        val gson = Gson()
        return gson.toJson(list)
    }
}