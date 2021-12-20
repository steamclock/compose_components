package com.steamclock.components.text

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
 * Created by jake on 2021-12-17, 11:49 a.m.
 */
@Composable
fun DetailText(
    text: String,
    modifier: Modifier = Modifier,
    typeStyle: TypeStyle? = null
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = typeStyle?.lineLimit ?: Int.MAX_VALUE,
        color = typeStyle?.color ?: MaterialTheme.colors.onSurface,
        style = MaterialTheme.typography.caption.applying(typeStyle?.theme)
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
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            DetailText(text = "Detail Text")
        }
    }
}