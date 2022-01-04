package com.seokdev.movie_list

import android.app.Application
import com.seokdev.movie_list.operator.GlobalResponseOperator
import com.skydoves.sandwich.SandwichInitializer
import dagger.hilt.android.HiltAndroidApp

/**
 * @author Ha Jin Seok
 * @email seok270@dahami.com
 * @created 2022-01-04
 * @desc
 */
@HiltAndroidApp
class MovieListApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        SandwichInitializer.sandwichOperator = GlobalResponseOperator<Any>(this)


    }
}