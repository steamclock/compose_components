package com.steamclock.components.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Sample
 * Created by jake on 2021-12-17, 10:48 a.m.
 */
val NiceComponentsLightColors = lightColors(
    primary =  Color(0xFF4F46E5),
    onPrimary = Color(0xFFF9FAFB),
    primaryVariant = Color(0xFF4338CA),
    secondary = Color(0xFF059669),
    onSecondary = Color(0xFFF9FAFB),
    secondaryVariant = Color(0xFF047857),
    error = Color(0xFFDC2626),
    onError = Color(0xFFF9FAFB),
    onSurface = Color(0xFF111827),
    surface = Color(0xFFF3F4F6),
    background = Color(0xFFE5E7EB),
    onBackground = Color(0xFF111827)
)

val NiceComponentsDarkColors = darkColors(
    primary =  Color(0xFF4F46E5),
    onPrimary = Color(0xFFF9FAFB),
    primaryVariant = Color(0xFF4338CA),
    secondary = Color(0xFF059669),
    onSecondary = Color(0xFFF9FAFB),
    secondaryVariant = Color(0xFF047857),
    error = Color(0xFFDC2626),
    onError = Color(0xFFF9FAFB),
    onSurface = Color(0xFFF9FAFB),
    surface = Color(0xFF1F2937),
    background = Color(0xFF111827),
    onBackground = Color(0xFFE5E7EB)
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