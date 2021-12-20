package com.steamclock.components.button

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.extensions.applying
import com.steamclock.components.extensions.borderStroke
import com.steamclock.components.extensions.optionalMinHeight
import com.steamclock.components.theme.ButtonStyle
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 10:26 a.m.
 */
@Composable
fun DestructiveButton(
    text: String,
    modifier: Modifier = Modifier,
    buttonStyle: ButtonStyle? = null, // TODO: 2021-12-20 move into buttonstyle
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.optionalMinHeight(buttonStyle?.height),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = buttonStyle?.surfaceColor ?: MaterialTheme.colors.error
        ),
        shape = MaterialTheme.shapes.small.applying(buttonStyle?.border),
        border = buttonStyle?.border?.borderStroke()
    ) {
        Text(text,
            color = buttonStyle?.onSurfaceColor ?: MaterialTheme.colors.onError,
            style = LocalTextStyle.current.applying(buttonStyle?.textStyle)
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