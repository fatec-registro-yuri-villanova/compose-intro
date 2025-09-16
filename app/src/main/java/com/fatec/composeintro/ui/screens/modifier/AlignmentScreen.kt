package com.fatec.composeintro.ui.screens.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.composeintro.ui.theme.ComposeIntroTheme

@Composable
fun AlignmentDemoScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(500.dp)
            .background(Color.LightGray)
    ) {
        Row(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .background(Color.DarkGray),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Item 01", modifier = Modifier
                    .size(50.dp)
                    .background(Color.Red)
            )
            Text(
                "Item 02", modifier = Modifier
                    .size(50.dp)
                    .background(Color.Cyan)
            )
            Text(
                "Item 03", modifier = Modifier
                    .size(50.dp)
                    .background(Color.Green)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(Color.Yellow),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Item 01", modifier = Modifier
                    .size(50.dp)
                    .background(Color.Red)
            )
            Text(
                "Item 02", modifier = Modifier
                    .size(50.dp)
                    .background(Color.Cyan)
            )
            Text(
                "Item 03", modifier = Modifier
                    .size(50.dp)
                    .background(Color.Green)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AlignmentDemoScreen() {
    ComposeIntroTheme {
        AlignmentDemoScreen()
    }
}