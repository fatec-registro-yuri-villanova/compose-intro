package com.fatec.composeintro.exercicios.ex02

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.composeintro.ui.theme.ComposeIntroTheme

@Composable
fun ToDoListScreen(modifier: Modifier = Modifier) {
    var tasks by remember { mutableStateOf(listOf<String>()) }


    var newTaskText by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        OutlinedTextField(
            value = newTaskText,
            onValueChange = { newTaskText = it },
            label = { Text("Nova Tarefa") },
            modifier = Modifier.fillMaxWidth()
        )


        Button(
            onClick = {
                if (newTaskText.isNotBlank()) {
                    tasks = tasks + newTaskText
                    newTaskText = ""
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Adicionar")
        }

        Spacer(modifier = Modifier.height(16.dp))


        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            tasks.forEach { task ->
                Card(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = task,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ToDoListPreview() {
    ComposeIntroTheme {
        ToDoListScreen()
    }
}