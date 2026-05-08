package com.study.android.notesapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.study.android.notesapp.presentation.screens.notes.NotesScreen
import com.study.android.notesapp.presentation.ui.theme.NotesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NotesAppTheme {
                NotesScreen(
                    onNoteClick = {
                        Log.d("MainActivity", "onNoteClick: $it")
                    },
                    onAddNoteClick = {
                        Log.d("MainActivity", "onAddNoteClick")
                    }
                )
            }
        }
    }
}