package com.fatec.composeintro.ui.components.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.composeintro.ui.theme.ComposeIntroTheme

@Composable
fun StyledText(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "StyledText",
            modifier = modifier
                .height(50.dp)
                .padding(
                    top = 20.dp,
                    end = 16.dp,
                    bottom = 14.dp,
                    start = 10.dp
                )
                .background(Color.Cyan)
        )
        Text(
            text = "StyledText",
            modifier = modifier
                .padding(
                    top = 20.dp,
                    end = 16.dp,
                    bottom = 14.dp,
                    start = 10.dp
                )
                .height(50.dp)
                .background(Color.Red)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun StyledTextPreview() {
    ComposeIntroTheme {
        StyledText()
    }
}