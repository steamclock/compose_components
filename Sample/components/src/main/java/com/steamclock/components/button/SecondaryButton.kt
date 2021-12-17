package com.steamclock.components.button

import androidx.compose.foundation.BorderStroke
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
    borderStroke: BorderStroke? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.secondary
        ),
        shape = MaterialTheme.shapes.small,
        border = borderStroke
    ) {
        Text(text,
            color = MaterialTheme.colors.onSecondary,
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