package com.steamclock.components.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

/**
 * Sample
 * Created by jake on 2021-12-20, 10:14 a.m.
 */
data class TypeStyle(val color: Color, val theme: TextStyle, val lineLimit: Int? = null) {
    data class TextStyle(val size: TextUnit, val fontFamily: FontFamily? = null, val fontWeight: FontWeight? = null)
}
