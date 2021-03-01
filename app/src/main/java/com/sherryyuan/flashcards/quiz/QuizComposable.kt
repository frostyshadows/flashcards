package com.sherryyuan.flashcards.quiz

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.ui.tooling.preview.Preview
import com.sherryyuan.flashcards.WordCard
import com.sherryyuan.flashcards.ui.FlashcardsTheme

@Composable
fun QuizComposable(viewModel: QuizViewModel) {
    WordCard(word = viewModel.word)
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.fillMaxSize()) {
            WordCard(word = viewModel.correctDef)
            WordCard(word = viewModel.incorrectDef1)
        }
        Row(Modifier.fillMaxSize()) {
            WordCard(word = viewModel.incorrectDef2)
            WordCard(word = viewModel.incorrectDef3)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    val viewModel = QuizViewModel(
        word = "grandiloquent",
        correctDef = "lofty in style",
        incorrectDef1 = "liberality in bestowing gifts",
        incorrectDef2 = "effusively or insincerely emotional",
        incorrectDef3 = "a small or moderate or token amount\n"
    )
    FlashcardsTheme {
        QuizComposable(viewModel)
    }
}