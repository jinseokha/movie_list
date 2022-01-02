package com.seokdev.movie_list.binding

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.github.florent37.glidepalette.BitmapPalette
import com.github.florent37.glidepalette.GlidePalette
import com.seokdev.movie_list.extension.visible
import com.skydoves.whatif.whatIfNotNullOrEmpty

/**
 * @author Ha Jin Seok
 * @email seok270@gmail.com
 * @created 2022-01-02
 * @desc
 */

object ViewBinding {

    @JvmStatic
    @BindingAdapter("loadCircleImage")
    fun bindLoadCircleImage(view: AppCompatImageView, url: String) {
        Glide.with(view.context)
            .load(url)
            .apply(RequestOptions().circleCrop())
            .into(view)
    }

    @JvmStatic
    @BindingAdapter("loadPaletteImage", "loadPaletteTarget")
    fun bindLoadImage(view: AppCompatImageView, url: String, targetView: View) {
        Glide.with(view)
            .load(url)
            .listener(
                GlidePalette.with(url)
                    .use(BitmapPalette.Profile.VIBRANT)
                    .intoBackground(targetView)
                    .crossfade(true)
            )
            .into(view)
    }

    @JvmStatic
    @BindingAdapter("visibilityByResource")
    fun bindVisibilityByResource(view: View, anyList: List<Any>?) {
        anyList.whatIfNotNullOrEmpty {
            view.visible()
        }
    }
}