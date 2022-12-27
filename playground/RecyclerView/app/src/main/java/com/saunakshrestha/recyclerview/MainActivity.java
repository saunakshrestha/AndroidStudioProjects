package com.saunakshrestha.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //ArrayList with constructor ContactModel
    ArrayList<ContactModel> arrContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerContactPerson = findViewById(R.id.recyclerContactPerson);

        recyclerContactPerson.setLayoutManager(new LinearLayoutManager(this));


        arrContact.add(new ContactModel(R.drawable.camera, getString(R.string.david),getString(R.string.davidNo)));
        arrContact.add(new ContactModel(R.drawable.calendar, getString(R.string.raju), getString(R.string.rajuNo)));
        arrContact.add(new ContactModel(R.drawable.briefcase,getString(R.string.ronaldo), getString(R.string.ronaldoNo)));
        arrContact.add(new ContactModel(R.drawable.camera, getString(R.string.son), getString(R.string.sonNo)));
        arrContact.add(new ContactModel(R.drawable.hat, getString(R.string.michael), getString(R.string.michaelNo)));
        arrContact.add(new ContactModel(R.drawable.briefcase,getString(R.string.messi), getString(R.string.messiNo)));
        arrContact.add(new ContactModel(R.drawable.camera, getString(R.string.david2),getString(R.string.davidNo2)));
        arrContact.add(new ContactModel(R.drawable.calendar, getString(R.string.raju2), getString(R.string.rajuNo2)));
        arrContact.add(new ContactModel(R.drawable.briefcase,getString(R.string.ronaldo2), getString(R.string.ronaldoNo2)));
        arrContact.add(new ContactModel(R.drawable.camera, getString(R.string.son2), getString(R.string.sonNo2)));
        arrContact.add(new ContactModel(R.drawable.hat, getString(R.string.michael2), getString(R.string.michaelNo2)));
        arrContact.add(new ContactModel(R.drawable.briefcase,getString(R.string.messi2), getString(R.string.messiNo2)));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContact);
        recyclerContactPerson.setAdapter(adapter);


    }
}