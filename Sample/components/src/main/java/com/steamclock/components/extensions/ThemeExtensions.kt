package com.steamclock.components.extensions

import androidx.compose.ui.text.TextStyle
import com.steamclock.components.theme.TypeStyle

fun TextStyle.applying(typeStyle: TypeStyle?): TextStyle {
    return this.copy(
        fontSize = typeStyle?.theme?.size ?: this.fontSize,
        fontFamily = typeStyle?.theme?.fontFamily ?: this.fontFamily,
        fontWeight = typeStyle?.theme?.fontWeight ?: this.fontWeight
    )
}