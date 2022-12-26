package com.saunakshrestha.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtAnim;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtAnim = findViewById(R.id.txtAnim);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Animation mover = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                txtAnim.startAnimation(mover);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alphas = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                txtAnim.startAnimation(alphas);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation cowRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                txtAnim.startAnimation(cowRotate);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation oxScale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                txtAnim.startAnimation(oxScale);
            }
        });


    }

}