package com.saunakshrestha.quicknotes;

import androidx.cardview.widget.CardView;

import com.saunakshrestha.quicknotes.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
