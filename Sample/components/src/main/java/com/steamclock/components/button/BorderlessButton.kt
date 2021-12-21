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
 * Created by jake on 2021-12-16, 4:26 p.m.
 */
@Composable
fun BorderlessButton(
    text: String,
    modifier: Modifier = Modifier,
    buttonStyle: ButtonStyle = CurrentConfig.borderlessButtonStyle,
    onClick: () -> Unit
) {
    TextButton(
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
fun BorderlessButtonPreview() {
    NiceComponentsTheme {
        Surface {
            BorderlessButton(text = "Preview") {

            }
        }
    }
}

@Preview
@Composable
fun BorderlessButtonPreviewDark() {
    NiceComponentsTheme(Config(colorTheme = NiceComponentsDarkColors)) {
        Surface {
            BorderlessButton(text = "Preview") {

            }
        }
    }
}