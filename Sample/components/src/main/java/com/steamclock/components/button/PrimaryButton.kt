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
 * Created by jake on 2021-12-17, 10:22 a.m.
 */
@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    buttonStyle: ButtonStyle? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.optionalMinHeight(buttonStyle?.height),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = buttonStyle?.surfaceColor ?: MaterialTheme.colors.primary
        ),
        shape = MaterialTheme.shapes.small,
        border = buttonStyle?.border?.borderStroke()
    ) {
        Text(text,
            color = buttonStyle?.onSurfaceColor ?: MaterialTheme.colors.onPrimary,
            style = LocalTextStyle.current.applying(buttonStyle?.textStyle)
        )
    }
}

@Preview
@Composable
fun PrimaryButtonPreview() {
    NiceComponentsTheme(false) {
        Surface {
            PrimaryButton(text = "Preview") {

            }
        }
    }
}

@Preview
@Composable
fun PrimaryButtonPreviewDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            PrimaryButton(text = "Preview") {

            }
        }
    }
}