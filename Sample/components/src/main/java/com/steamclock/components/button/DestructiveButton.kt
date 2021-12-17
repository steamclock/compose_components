package com.steamclock.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 10:26 a.m.
 */
@Composable
fun DestructiveButton(
    text: String,
    modifier: Modifier = Modifier,
    borderStroke: BorderStroke? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.error
        ),
        shape = MaterialTheme.shapes.small,
        border = borderStroke
    ) {
        Text(text,
            color = MaterialTheme.colors.onError,
        )
    }
}

@Preview
@Composable
fun DestructiveButtonPreview() {
    NiceComponentsTheme(false) {
        Surface {
            DestructiveButton(text = "Preview") {

            }
        }
    }
}

@Preview
@Composable
fun DestructiveButtonPreviewDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            DestructiveButton(text = "Preview") {
            }
        }
    }
}