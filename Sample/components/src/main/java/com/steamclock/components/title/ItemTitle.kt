package com.steamclock.components.title

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.steamclock.components.theme.*

/**
 * Sample
 * Created by jake on 2021-12-17, 11:51 a.m.
 */
@Composable
fun ItemTitle(
    text: String,
    modifier: Modifier = Modifier,
    typeStyle: TypeStyle = CurrentConfig.itemTitleStyle
) {
    Text(
        text = text,
        modifier = modifier,
        maxLines = typeStyle.lineLimit ?: Int.MAX_VALUE,
        color = typeStyle.color,
        style = typeStyle.toTextStyle()
    )
}

@Preview
@Composable
fun ItemTitlePreview() {
    NiceComponentsTheme {
        Surface {
            ItemTitle("Item Title")
        }
    }
}

@Preview
@Composable
fun ItemTitlePreviewDark() {
    NiceComponentsTheme(Config(colorTheme = NiceComponentsDarkColors)) {
        Surface {
            ItemTitle("Item Title")
        }
    }
}