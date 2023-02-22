package com.saunak.notetakingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //we will run splash activity for some time and go back to main activity
        //add a timer
        //pass runnable interface with 1000ms timer
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               // After 1 sec , navigating to main activity
                startActivity(new Intent(SplashActivity.this,MainActivity.class));

            }
        },1000);
    }
}