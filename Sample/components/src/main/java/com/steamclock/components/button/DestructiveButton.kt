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
fun DestructiveButton(
    text: String,
    modifier: Modifier = Modifier,
    buttonStyle: ButtonStyle = CurrentConfig.destructiveButtonStyle,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.defaultMinSize(minHeight = buttonStyle.height),
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
fun DestructiveButtonPreview() {
    NiceComponentsTheme {
        Surface {
            DestructiveButton(text = "Preview") {

            }
        }
    }
}

@Preview
@Composable
fun DestructiveButtonPreviewDark() {
    NiceComponentsTheme(Config(colorTheme = NiceComponentsDarkColors)) {
        Surface {
            DestructiveButton(text = "Preview") {
            }
        }
    }
}