package com.saunak.notetakingapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentReference;


public class NoteDetailsActivity extends AppCompatActivity {

    EditText titleEditText,contentEditText;
    TextView saveNoteBtn;
    TextView pageTitleTextView;
    String title,content,docId;
    boolean isEditMode = false;
    TextView deleteNoteTextViewBtn;
    private long pressedTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);

        titleEditText = findViewById(R.id.notes_title_text);
        contentEditText = findViewById(R.id.notes_content_text);
        saveNoteBtn = findViewById(R.id.save_note_btn);
        pageTitleTextView = findViewById(R.id.page_title);
        deleteNoteTextViewBtn = findViewById(R.id.delete_note_text_view_btn);

        //receive data
        title = getIntent().getStringExtra("title");
        content = getIntent().getStringExtra("content");
        docId = getIntent().getStringExtra("docId");

        if(docId != null && !docId.isEmpty()){
            isEditMode = true;
        }
        titleEditText.setText(title);
        contentEditText.setText(content);

        if(isEditMode){
            pageTitleTextView.setText(R.string.edit_your_note);
            deleteNoteTextViewBtn.setVisibility(View.VISIBLE);
        }


        saveNoteBtn.setOnClickListener((v) -> saveNote());

        deleteNoteTextViewBtn.setOnClickListener(v -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(NoteDetailsActivity.this)
                    .setTitle("Delete note")
                    .setMessage("Are you sure?")
                    .setIcon(R.drawable.baseline_delete_24)
                    .setPositiveButton("Yes", (dialog, which) -> deleteNoteFromFirebase())
                    .setNegativeButton("No", (dialog, which) -> {

                    });
            builder.show();

        });
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NoteDetailsActivity.this)
                .setTitle("Do you want to save note?")
                .setMessage("Are you sure?")
                .setIcon(R.drawable.baseline_done_24)
                .setPositiveButton("Yes", (dialog, which) -> saveNote())
                .setNegativeButton("No", (dialog, which) -> {
                    super.onBackPressed();
                });
        builder.show();

    }
    void saveNote(){
        String noteTitle = titleEditText.getText().toString();
        String noteContent = contentEditText.getText().toString();
        if(noteTitle.isEmpty()){
            titleEditText.setError("Title is required");
            return;
        }

        Note note = new Note();
        note.setTitle(noteTitle);
        note.setContent(noteContent);
        note.setTimestamp(Timestamp.now());

        saveNoteToFirebase(note);

    }

    void saveNoteToFirebase(Note note){
        DocumentReference documentReference;
        if(isEditMode){
            //update the note
            documentReference = Utility.getCollectionReferenceForNotes().document(docId);

        }else{
            //create the note
            documentReference = Utility.getCollectionReferenceForNotes().document();

        }
        documentReference.set(note).addOnCompleteListener(task -> {
            if(task.isSuccessful()){
                //note is added
                Toast toast = new Toast(getApplicationContext());
                View getToastView = getLayoutInflater()
                        .inflate(R.layout.my_toast, (ViewGroup) findViewById(R.id.toastViewGroup));
                toast.setView(getToastView);
                TextView tvMessage = getToastView.findViewById(R.id.simpleToast);
                tvMessage.setText(R.string.Note_added_successfully);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, -100);
                toast.show();
                finish();
            }else{
                Utility.showToast(NoteDetailsActivity.this,"Failed while adding note");
            }
        });


    }
    void deleteNoteFromFirebase(){
        DocumentReference documentReference;

            documentReference = Utility.getCollectionReferenceForNotes().document(docId);

        documentReference.delete().addOnCompleteListener(task -> {
            if(task.isSuccessful()){
                //note is deleted
                Toast toast = new Toast(getApplicationContext());
                View getToastView = getLayoutInflater()
                        .inflate(R.layout.my_toast, (ViewGroup) findViewById(R.id.toastViewGroup));
                toast.setView(getToastView);
                TextView tvMessage = getToastView.findViewById(R.id.simpleToast);
                tvMessage.setText(R.string.Note_has_been_deleted);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, -100);
                toast.show();
                finish();
            }else{
                Utility.showToast(NoteDetailsActivity.this,"Failed while deleting note");
            }
        });

    }
}