package com.steamclock.components.title

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.CurrentConfig
import com.steamclock.components.theme.NiceComponentsTheme
import com.steamclock.components.theme.TypeStyle

/**
 * Sample
 * Created by jake on 2021-12-17, 11:53 a.m.
 */
@Composable
fun ScreenTitle(
    text: String,
    modifier: Modifier = Modifier,
    typeStyle: TypeStyle = CurrentConfig.screenTitleStyle
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = typeStyle.lineLimit ?: Int.MAX_VALUE,
        color = typeStyle.color,
        style = typeStyle.toTextStyle()
    )
}

@Preview
@Composable
fun ScreenTitlePreview() {
    NiceComponentsTheme {
        Surface {
            ScreenTitle("Screen Title")
        }
    }
}

@Preview
@Composable
fun ScreenTitlePreviewDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            ScreenTitle("Screen Title")
        }
    }
}