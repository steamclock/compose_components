package com.steamclock.components.button

import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steamclock.components.extensions.applying
import com.steamclock.components.extensions.optionalHeight
import com.steamclock.components.theme.ButtonStyle
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-16, 4:26 p.m.
 */
@Composable
fun BorderlessButton(
    text: String,
    modifier: Modifier = Modifier,
    buttonStyle: ButtonStyle? = null,
    onClick: () -> Unit
) {
    TextButton(
        modifier = modifier.optionalHeight(buttonStyle?.height),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = buttonStyle?.surfaceColor ?: MaterialTheme.colors.primary
        )
    ) {
        Text(text,
            color = buttonStyle?.onSurfaceColor ?: MaterialTheme.colors.onPrimary,
            style = LocalTextStyle.current.applying(buttonStyle?.textStyle)
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