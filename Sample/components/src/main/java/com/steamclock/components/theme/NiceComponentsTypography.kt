package com.steamclock.components.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.steamclock.components.extensions.applying

/**
 * Sample
 * Created by jake on 2021-12-17, 10:44 a.m.
 */
internal fun niceComponentsTypography(
    typeTheme: TypeTheme? = null,
) =
    Typography(
        h1 = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 48.sp
        ).applying(typeTheme?.headline1),
        h2 = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 34.sp
        ).applying(typeTheme?.headline2),
        h3 = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp
        ).applying(typeTheme?.headline3),
        h4 = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        ).applying(typeTheme?.headline4),
        subtitle1 = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        ).applying(typeTheme?.subtitle1),
        subtitle2 = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp
        ).applying(typeTheme?.subtitle2),
        body1 = TextStyle(
            fontSize = 16.sp
        ).applying(typeTheme?.body1),
        body2 = TextStyle(
            fontSize = 14.sp
        ).applying(typeTheme?.body2),
        button = TextStyle(
            fontSize = 14.sp
        ).applying(typeTheme?.button),
        caption = TextStyle(
            fontSize = 12.sp
        ).applying(typeTheme?.caption),
        overline = TextStyle(
            fontSize = 12.sp
        ).applying(typeTheme?.overline)
)