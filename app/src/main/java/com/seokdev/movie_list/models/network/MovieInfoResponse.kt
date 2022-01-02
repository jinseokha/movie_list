package com.seokdev.movie_list.models.network


import com.google.gson.annotations.SerializedName

data class MovieInfoResponse(
    val movieInfoResult: MovieInfoResult
) {
    data class MovieInfoResult(
        val movieInfo: MovieInfo,
        val source: String
    ) {
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
        ) {
            data class Actor(
                val cast: String,
                val castEn: String,
                val peopleNm: String,
                val peopleNmEn: String
            )

            data class Audit(
                val auditNo: String,
                val watchGradeNm: String
            )

            data class Company(
                val companyCd: String,
                val companyNm: String,
                val companyNmEn: String,
                val companyPartNm: String
            )

            data class Director(
                val peopleNm: String,
                val peopleNmEn: String
            )

            data class Genre(
                val genreNm: String
            )

            data class Nation(
                val nationNm: String
            )

            data class ShowType(
                val showTypeGroupNm: String,
                val showTypeNm: String
            )

            data class Staff(
                val peopleNm: String,
                val peopleNmEn: String,
                val staffRoleNm: String
            )
        }
    }
}