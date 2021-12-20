package com.steamclock.components.button

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.ButtonStyle
import com.steamclock.components.theme.CurrentConfig
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 10:25 a.m.
 */
@Composable
fun SecondaryButton(
    text: String,
    modifier: Modifier = Modifier,
    buttonStyle: ButtonStyle = CurrentConfig.secondaryButtonStyle,
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