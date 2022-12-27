package com.saunakshrestha.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    ListView listV;
    Spinner spin;
    AutoCompleteTextView acText;
    //  int[] arrNo = new int[]{1, 2, 3, 4, 5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // listV = findViewById(R.id.listV);
        spin = findViewById(R.id.spin);
        acText = findViewById(R.id.acText);
       // ArrayList<String> arrNames = new ArrayList<>();
        ArrayList<String> arrId = new ArrayList<>();
        ArrayList<String> autoC = new ArrayList<>();

//        arrNames.add("Ram");
//        arrNames.add("Pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//        arrNames.add("Ram");
//        arrNames.add("pari");
//
//        ArrayAdapter<String> adapt = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);
//        listV.setAdapter(adapt);
//        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                if (i == 0) {
//                    Toast.makeText(MainActivity.this, "ClickedFirst", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        //Spinner
        arrId.add("Nagarikta");
        arrId.add("Nagarikta");
        arrId.add("Nagarikta1");
        arrId.add("Nagarikta2");
        arrId.add("Nagarikta");
        arrId.add("Nagarikta3");
        arrId.add("Nagarikta");
        arrId.add("Nagarikta");
        arrId.add("Nagarikta5");
        arrId.add("Nagarikta");
        arrId.add("Nagarikta");
        arrId.add("Nagarikta");
        arrId.add("Nagarikt77a");
        arrId.add("Nagarikta");
        arrId.add("Nagarikta");
        arrId.add("Nagarikta");
        arrId.add("Nagarikta");
        arrId.add("Naga77rikta");



        ArrayAdapter<String> spinAdapt = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrId);
        spin.setAdapter(spinAdapt);
//AutocComplete

        autoC.add("C");
        autoC.add("R");
        autoC.add("C++");
        autoC.add("Perl");
        autoC.add("JAVA");
        autoC.add("JS");
        ArrayAdapter<String> acompleteAdapt = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,autoC);
        acText.setAdapter(acompleteAdapt);
        acText.setThreshold(1);




    }
}