package com.seokdev.movie_list.models.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-05
 * @desc
 */
@Parcelize
data class Staff(
    val peopleNm: String,
    val peopleNmEn: String,
    val staffRoleNm: String
) : Parcelable