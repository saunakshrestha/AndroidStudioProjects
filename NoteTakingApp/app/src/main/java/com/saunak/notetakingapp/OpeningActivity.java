package com.saunak.notetakingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class OpeningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //we will run splash activity for some time and go back to main activity
        //add a timer
        //pass runnable interface with 1000ms timer
        new Handler().postDelayed(() -> {
           // After 1 sec , navigating to main activity
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if(currentUser == null){
                startActivity(new Intent(OpeningActivity.this,LoginActivity.class));

            }
            else{
                startActivity(new Intent(OpeningActivity.this,MainActivity.class));

            }
            finish();

        },1000);
    }
}