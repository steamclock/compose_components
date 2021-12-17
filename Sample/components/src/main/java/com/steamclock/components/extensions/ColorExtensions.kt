package com.steamclock.components.extensions

import androidx.compose.ui.graphics.Color

/**
 * Sample
 * Created by jake on 2021-12-17, 10:58 a.m.
 */
// expecting a string "#000000", but also handles "000000"
fun Color.Companion.fromHex(hex: String): Color {
    val fixedHex = if (hex.startsWith("#")) hex else "#$hex"
    return Color(color = android.graphics.Color.parseColor(fixedHex))
}