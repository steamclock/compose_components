package com.steamclock.compose_components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.steamclock.components.theme.NiceComponentsTheme
import com.steamclock.compose_components.views.AllComponents
import com.steamclock.compose_components.views.Home
import com.steamclock.compose_components.views.SignIn
import com.steamclock.compose_components.views.StatefulExample

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Content() }
    }
}

@Composable
private fun Content() {
    val navController = rememberNavController()
    Scaffold(topBar = {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        val currentRoute = currentDestination?.route ?: ""

        TopAppBar(
            title = {
                Text(text = currentRoute)
            },
            navigationIcon = {
                if (currentRoute != Routes.Home) {
                    Image(imageVector = Icons.Filled.ArrowBack,
                        colorFilter = ColorFilter.tint(MaterialTheme.colors.onPrimary),
                        contentDescription = "Back",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.popBackStack()
                            }
                    )
                }
            }
        )
    }) {
        NiceComponentsTheme {
            Surface {
                NavHost(navController = navController, startDestination = Routes.Home) {
                    composable(Routes.Home) { Home(navController) }
                    composable(Routes.AllComponents) { AllComponents() }
                    composable(Routes.SignIn) { SignIn() }
                    composable(Routes.StatefulView) { StatefulExample() }
                }
            }
        }
    }
}