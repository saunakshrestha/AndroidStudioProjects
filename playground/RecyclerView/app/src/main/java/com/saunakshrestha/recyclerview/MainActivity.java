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


        arrContact.add(new ContactModel(R.drawable.camera, getString(R.string.apple),getString(R.string.appleNo)));
        arrContact.add(new ContactModel(R.drawable.calendar, getString(R.string.ball), getString(R.string.ballNo)));
        arrContact.add(new ContactModel(R.drawable.briefcase,getString(R.string.cat), getString(R.string.catNo)));
        arrContact.add(new ContactModel(R.drawable.camera, getString(R.string.dog), getString(R.string.dogNo)));
        arrContact.add(new ContactModel(R.drawable.hat, getString(R.string.elephant), getString(R.string.elephantNo)));
        arrContact.add(new ContactModel(R.drawable.briefcase,getString(R.string.fish), getString(R.string.fishNo)));
        arrContact.add(new ContactModel(R.drawable.camera, getString(R.string.gun),getString(R.string.gunNo)));
        arrContact.add(new ContactModel(R.drawable.calendar, getString(R.string.hat), getString(R.string.hatNo)));
        arrContact.add(new ContactModel(R.drawable.briefcase,getString(R.string.ice), getString(R.string.iceNo)));
        arrContact.add(new ContactModel(R.drawable.camera, getString(R.string.jelly), getString(R.string.jellyNo)));
        arrContact.add(new ContactModel(R.drawable.hat, getString(R.string.kitkat), getString(R.string.kitkatNo)));
        arrContact.add(new ContactModel(R.drawable.briefcase,getString(R.string.lion), getString(R.string.lionNo)));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContact);
        recyclerContactPerson.setAdapter(adapter);


    }
}