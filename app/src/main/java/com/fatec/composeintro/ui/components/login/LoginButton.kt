package com.fatec.composeintro.ui.components.login

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LoginButton(modifier: Modifier = Modifier) {
    Button(
        onClick = {
            println("Clicou no login")
        }
    ) {
        Text("Login/Entrar")
    }
}