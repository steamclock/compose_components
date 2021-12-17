package com.steamclock.compose_components.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.steamclock.components.button.BorderlessButton
import com.steamclock.components.theme.NiceComponentsTheme
import com.steamclock.compose_components.Routes

/**
 * Sample
 * Created by jake on 2021-12-17, 2:12 p.m.
 */
@Composable
fun Home(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        BorderlessButton(text = "All Components") {
            navController.navigate(Routes.AllComponents)
        }
        BorderlessButton(text = "Sign in") {
            navController.navigate(Routes.SignIn)
        }
        BorderlessButton(text = "StatefulView Example") {
            navController.navigate(Routes.StatefulView)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    NiceComponentsTheme {
        Surface {
            val navController = rememberNavController()
            Home(navController = navController)
        }
    }
}