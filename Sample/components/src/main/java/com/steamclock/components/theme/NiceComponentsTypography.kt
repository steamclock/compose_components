package com.steamclock.components.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Sample
 * Created by jake on 2021-12-17, 10:44 a.m.
 */
fun niceComponentsTypography(fontFamily: FontFamily? = null) =
    Typography(
        h1 = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 48.sp
        ),
        h2 = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 34.sp
        ),
        h3 = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp
        ),
        h4 = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        ),
        subtitle1 = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        ),
        subtitle2 = TextStyle(
            fontFamily = fontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp
        ),
        body1 = TextStyle(
            fontFamily = fontFamily,
            fontSize = 16.sp
        ),
        body2 = TextStyle(
            fontFamily = fontFamily,
            fontSize = 14.sp
        ),
        button = TextStyle(
            fontFamily = fontFamily,
            fontSize = 14.sp
        ),
        caption = TextStyle(
            fontFamily = fontFamily,
            fontSize = 12.sp
        ),
        overline = TextStyle(
            fontFamily = fontFamily,
            fontSize = 12.sp
        )
)