package com.fatec.composeintro.exercicios.ex01

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.fatec.composeintro.ui.theme.ComposeIntroTheme

@Composable
fun CounterScreen(modifier: Modifier = Modifier) {
    var contador by remember { mutableStateOf(0) }


    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Valor: $contador",
            fontSize = 32.sp
        )


        Button(
            onClick = {
                contador++
            }
        ) {
            Text(text = "Incrementar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContadorScreenPreview() {
    ComposeIntroTheme {
        CounterScreen()
    }
}
