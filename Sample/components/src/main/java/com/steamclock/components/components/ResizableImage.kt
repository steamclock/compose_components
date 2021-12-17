package com.steamclock.components.components

import androidx.compose.foundation.Image
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.rememberImagePainter
import com.steamclock.components.theme.NiceComponentsTheme

/**
 * Sample
 * Created by jake on 2021-12-17, 12:31 p.m.
 */
@Composable
fun ResizableImage(
    url: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Image(
        painter = rememberImagePainter(url),
        contentDescription = contentDescription,
        modifier = modifier
    )
}

@Preview
@Composable
fun ResizableImagePreview() {
    NiceComponentsTheme {
        Surface {
            // note: displaying images from a URL doesn't work in preview
            ResizableImage("https://www.example.com/image.jpg", contentDescription = "None")
        }
    }
}

@Preview
@Composable
fun ResizableImagePreviewDark() {
    NiceComponentsTheme(darkTheme = true) {
        Surface {
            // note: displaying images from a URL doesn't work in preview
            ResizableImage("https://www.example.com/image.jpg", contentDescription = "None")
        }
    }
}