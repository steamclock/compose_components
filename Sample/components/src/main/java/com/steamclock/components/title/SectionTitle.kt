package com.steamclock.components.title

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.extensions.applying
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
    typeStyle: TypeStyle? = null
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = typeStyle?.lineLimit ?: Int.MAX_VALUE,
        color = typeStyle?.color ?: MaterialTheme.colors.onSurface,
        style = MaterialTheme.typography.h2.applying(typeStyle?.theme)
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