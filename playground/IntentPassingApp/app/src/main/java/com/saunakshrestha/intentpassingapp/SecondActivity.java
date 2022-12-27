package com.saunakshrestha.intentpassingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent frmAct = getIntent();
        String title = frmAct.getStringExtra("title");
        String student =  frmAct.getStringExtra("StudentName");
        int rollNo = frmAct.getIntExtra("RollNo",0);


    }
}