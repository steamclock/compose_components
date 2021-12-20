package com.steamclock.components.button

import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steamclock.components.extensions.applying
import com.steamclock.components.extensions.borderStroke
import com.steamclock.components.extensions.optionalMinHeight
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
        modifier = modifier.optionalMinHeight(buttonStyle?.height),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = buttonStyle?.surfaceColor ?: Color.Transparent
        ),
        border = buttonStyle?.border?.borderStroke()
    ) {
        Text(text,
            color = buttonStyle?.onSurfaceColor ?: MaterialTheme.colors.primary,
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