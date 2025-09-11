package com.fatec.composeintro.ui.components.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.composeintro.ui.theme.ComposeIntroTheme

@Composable
fun StyledBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(100.dp)

            .background(
                color = Color.Gray,
                shape = RoundedCornerShape(15.dp)
            )
            .border(5.dp, Color.Red, RoundedCornerShape(8.dp))

    ) {

    }
}

@Preview(showBackground = true)
@Composable
private fun StyledBoxPreview() {
    ComposeIntroTheme {
        StyledBox()
    }
}