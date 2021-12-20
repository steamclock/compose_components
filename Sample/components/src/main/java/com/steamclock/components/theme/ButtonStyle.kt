package com.steamclock.components.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Sample
 * Created by jake on 2021-12-20, 10:39 a.m.
 */
data class ButtonStyle(
    val textStyle: TypeTheme.TextStyle? = null,
    val height: Dp = 44.dp,
    val surfaceColor: Color? = null,
    val onSurfaceColor: Color? = null,
    val border: BorderStyle? = null
)