package com.study.android.notesapp.domain

class GetNoteUseCase(
    private val repository: NotesRepository
) {

    suspend operator fun invoke(noteId: Int): Note {
        return repository.getNote(noteId)
    }
}