package com.steamclock.compose_components.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steamclock.components.button.*
import com.steamclock.components.components.LoadingView
import com.steamclock.components.components.ThemedDivider
import com.steamclock.components.text.BodyText
import com.steamclock.components.text.DetailText
import com.steamclock.components.theme.NiceComponentsTheme
import com.steamclock.components.title.ItemTitle
import com.steamclock.components.title.ScreenTitle
import com.steamclock.components.title.SectionTitle

/**
 * Sample
 * Created by jake on 2021-12-17, 2:13 p.m.
 */
@Composable
fun AllComponents() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ScreenTitle("Screen Title")
            SectionTitle("Section Title")
            ItemTitle("Item Title")
        }

        ThemedDivider()

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            BodyText("Body Text")
            DetailText("Detail Text")
        }

        ThemedDivider()

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            PrimaryButton("Primary Button", modifier = Modifier.fillMaxWidth()) { }
            SecondaryButton("Secondary Button", modifier = Modifier.fillMaxWidth()) { }
            BorderlessButton("Borderless Button", modifier = Modifier.fillMaxWidth()) { }
            InactiveButton("Inactive Button", modifier = Modifier.fillMaxWidth()) { }
            DestructiveButton("Destructive Button", modifier = Modifier.fillMaxWidth()) { }
        }

        ThemedDivider()

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {

        }

        ThemedDivider()

        Row(modifier = Modifier.fillMaxSize()) {
            Spacer(Modifier.weight(1f))
            LoadingView()
            Spacer(Modifier.weight(1f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AllComponentsPreview() {
    NiceComponentsTheme {
        Surface {
            AllComponents()
        }
    }
}
