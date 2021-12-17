package com.steamclock.components.extensions

import androidx.compose.ui.graphics.Color

/**
 * Sample
 * Created by jake on 2021-12-17, 10:58 a.m.
 */
fun Color.Companion.fromHex(hex: String): Color {
    return Color(color = android.graphics.Color.parseColor(hex))
}