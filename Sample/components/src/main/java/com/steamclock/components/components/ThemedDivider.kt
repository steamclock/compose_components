package com.steamclock.components.components

import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steamclock.components.theme.Config
import com.steamclock.components.theme.CurrentConfig
import com.steamclock.components.theme.NiceComponentsDarkColors
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 12:16 p.m.
 */
@Composable
fun ThemedDivider(
    modifier: Modifier = Modifier
) {
    Divider(
        modifier = modifier.alpha(0.6f),
        color = CurrentConfig.colorTheme.onPrimary,
        thickness = 1.dp
    )
}

@Preview
@Composable
fun ScreenTitlePreview() {
    NiceComponentsTheme {
        Surface {
            ThemedDivider()
        }
    }
}

@Preview
@Composable
fun ScreenTitlePreviewDark() {
    NiceComponentsTheme(Config(colorTheme = NiceComponentsDarkColors)) {
        Surface {
            ThemedDivider()
        }
    }
}