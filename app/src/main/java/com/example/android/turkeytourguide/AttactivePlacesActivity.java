package com.example.android.turkeytourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AttactivePlacesActivity extends AppCompatActivity {

    //ArrayList<String> items= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attactive_places);

        ArrayList<City> cityAttactivePlaces = new ArrayList<City>();

        // array boş geliyordu mainactivity deki arraylist static yaptım sorun çözüldü
        cityAttactivePlaces = MainActivity.cityArraylist;


        Intent mIntent = getIntent();
        Bundle bundle = mIntent.getExtras();

        int position = bundle.getInt("position");



        AttractivePlacesAdapter attractivePlacesAdapter = new AttractivePlacesAdapter(this,cityAttactivePlaces,R.color.mainBackground,position);

        ListView listView = (ListView) findViewById(R.id.listviewAttactivePlaces);

        listView.setAdapter(attractivePlacesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                switch(position){

                    case 0:
                        //Toast.makeText(getApplicationContext(),"Galata Tower",Toast.LENGTH_SHORT).show();
                        Toast.makeText(getApplicationContext(),position+"",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(AttactivePlacesActivity.this,AttactivePlaceObject.class);
                        intent.putExtra("position",position);
                        startActivity(intent);
                        break;

                    case 1:
                        //Toast.makeText(getApplicationContext(),"Topkapı Palace",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(AttactivePlacesActivity.this,AttactivePlaceObject.class)
                                .putExtra("position",position));
                        break;

                }

            }
        });

    }
}
