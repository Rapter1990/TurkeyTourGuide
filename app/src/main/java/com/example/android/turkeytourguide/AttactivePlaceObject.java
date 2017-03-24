package com.example.android.turkeytourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttactivePlaceObject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attactive_place_object);



        Intent mIntent = getIntent();
        Bundle bundle = mIntent.getExtras();

        int position = bundle.getInt("position");

        ArrayList <AttactivePlaces> attactivePlacesArraylist = new ArrayList<>();
        AttactivePlaces object = AttactivePlacesActivity.objects.get(position);




        ImageView attractivePlaceImage = (ImageView) findViewById(R.id.attractive_place_image);

        TextView attractivePlaceInformation = (TextView) findViewById(R.id.attractive_place_detailed_information);

        ImageView location = (ImageView) findViewById(R.id.location_icon);


        attractivePlaceImage.setImageResource(
                //cityAttactivePlaces.get(0).getAttactivePlaces().get(0).getmAttaticePlaceImageResourceId()
                object.getmAttaticePlaceImageResourceId()
        );


        attractivePlaceInformation.setText(
                //cityAttactivePlaces.get(0).getAttactivePlaces().get(0).getPlaceDetailInformation())
                object.getPlaceDetailInformation()
        );

        // Enabling scrollable in the attractivePlaceInformation textview
        attractivePlaceInformation.setMovementMethod(new ScrollingMovementMethod());

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent position1 = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&saddr=&daddr=41.025738,28.974843"));
                startActivity(position1);
            }
        });


    }
}
