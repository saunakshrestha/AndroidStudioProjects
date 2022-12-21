package com.saunakshrestha.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtResult;
        EditText editWeight,editHeightFt,editHeightIn;
        Button btnCalculate;
        LinearLayout liMain;


        editWeight = findViewById(R.id.editWeight);
        editHeightFt = findViewById(R.id.editHeightFt);
        editHeightIn = findViewById(R.id.editHeightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);
        liMain = findViewById(R.id.liMain);

        btnCalculate.setOnClickListener(view -> {
            int wt = Integer.parseInt(editWeight.getText().toString());
            int htFt = Integer.parseInt(editHeightFt.getText().toString());
            int htIn = Integer.parseInt(editHeightIn.getText().toString());

            int totalIn = ((htFt * 12) + htIn);
            double totalCm = 2.54 * totalIn;
            double totalM = (totalCm/100);
            double bmi = (wt / Math.pow(totalM,2));
            if (bmi > 25) {
                txtResult.setText(R.string.Ow);
                liMain.setBackgroundColor(getResources().getColor(R.color.ow));
            }
            else if (bmi < 18) {
                txtResult.setText(R.string.Uw);
                liMain.setBackgroundColor(getResources().getColor(R.color.uw));

            }
            else {
                txtResult.setText(R.string.Hw);
                liMain.setBackgroundColor(getResources().getColor(R.color.hw));

            }


        });



    }
}