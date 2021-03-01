package com.sherryyuan.flashcards

import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.ColumnScope.gravity
import androidx.compose.foundation.layout.RowScope.gravity
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.sherryyuan.flashcards.ui.FlashcardsTheme
import com.sherryyuan.flashcards.ui.WORD_CARD_HEIGHT
import com.sherryyuan.flashcards.ui.typography

@Composable
fun WordCard(
    word: String,
) {
    Card(
        modifier = Modifier
            .clickable(onClick = ::flipCard)
            .height(WORD_CARD_HEIGHT.dp)
            .fillMaxWidth()
            .padding(8.dp)
            .gravity(Alignment.CenterVertically)
            .gravity(Alignment.CenterHorizontally),
        elevation = 8.dp
    ) {
        Text(
            text = word,
            style = typography.h1
        )
    }
}

private fun flipCard() {

}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    FlashcardsTheme {
        WordCard("Android")
    }
}