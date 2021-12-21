package com.steamclock.components.text

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.*

/**
 * Sample
 * Created by jake on 2021-12-17, 11:49 a.m.
 */
@Composable
fun DetailText(
    text: String,
    modifier: Modifier = Modifier,
    typeStyle: TypeStyle = CurrentConfig.detailTextStyle
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
fun DetailTextPreview() {
    NiceComponentsTheme {
        Surface {
            DetailText(text = "Detail Text")
        }
    }
}

@Preview
@Composable
fun DetailTextPreviewDark() {
    NiceComponentsTheme(Config(colorTheme = NiceComponentsDarkColors)) {
        Surface {
            DetailText(text = "Detail Text")
        }
    }
}