package com.steamclock.components.button

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-16, 4:26 p.m.
 */
@Composable
fun BorderlessButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    TextButton(
        modifier = modifier,
        onClick = onClick
    ) {
        Text(text,
            color = MaterialTheme.colors.primary,
        )
    }
}

@Preview
@Composable
fun BorderlessButtonPreview() {
    NiceComponentsTheme(false) {
        Surface {
            BorderlessButton(text = "Preview") {

            }
        }
    }
}

@Preview
@Composable
fun BorderlessButtonPreviewDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            BorderlessButton(text = "Preview") {

            }
        }
    }
}