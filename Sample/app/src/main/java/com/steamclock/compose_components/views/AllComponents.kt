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
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            ScreenTitle("Screen Title")
            SectionTitle("Section Title")
            ItemTitle("Item Title")
        }

        ThemedDivider()

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            BodyText("Body Text")
            DetailText("Detail Text")
        }

        ThemedDivider()

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            PrimaryButton("Primary Button") { }
            SecondaryButton("Secondary Button") { }
            BorderlessButton("Borderless Button") { }
            InactiveButton("Inactive Button") { }
            DestructiveButton("Destructive Button") { }
        }

        ThemedDivider()

        Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {

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
