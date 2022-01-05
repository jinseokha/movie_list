package com.seokdev.movie_list.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seokdev.movie_list.models.entity.Actor

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
open class ActorListConverter {
    @TypeConverter
    fun fromString(value : String) : List<Actor>? {
        val listType = object : TypeToken<List<Actor>>() {}.type
        return Gson().fromJson<List<Actor>>(value, listType)
    }

    @TypeConverter
    fun fromList(list : List<Actor>?) : String {
        val gson = Gson()
        return gson.toJson(list)
    }
}