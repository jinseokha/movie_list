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
data class WeeklyBoxOffice(
    val audiAcc: String,
    val audiChange: String,
    val audiCnt: String,
    val audiInten: String,
    val movieCd: String,
    val movieNm: String,
    val openDt: String,
    val rank: String,
    val rankInten: String,
    val rankOldAndNew: String,
    val rnum: String,
    val salesAcc: String,
    val salesAmt: String,
    val salesChange: String,
    val salesInten: String,
    val salesShare: String,
    val scrnCnt: String,
    val showCnt: String
) : Parcelable