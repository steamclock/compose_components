package com.steamclock.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.extensions.applying
import com.steamclock.components.extensions.optionalHeight
import com.steamclock.components.theme.ButtonStyle
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 10:25 a.m.
 */
@Composable
fun SecondaryButton(
    text: String,
    modifier: Modifier = Modifier,
    borderStroke: BorderStroke? = null,
    buttonStyle: ButtonStyle? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.optionalHeight(buttonStyle?.height),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor =  buttonStyle?.surfaceColor ?: MaterialTheme.colors.secondary
        ),
        shape = MaterialTheme.shapes.small,
        border = borderStroke
    ) {
        Text(text,
            color = buttonStyle?.onSurfaceColor ?: MaterialTheme.colors.onSecondary,
            style = LocalTextStyle.current.applying(buttonStyle?.textStyle)
        )
    }
}

@Preview
@Composable
fun SecondaryButtonPreview() {
    NiceComponentsTheme(false) {
        Surface {
            SecondaryButton(text = "Preview") {

            }
        }
    }
}

@Preview
@Composable
fun SecondaryButtonPreviewDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            SecondaryButton(text = "Preview") {

            }
        }
    }
}