package com.example.android.turkeytourguide;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class CityCategoryScreen extends AppCompatActivity {

    static City cityForCategory = new City();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_category_screen);

        ImageView categoryCityImage = (ImageView) findViewById(R.id.category_city_image);

        TextView categoryAttractivePlacesButton = (TextView) findViewById(R.id.category_attractive_places_button);

        TextView categoryRestaurantButton = (TextView) findViewById(R.id.category_restaurant_button);

        TextView categoryEventButton = (TextView) findViewById(R.id.category_events_button);


        Intent mIntent = getIntent();
        Bundle bundle = mIntent.getExtras();

        int position = bundle.getInt("position");

        cityForCategory = MainActivity.cityArraylist.get(position);

        categoryCityImage.setImageResource(cityForCategory.getmCityImageResourceId());


        categoryAttractivePlacesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CityCategoryScreen.this,AttactivePlacesActivity.class);
                intent.putExtra("CityForCategory", cityForCategory);
                startActivity(intent);
            }
        });

        categoryRestaurantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });


        categoryEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });




    }
}
