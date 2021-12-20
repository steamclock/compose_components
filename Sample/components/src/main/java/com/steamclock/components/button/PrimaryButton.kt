package com.steamclock.components.button

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.ButtonStyle
import com.steamclock.components.theme.NiceComponentsTheme
import com.steamclock.components.theme.CurrentConfig

/**
 * Sample
 * Created by jake on 2021-12-17, 10:22 a.m.
 */
@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    buttonStyle: ButtonStyle = CurrentConfig.primaryButtonStyle,
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