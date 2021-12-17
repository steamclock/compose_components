package com.steamclock.components.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.steamclock.components.extensions.fromHex

/**
 * Sample
 * Created by jake on 2021-12-17, 10:48 a.m.
 */
val NiceComponentsLightColors = lightColors(
    primary = Color.fromHex("#555ADF"),
    secondary = Color.fromHex("#399673"),
    onSecondary = Color.White,
    error = Color.fromHex("#CF4433"),
    onSurface = Color.Black,
    surface = Color.White,
    background = Color.fromHex("#E7E9EC")
)

val NiceComponentsDarkColors = darkColors(
    primary = Color.fromHex("#555ADF"),
    onPrimary = Color.White,
    secondary = Color.fromHex("#399673"),
    onSecondary = Color.White,
    error = Color.fromHex("#CF4433"),
    onError = Color.White,
    onSurface = Color.White,
    surface = Color.Black,
    background = Color.fromHex("#3D4147")
)

@Composable
fun NiceComponentsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    lightColors: Colors = NiceComponentsLightColors,
    darkColors: Colors = NiceComponentsDarkColors,
    typography: Typography = NiceComponentsTypography,
    shapes: Shapes = MaterialTheme.shapes,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) darkColors else lightColors,
        typography = typography,
        shapes = shapes,
        content = content)
}