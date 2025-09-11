package com.fatec.composeintro.ui.components.login

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun EmailInputText(){
    var email by remember{ mutableStateOf("") }

    //value é texto que esta sendo exibido
    //onValueChange quem escuta a alteracao do componente

    TextField(
        value = email,
        onValueChange = {
            novoTexto -> email = novoTexto

        },
        label = {
            Text("E-mail")
        }
    )


}