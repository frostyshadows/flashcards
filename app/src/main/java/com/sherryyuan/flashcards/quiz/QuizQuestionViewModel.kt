package com.sherryyuan.flashcards.quiz

data class QuizQuestionViewModel(
    val word: String,
    val correctDef: String,
    val incorrectDef1: String,
    val incorrectDef2: String,
    val incorrectDef3: String,
)