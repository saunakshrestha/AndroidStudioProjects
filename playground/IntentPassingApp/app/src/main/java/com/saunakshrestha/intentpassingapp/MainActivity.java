package com.saunakshrestha.intentpassingapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext;
        btnNext = findViewById(R.id.btnNext);
        Intent iNext;
        iNext = new Intent(MainActivity.this,SecondActivity.class);

        iNext.putExtra("title","Home");
        iNext.putExtra("StudentName","David");
        iNext.putExtra("RollNo",10);


        btnNext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                    startActivity(iNext);
            }
        });

    }
}