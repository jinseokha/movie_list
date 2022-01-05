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
@Entity(primaryKeys = [("boxofficeType")])
data class BoxOfficeResult(
    val boxofficeType: String,
    val showRange: String,
    val dailyBoxOfficeList: List<DailyBoxOffice>? = null,
    val weeklyBoxOfficeList: List<WeeklyBoxOffice>? = null,
    val yearWeekTime: String
) : Parcelable