package com.seokdev.movie_list.models.entity

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
@Parcelize
@Entity(primaryKeys = [("movieCd")])
data class Movie(
    val companys: List<Company?>? = null,
    val directors: List<Director?>? = null,
    val genreAlt: String? = null,
    val movieCd: String? = null,
    val movieNm: String? = null,
    val movieNmEn: String? = null,
    val nationAlt: String? = null,
    val openDt: String? = null,
    val prdtStatNm: String? = null,
    val prdtYear: String? = null,
    val repGenreNm: String? = null,
    val repNationNm: String? = null,
    val typeNm: String? = null
) : Parcelable