package com.fatec.composeintro.ui.screens.login

import android.app.Notification.Action
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fatec.composeintro.ui.components.login.ActionButton
import com.fatec.composeintro.ui.components.login.LoginInputField

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var email by remember{ mutableStateOf("") }
    var password by remember{ mutableStateOf("") }

    Column {
        Text(
            text = "Bem-vindo ao App",
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        LoginInputField(
            label = "E-mail",
            value = email,
            onValueChange = {
                novoTextoDigitado -> email = novoTextoDigitado}
        )
        Spacer(modifier = Modifier.height(16.dp))

        LoginInputField(
            label = "Password",
            value = password,
            onValueChange = {
                    novoTextoDigitado -> password = novoTextoDigitado}
        )

        ActionButton(
            text = "Entrar",
            onClick = {
                println("Clicou no login com o email $email e a senha $password")
            }
        )
    }
}