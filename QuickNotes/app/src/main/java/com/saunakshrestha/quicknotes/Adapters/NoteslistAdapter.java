package com.saunakshrestha.quicknotes.Adapters;


import android.content.Context;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.saunakshrestha.quicknotes.Models.Notes;
import com.saunakshrestha.quicknotes.NotesClickListener;
import com.saunakshrestha.quicknotes.R;

import java.util.List;

public class NoteslistAdapter extends RecyclerView.Adapter<NotesViewHolder>{
//create obj for context
    Context context;
    List<Notes> list;
    //creating separate listener for RCViewItems
    NotesClickListener listener;

    public NoteslistAdapter(Context context, List<Notes> list, NotesClickListener listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
class NotesViewHolder extends RecyclerView.ViewHolder{

    CardView notes_container;
    TextView textView_title,textView_notes,textView_date;
    ImageView imageView_pin;


    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);
        //initializing all above objects
        notes_container = itemView.findViewById(R.id.notes_container);
        textView_title = itemView.findViewById(R.id.textView_title);
        textView_notes = itemView.findViewById(R.id.textView_notes);
        textView_date = itemView.findViewById(R.id.textView_date);
        imageView_pin = itemView.findViewById(R.id.imageView_pin);






    }
}
