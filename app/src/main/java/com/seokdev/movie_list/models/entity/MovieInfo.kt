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
data class MovieInfo(
    val actors: List<Actor>,
    val audits: List<Audit>,
    val companys: List<Company>,
    val directors: List<Director>,
    val genres: List<Genre>,
    val movieCd: String,
    val movieNm: String,
    val movieNmEn: String,
    val movieNmOg: String,
    val nations: List<Nation>,
    val openDt: String,
    val prdtStatNm: String,
    val prdtYear: String,
    val showTm: String,
    val showTypes: List<ShowType>,
    val staffs: List<Staff>,
    val typeNm: String
) : Parcelable