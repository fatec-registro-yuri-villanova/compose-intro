package com.fatec.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fatec.composeintro.ui.components.EmailInputText
import com.fatec.composeintro.ui.components.LoginButton
import com.fatec.composeintro.ui.components.TituloDaTela
import com.fatec.composeintro.ui.screens.ProfileLayout
import com.fatec.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeIntroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column {
                        Column(
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            Greeting(name = "Android")
                            TituloDaTela()
                            EmailInputText()
                            LoginButton()
                        }
                        Row {
                            TituloDaTela()
                            EmailInputText()
                            LoginButton()
                        }
                        ProfileLayout()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeIntroTheme {
        Greeting("Android")
    }
}