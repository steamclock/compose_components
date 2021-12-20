package com.steamclock.components.theme

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

/**
 * Sample
 * Created by jake on 2021-12-20, 1:11 p.m.
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

@Immutable
data class Config(
    val isDarkTheme: Boolean = false,
    val lightColorTheme: Colors = NiceComponentsLightColors,
    val darkColorTheme: Colors = NiceComponentsDarkColors,

    val colorTheme: Colors = if (isDarkTheme) darkColorTheme else lightColorTheme,

    val typeTheme: TypeTheme = TypeTheme(),

    // Button Styles
    val borderlessButtonStyle: ButtonStyle = ButtonStyle(
        textStyle = typeTheme.button,
        surfaceColor = Color.Transparent,
        onSurfaceColor = colorTheme.primary,
        border = BorderStyle(color = Color.Transparent),
    ),

    val destructiveButtonStyle: ButtonStyle = ButtonStyle(
        textStyle = typeTheme.button,
        surfaceColor = colorTheme.error,
        onSurfaceColor = colorTheme.onError,
    ),

    val inactiveButtonStyle: ButtonStyle = ButtonStyle(
        textStyle = typeTheme.button,
        surfaceColor = colorTheme.background,
        onSurfaceColor = colorTheme.secondary,
    ),

    val primaryButtonStyle: ButtonStyle = ButtonStyle(
        textStyle = typeTheme.button,
        surfaceColor = colorTheme.primary,
        onSurfaceColor = colorTheme.onPrimary,
    ),

    val secondaryButtonStyle: ButtonStyle = ButtonStyle(
        textStyle = typeTheme.button,
        surfaceColor = colorTheme.secondary,
        onSurfaceColor = colorTheme.onSecondary,
    ),

    // Text Styles
    val bodyTextStyle: TypeStyle = TypeStyle(
        color = colorTheme.onSurface,
        theme = typeTheme.body1
    ),

    val detailTextStyle: TypeStyle =  TypeStyle(
        color = colorTheme.onSurface,
        theme = typeTheme.caption // body2?
    ),

    val itemTitleStyle: TypeStyle = TypeStyle(
        color = colorTheme.onSurface,
        theme = typeTheme.headline4
    ),

    val screenTitleStyle: TypeStyle = TypeStyle(
        color = colorTheme.onSurface,
        theme = typeTheme.headline1
    ),

    val sectionTitleStyle: TypeStyle = TypeStyle(
        color = colorTheme.onSurface,
        theme = typeTheme.headline2
    ),
)