package com.steamclock.components.helper

import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.Config
import com.steamclock.components.theme.CurrentConfig
import com.steamclock.components.theme.NiceComponentsDarkColors
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 12:01 p.m.
 */
@Composable
fun ActivityIndicator(
    modifier: Modifier = Modifier
) {
    CircularProgressIndicator(
        modifier = modifier,
        color = CurrentConfig.colorTheme.primary
    )
}

@Preview
@Composable
fun ActivityIndicatorPreview() {
    NiceComponentsTheme {
        Surface {
            ActivityIndicator()
        }
    }
}

@Preview
@Composable
fun ActivityIndicatorPreviewDark() {
    NiceComponentsTheme(Config(colorTheme = NiceComponentsDarkColors)) {
        Surface {
            ActivityIndicator()
        }
    }
}