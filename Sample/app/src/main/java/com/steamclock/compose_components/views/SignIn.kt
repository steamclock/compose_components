package com.steamclock.compose_components.views

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steamclock.components.button.PrimaryButton
import com.steamclock.components.button.SecondaryButton
import com.steamclock.components.text.DetailText
import com.steamclock.components.theme.NiceComponentsTheme
import com.steamclock.components.title.ScreenTitle

/**
 * Sample
 * Created by jake on 2021-12-17, 2:13 p.m.
 */
@Composable
fun SignIn() {
    val emailString = remember { mutableStateOf("") }
    val passwordString = remember { mutableStateOf("") }
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ScreenTitle("Sign In")

        DetailText("Email")
        TextField(emailString.value,
            onValueChange = { emailString.value = it },
            modifier = Modifier.fillMaxWidth()
        )

        DetailText("Password")
        TextField(passwordString.value,
            onValueChange = { passwordString.value = it },
            modifier = Modifier.fillMaxWidth()
        )

        PrimaryButton("Sign In", modifier = Modifier.fillMaxWidth()) { }

        SecondaryButton("Create an Account", modifier = Modifier.fillMaxWidth()) {}
        Spacer(modifier = Modifier.weight(1f))
    }
}


@Preview(showBackground = true)
@Composable
fun SignInPreview() {
    NiceComponentsTheme {
        Surface {
            SignIn()
        }
    }
}