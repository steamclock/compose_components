package com.steamclock.components.text

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
 * Created by jake on 2021-12-17, 10:42 a.m.
 */
@Composable
fun BodyText(
    text: String,
    modifier: Modifier = Modifier,
    typeStyle: TypeStyle = CurrentConfig.bodyTextStyle
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
fun BodyTextPreview() {
    NiceComponentsTheme {
        Surface {
            BodyText(text = "Body Text")
        }
    }
}

@Preview
@Composable
fun BodyTextPreviewDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            BodyText(text = "Body Text")
        }
    }
}