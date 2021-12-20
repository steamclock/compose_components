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
 * Created by jake on 2021-12-17, 11:54 a.m.
 */
@Composable
fun SectionTitle(
    text: String,
    modifier: Modifier = Modifier,
    typeStyle: TypeStyle = CurrentConfig.sectionTitleStyle
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
fun SectionTitlePreview() {
    NiceComponentsTheme {
        Surface {
            ScreenTitle("Section Title")
        }
    }
}


@Preview
@Composable
fun SectionTitlePreviewDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            ScreenTitle("Section Title")
        }
    }
}