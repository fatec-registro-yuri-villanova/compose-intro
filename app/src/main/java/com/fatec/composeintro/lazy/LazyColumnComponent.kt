package com.fatec.composeintro.lazy

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.composeintro.ui.theme.ComposeIntroTheme


@Composable
fun LazyColumnComponent(
    modifier: Modifier = Modifier
) {
    val userList = listOf(
        User(name = "Raphael", 40),
        User(name = "Pedro", 25),
        User(name = "Renato", 28),
        User(name = "Giba", 40),

        User(name = "Pedro", 25),
        User(name = "Renato", 28),
        User(name = "Giba", 40),

        User(name = "Pedro", 25),
        User(name = "Renato", 28),
        User(name = "Giba", 40),

        User(name = "Pedro", 25),
        User(name = "Renato", 28),
        User(name = "Giba", 40),
    )
    LazyColumn {
        items(userList) { user ->
            Column {
                Text("O nome do user é: ${user.name}")
                Text("O idade do user é: ${user.age}")
                Spacer(Modifier.height(16.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LazyColumnComponentPreview() {
    ComposeIntroTheme {
        LazyColumnComponent()
    }
}