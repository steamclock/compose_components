package com.steamclock.components.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.helper.ActivityIndicator
import com.steamclock.components.text.BodyText
import com.steamclock.components.theme.Config
import com.steamclock.components.theme.NiceComponentsDarkColors
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 12:05 p.m.
 */
@Composable
fun LoadingView(
    modifier: Modifier = Modifier,
    loadingText: String = "Loading"
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        ActivityIndicator()
        BodyText(text = loadingText)
    }
}

@Preview
@Composable
fun LoadingViewPreview() {
    NiceComponentsTheme {
        Surface {
            LoadingView()
        }
    }
}

@Preview
@Composable
fun LoadingViewPreviewDark() {
    NiceComponentsTheme(Config(colorTheme = NiceComponentsDarkColors)) {
        Surface {
            LoadingView()
        }
    }
}