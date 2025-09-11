package com.fatec.composeintro.ui.screens.modifier

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fatec.composeintro.ui.components.modifier.ClickableText
import com.fatec.composeintro.ui.components.modifier.StyledBox
import com.fatec.composeintro.ui.components.modifier.StyledText
import com.fatec.composeintro.ui.theme.ComposeIntroTheme

@Composable
fun ModifierScreen(modifier: Modifier = Modifier) {
    Column {
        StyledText()
        StyledBox()
        ClickableText()
    }
}

@Preview(showBackground = true)
@Composable
private fun ModifierScreenPreview() {
    ComposeIntroTheme {
        ModifierScreen()
    }
}