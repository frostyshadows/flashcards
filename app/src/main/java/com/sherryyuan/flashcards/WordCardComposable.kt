package com.sherryyuan.flashcards

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sherryyuan.flashcards.ui.FlashcardsTheme
import com.sherryyuan.flashcards.ui.WORD_CARD_HEIGHT
import com.sherryyuan.flashcards.ui.typography

@Composable
fun WordCard(
    word: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        elevation = 8.dp
    ) {
        Text(
            text = word,
            style = typography.h1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    FlashcardsTheme {
        WordCard("Android")
    }
}