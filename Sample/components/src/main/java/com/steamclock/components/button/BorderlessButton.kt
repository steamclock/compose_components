package com.steamclock.components.button

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material.*
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
    Surface {
        NiceComponentsTheme(false) {
            BorderlessButton(text = "Preview") {

            }
        }
    }
}

@Preview
@Composable
fun BorderlessButtonPreviewDark() {
    Surface {
        NiceComponentsTheme(darkTheme = true) {
            BorderlessButton(text = "Preview") {

            }
        }
    }
}