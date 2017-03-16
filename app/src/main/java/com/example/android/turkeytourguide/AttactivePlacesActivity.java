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

    static ArrayList<AttactivePlaces> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attactive_places);

        Intent mIntent = getIntent();
        Bundle bundle = mIntent.getExtras();

        int position = bundle.getInt("position");

        objects = MainActivity.cityArraylist.get(position).getAttactivePlaces();

        AttractivePlacesAdapter attractivePlacesAdapter = new AttractivePlacesAdapter(this,MainActivity.cityArraylist.get(position).getAttactivePlaces(), R.color.mainBackground);

        ListView listView = (ListView) findViewById(R.id.listviewAttactivePlaces);
        listView.setAdapter(attractivePlacesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(getApplicationContext(),position+"",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AttactivePlacesActivity.this,AttactivePlaceObject.class);
                intent.putExtra("position",position);
                startActivity(intent);

            }
        });


    }
}
