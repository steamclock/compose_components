package com.steamclock.components.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

/**
 * Sample
 * Created by jake on 2021-12-20, 10:14 a.m.
 */
data class TypeStyle(val color: Color, val theme: TypeTheme.TextStyle, val lineLimit: Int? = null) {
    fun toTextStyle(): TextStyle {
        return TextStyle(
            fontSize = theme.size,
            fontFamily = theme.fontFamily,
            fontWeight = theme.fontWeight
        )
    }

    companion object {
        @Composable
        fun build(
            color: Color = CurrentConfig.colorTheme.onSurface,
            theme: TypeTheme.TextStyle,
            lineLimit: Int? = null
        ): TypeStyle {
            return TypeStyle(color = color, theme = theme, lineLimit = lineLimit)
        }
    }
}
