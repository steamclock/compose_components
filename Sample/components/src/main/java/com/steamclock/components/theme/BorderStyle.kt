package com.steamclock.components.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Sample
 * Created by jake on 2021-12-20, 10:56 a.m.
 */
data class BorderStyle(
    val color: Color,
    val width: Dp = 0.dp
) {
    fun borderStroke(): BorderStroke {
        return BorderStroke(color = color, width = width)
    }
}