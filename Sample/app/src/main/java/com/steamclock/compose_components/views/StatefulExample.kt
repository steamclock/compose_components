package com.steamclock.compose_components.views

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steamclock.components.components.StatefulView
import com.steamclock.components.helper.ContentLoadState
import com.steamclock.components.theme.NiceComponentsTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Sample
 * Created by jake on 2021-12-17, 2:13 p.m.
 */
@Composable
fun StatefulExample() {
    val state = remember { mutableStateOf<ContentLoadState>(ContentLoadState.NoData) }
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(state) {
        coroutineScope.launch {
            delay(1000)
            state.value = ContentLoadState.Loading
            delay(1000)
            state.value = ContentLoadState.HasData
        }
    }

    Surface(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        StatefulView(state = state.value, content = {
            Text("Here's some state!")
        })
    }
}

@Preview(showBackground = true)
@Composable
fun StatefulExamplePreview() {
    NiceComponentsTheme {
        Surface {
            StatefulExample()
        }
    }
}