package com.sherryyuan.flashcards.quiz

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope.align
import androidx.compose.foundation.layout.RowScope.weight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.sherryyuan.flashcards.WordCard
import com.sherryyuan.flashcards.ui.FlashcardsTheme
import com.sherryyuan.flashcards.ui.WORD_CARD_HEIGHT

@Composable
fun QuizComposable(viewModel: QuizViewModel) {
    val currentQuestion: QuizQuestionViewModel by viewModel.currentQuestion.observeAsState(viewModel.questions[0])
    val answerModifier = Modifier
        .height(WORD_CARD_HEIGHT.dp)
        .weight(1f)
        .padding(8.dp)
        .align(Alignment.CenterVertically)

    WordCard(word = currentQuestion.word)
    Column {
        Row(Modifier.weight(1f)) {
            val word: String = currentQuestion.correctDef
            WordCard(
                word = word,
                modifier = answerModifier
                    .clickable(onClick = viewModel::onCorrectClicked)
            )
            WordCard(
                word = currentQuestion.incorrectDef1,
                modifier = answerModifier
                    .clickable(onClick = viewModel::onIncorrectClicked)
            )
        }
        Row(Modifier.weight(1f)) {
            WordCard(
                word = currentQuestion.incorrectDef2,
                modifier = answerModifier
                    .clickable(onClick = viewModel::onIncorrectClicked)
            )
            WordCard(
                word = currentQuestion.incorrectDef3,
                modifier = answerModifier
                    .clickable(onClick = viewModel::onIncorrectClicked)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    val questionViewModel = QuizQuestionViewModel(
        word = "grandiloquent",
        correctDef = "lofty in style",
        incorrectDef1 = "liberality in bestowing gifts",
        incorrectDef2 = "effusively or insincerely emotional",
        incorrectDef3 = "a small or moderate or token amount\n"
    )

    val quizViewModel = QuizViewModel(questions = listOf(questionViewModel))
    FlashcardsTheme {
        QuizComposable(quizViewModel)
    }
}