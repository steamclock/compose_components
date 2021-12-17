package com.steamclock.components.title

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 11:54 a.m.
 */
@Composable
fun SectionTitle(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        color = MaterialTheme.colors.onSurface,
        style = MaterialTheme.typography.h2
    )
}

@Preview
@Composable
fun SectionTitlePreview() {
    Surface {
        NiceComponentsTheme {
            ScreenTitle("Section Title")
        }
    }
}