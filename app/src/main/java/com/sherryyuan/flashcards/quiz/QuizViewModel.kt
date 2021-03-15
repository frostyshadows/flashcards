package com.sherryyuan.flashcards.quiz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class QuizViewModel(
    val questions: List<QuizQuestionViewModel>,
    var currentQuestionIndex: Int = 0,
    var correctCount: Int = 0,
) : ViewModel() {

    private val _currentQuestion: MutableLiveData<QuizQuestionViewModel> =
        MutableLiveData(questions[currentQuestionIndex])
    val currentQuestion: LiveData<QuizQuestionViewModel> = _currentQuestion

    fun onCorrectClicked() {
        correctCount++
    }

    fun onIncorrectClicked() {
    }
}