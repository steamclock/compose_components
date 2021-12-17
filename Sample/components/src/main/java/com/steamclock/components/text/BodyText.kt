package com.steamclock.components.text

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 10:42 a.m.
 */
@Composable
fun BodyText(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        color = MaterialTheme.colors.onSurface,
        style = MaterialTheme.typography.body1
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