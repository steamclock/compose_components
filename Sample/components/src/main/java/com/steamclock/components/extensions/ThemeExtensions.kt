package com.steamclock.components.extensions

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.steamclock.components.theme.BorderStyle
import com.steamclock.components.theme.TypeStyle

fun TextStyle.applying(textStyle: TypeStyle.TextStyle?): TextStyle {
    return this.copy(
        fontSize = textStyle?.size ?: this.fontSize,
        fontFamily = textStyle?.fontFamily ?: this.fontFamily,
        fontWeight = textStyle?.fontWeight ?: this.fontWeight
    )
}

fun Modifier.optionalMinHeight(height: Dp?): Modifier {
    return if (height != null) {
        this.defaultMinSize(minHeight = height)
    } else {
        this
    }
}

fun BorderStyle.borderStroke(): BorderStroke {
    return BorderStroke(color = color, width = width)
}

fun CornerBasedShape.applying(borderStyle: BorderStyle?): CornerBasedShape {
    return if (borderStyle != null) {
        this.copy(CornerSize(borderStyle.radius))
    } else {
        this
    }
}