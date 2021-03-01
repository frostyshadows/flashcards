package com.sherryyuan.flashcards

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.sherryyuan.flashcards.ui.FlashcardsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlashcardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    WordCard("Android")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    FlashcardsTheme {
        WordCard("Android")
    }
}