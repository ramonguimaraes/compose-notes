package com.ramonguimaraes.composenotes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ramonguimaraes.composenotes.ui.theme.BabyBlue
import com.ramonguimaraes.composenotes.ui.theme.LightGreen
import com.ramonguimaraes.composenotes.ui.theme.RedOrange
import com.ramonguimaraes.composenotes.ui.theme.RedPink
import com.ramonguimaraes.composenotes.ui.theme.Violet

@Entity
data class Note(
    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)