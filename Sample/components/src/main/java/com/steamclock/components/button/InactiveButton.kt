package com.steamclock.components.button

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.*

/**
 * Sample
 * Created by jake on 2021-12-17, 10:26 a.m.
 */
@Composable
fun InactiveButton(
    text: String,
    modifier: Modifier = Modifier,
    buttonStyle: ButtonStyle = CurrentConfig.inactiveButtonStyle,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.defaultMinSize(minHeight = buttonStyle.height),
        enabled = false,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = buttonStyle.surfaceColor
        ),
        shape = RoundedCornerShape(buttonStyle.radius),
        border = buttonStyle.border?.borderStroke()
    ) {
        Text(text,
            color = buttonStyle.onSurfaceColor,
            style = buttonStyle.textStyle.toTextStyle()
        )
    }
}

@Preview
@Composable
fun InactiveButtonPreview() {
    NiceComponentsTheme {
        Surface {
            InactiveButton(text = "Preview") {

            }
        }
    }
}

@Preview
@Composable
fun InactiveButtonPreviewDark() {
    NiceComponentsTheme(Config(colorTheme = NiceComponentsDarkColors)) {
        Surface {
            InactiveButton(text = "Preview") {

            }
        }
    }
}