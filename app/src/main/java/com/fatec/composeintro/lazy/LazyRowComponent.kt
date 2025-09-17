package com.fatec.composeintro.lazy

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.composeintro.ui.theme.ComposeIntroTheme


@Composable
fun LazyRowComponent(
    modifier: Modifier = Modifier
) {
    val userList = listOf(
        User(name = "Raph", 40),
        User(name = "Pedro", 25),
        User(name = "Renato", 28),
        User(name = "Giba", 40),
        User(name = "Raphael", 40),
    )
    LazyRow {
        items(userList) { user ->
            Row {
                Column {
                    Text("Nome ${user.name}")
                    Text("Idade: ${user.age}")
                }
                Spacer(Modifier.width(16.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LazyRowComponentPreview() {
    ComposeIntroTheme {
        LazyRowComponent()
    }
}