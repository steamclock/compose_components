package com.steamclock.components.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.steamclock.components.extensions.fromHex

/**
 * Sample
 * Created by jake on 2021-12-17, 10:48 a.m.
 */
@Composable
fun NiceComponentsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    lightColors: Colors = lightColors(
        primary = Color.fromHex("#555ADF"),
        secondary = Color.fromHex("#399673"),
        onSecondary = Color.White,
        error = Color.fromHex("#CF4433"),
        onSurface = Color.Black,
        surface = Color.White,
        background = Color.fromHex("#E7E9EC")
    ),
    darkColors: Colors = darkColors(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) darkColors else lightColors,
        typography = NiceComponentsTypography,
        content = content)
}