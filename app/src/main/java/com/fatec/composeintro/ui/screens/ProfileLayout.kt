package com.fatec.composeintro.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ProfileLayout(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) { 
        Text("Nome do usuario")
        Text("Perfil do usuario")
        Row {
            Text("Seguidores: 100")
            Text("Seguindo: 80")
        }
    }    
}