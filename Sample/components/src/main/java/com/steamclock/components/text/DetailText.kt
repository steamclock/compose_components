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
 * Created by jake on 2021-12-17, 11:49 a.m.
 */
@Composable
fun DetailText(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        color = MaterialTheme.colors.onSurface,
        style = MaterialTheme.typography.caption
    )
}

@Preview
@Composable
fun DetailTextPreview() {
    Surface {
        NiceComponentsTheme {
            DetailText(text = "Detail Text")
        }
    }
}