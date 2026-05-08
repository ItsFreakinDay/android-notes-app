package com.study.android.notesapp.domain

import kotlinx.coroutines.flow.Flow

class DeleteNoteUseCase(
    private val repository: NotesRepository
) {

    suspend operator fun invoke(noteId: Int) {
        repository.deleteNote(noteId)
    }
}