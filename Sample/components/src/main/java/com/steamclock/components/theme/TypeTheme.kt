package com.steamclock.components.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

/**
 * Sample
 * Created by jake on 2021-12-20, 11:29 a.m.
 */
data class TypeTheme(
    val headline1: TextStyle? = null,
    val headline2: TextStyle? = null,
    val headline3: TextStyle? = null,
    val headline4: TextStyle? = null,
    val subtitle1: TextStyle? = null,
    val subtitle2: TextStyle? = null,

    val body1: TextStyle? = null,
    val body2: TextStyle? = null,

    val button: TextStyle? = null,
    val caption: TextStyle? = null,
    val overline: TextStyle? = null
) {
    data class TextStyle(val size: TextUnit, val fontFamily: FontFamily? = null, val fontWeight: FontWeight? = null)
}