package com.fatec.composeintro.ui.components.modifier

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.composeintro.ui.theme.ComposeIntroTheme

@Composable
fun ClickableText(modifier: Modifier = Modifier) {

    var showTextClick by remember { mutableStateOf(false) }
    Column {
        Text(
            text = "Clique aqui!!",
            color = Color.Blue,
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clickable {
                    showTextClick = !showTextClick
                }
        )

        if (showTextClick) {
            Text("O clique aconteceu")
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun ClickableTextPreview() {
    ComposeIntroTheme {
        ClickableText()
    }
}