package com.ripalay.homework2.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.load(s: String) {
    Glide.with(this).load(s).into(this)
}