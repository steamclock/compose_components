package com.steamclock.components.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 10:25 a.m.
 */
@Composable
fun SecondaryButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.secondary
        ),
        shape = MaterialTheme.shapes.small
//        border = BorderStroke(style.border.width, style.border.color)
    ) {
        Text(text,
            color = MaterialTheme.colors.onSecondary,
        )
    }
}

@Preview
@Composable
fun SecondaryButtonPreview() {
    Surface {
        NiceComponentsTheme(false) {
            SecondaryButton(text = "Preview") {

            }
        }
    }
}

@Preview
@Composable
fun SecondaryButtonPreviewDark() {
    Surface {
        NiceComponentsTheme(darkTheme = true) {
            SecondaryButton(text = "Preview") {

            }
        }
    }
}