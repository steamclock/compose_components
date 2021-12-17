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
 * Created by jake on 2021-12-17, 11:51 a.m.
 */
@Composable
fun ItemTitle(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = maxLines,
        color = MaterialTheme.colors.onSurface,
        style = MaterialTheme.typography.h4
    )
}

@Preview
@Composable
fun ItemTitlePreview() {
    NiceComponentsTheme {
        Surface {
            ItemTitle("Item Title")
        }
    }
}

@Preview
@Composable
fun ItemTitlePreviewDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            ItemTitle("Item Title")
        }
    }
}