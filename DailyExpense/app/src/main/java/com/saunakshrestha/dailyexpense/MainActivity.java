package com.saunakshrestha.dailyexpense;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTitle,editAmt;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    editTitle = findViewById(R.id.editTitle);
    editAmt = findViewById(R.id.editAmt);
    btnAdd = findViewById(R.id.btnAdd);



    }
}