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
    primary = Color.fromHex("#4F46E5"),
    onPrimary = Color.fromHex("#F9FAFB"),
    primaryVariant = Color.fromHex("#4338CA"),
    secondary = Color.fromHex("#059669"),
    onSecondary = Color.fromHex("#F9FAFB"),
    secondaryVariant = Color.fromHex("#047857"),
    error = Color.fromHex("#DC2626"),
    onError = Color.fromHex("#F9FAFB"),
    onSurface = Color.fromHex("#111827"),
    surface = Color.fromHex("#F3F4F6"),
    background = Color.fromHex("#E5E7EB"),
    onBackground = Color.fromHex("#111827")
)

val NiceComponentsDarkColors = darkColors(
    primary = Color.fromHex("#4F46E5"),
    onPrimary = Color.fromHex("#F9FAFB"),
    primaryVariant = Color.fromHex("#4338CA"),
    secondary = Color.fromHex("#059669"),
    onSecondary = Color.fromHex("#F9FAFB"),
    secondaryVariant = Color.fromHex("#047857"),
    error = Color.fromHex("#DC2626"),
    onError = Color.fromHex("#F9FAFB"),
    onSurface = Color.fromHex("#F9FAFB"),
    surface = Color.fromHex("#1F2937"),
    background = Color.fromHex("#111827"),
    onBackground = Color.fromHex("#E5E7EB")
)

@Composable
fun NiceComponentsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    lightColors: Colors = NiceComponentsLightColors,
    darkColors: Colors = NiceComponentsDarkColors,
    typography: Typography = niceComponentsTypography(),
    shapes: Shapes = MaterialTheme.shapes,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) darkColors else lightColors,
        typography = typography,
        shapes = shapes,
        content = content)
}