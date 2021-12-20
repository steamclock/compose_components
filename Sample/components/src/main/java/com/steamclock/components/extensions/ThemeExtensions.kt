package com.steamclock.components.extensions

import androidx.compose.ui.text.TextStyle
import com.steamclock.components.theme.TypeStyle

fun TextStyle.applying(textStyle: TypeStyle.TextStyle?): TextStyle {
    return this.copy(
        fontSize = textStyle?.size ?: this.fontSize,
        fontFamily = textStyle?.fontFamily ?: this.fontFamily,
        fontWeight = textStyle?.fontWeight ?: this.fontWeight
    )
}