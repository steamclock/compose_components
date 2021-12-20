package com.steamclock.components.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

/**
 * Sample
 * Created by jake on 2021-12-20, 11:29 a.m.
 */
data class TypeTheme(
    val headline1: TextStyle = TextStyle(size = 48.sp, fontWeight = FontWeight.SemiBold),
    val headline2: TextStyle = TextStyle(size = 34.sp, fontWeight = FontWeight.SemiBold),
    val headline3: TextStyle = TextStyle(size = 24.sp, fontWeight = FontWeight.SemiBold),
    val headline4: TextStyle = TextStyle(size = 20.sp, fontWeight = FontWeight.SemiBold),
    val subtitle1: TextStyle = TextStyle(size = 16.sp, fontWeight = FontWeight.SemiBold),
    val subtitle2: TextStyle = TextStyle(size = 14.sp, fontWeight = FontWeight.SemiBold),

    val body1: TextStyle = TextStyle(size = 16.sp),
    val body2: TextStyle = TextStyle(size = 14.sp),

    val button: TextStyle = TextStyle(size = 14.sp),
    val caption: TextStyle = TextStyle(size = 12.sp),
    val overline: TextStyle = TextStyle(size = 12.sp)
) {
    data class TextStyle(val size: TextUnit, val fontFamily: FontFamily? = null, val fontWeight: FontWeight? = null) {
        fun toTextStyle(): androidx.compose.ui.text.TextStyle {
            return TextStyle(
                fontSize = this.size,
                fontFamily = this.fontFamily,
                fontWeight = this.fontWeight,
            )
        }
    }
}