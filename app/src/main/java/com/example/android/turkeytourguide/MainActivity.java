package com.example.android.turkeytourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<City> cityArraylist = new ArrayList<City>();
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        City istanbul = new City();

        istanbul.setCityName("İstanbul");
        istanbul.setmCityImageResourceId(R.drawable.istanbul);

        AttactivePlaces istanbulAttactivePlaces_one =new AttactivePlaces();
        istanbulAttactivePlaces_one.setPlaceName("Galata Tower");
        istanbulAttactivePlaces_one.setmAttaticePlaceImageResourceId(R.drawable.galata);
        istanbulAttactivePlaces_one.setPlaceDetailInformation("Galata Tower is one of the wonderful tourist places in Beyoğlu,İstanbul");
        istanbul.getAttactivePlaces().add(istanbulAttactivePlaces_one);

        AttactivePlaces istanbulAttactivePlaces_two =new AttactivePlaces();
        istanbulAttactivePlaces_two.setPlaceName("Topkapı Palace");
        istanbulAttactivePlaces_two.setmAttaticePlaceImageResourceId(R.drawable.topkapi);
        istanbulAttactivePlaces_two.setPlaceDetailInformation("Topkapı Palace is one of the wonderful tourist places in Fatih,İstanbul");
        istanbul.getAttactivePlaces().add(istanbulAttactivePlaces_two);


        City antalya = new City();
        antalya.setCityName("Antalya");
        antalya.setmCityImageResourceId(R.drawable.antalya);

        AttactivePlaces antalyaAttactivePlaces_one = new AttactivePlaces();
        antalyaAttactivePlaces_one.setPlaceName("Aspendus");
        antalyaAttactivePlaces_one.setmAttaticePlaceImageResourceId(R.drawable.galata);
        antalyaAttactivePlaces_one.setPlaceDetailInformation("Antalya");
        antalya.getAttactivePlaces().add(antalyaAttactivePlaces_one);

        cityArraylist.add(istanbul);
        cityArraylist.add(antalya);

        /*cityArraylist.add(new City(R.drawable.istanbul,"İstanbul"));
        cityArraylist.add(new City(R.drawable.antalya,"Antalya"));
        cityArraylist.add(new City(R.drawable.antalya,"c"));
        cityArraylist.add(new City(R.drawable.antalya,"d"));
        cityArraylist.add(new City(R.drawable.antalya,"a"));
        cityArraylist.add(new City(R.drawable.antalya,"b"));
        cityArraylist.add(new City(R.drawable.antalya,"c"));
        cityArraylist.add(new City(R.drawable.antalya,"d"));
        cityArraylist.add(new City(R.drawable.antalya,"a"));
        cityArraylist.add(new City(R.drawable.antalya,"b"));
        cityArraylist.add(new City(R.drawable.antalya,"c"));
        cityArraylist.add(new City(R.drawable.antalya,"d"));*/




        CityAdapter cityAdapter = new CityAdapter(this,cityArraylist,R.color.mainBackground);

        GridView gridView = (GridView) findViewById(R.id.gridlist);
        gridView.setAdapter(cityAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                   switch (position){

                   case 0:
                        //Toast.makeText(getApplicationContext(),"İstanbul",Toast.LENGTH_SHORT).show();
                        Toast.makeText(getApplicationContext(),position+"",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,AttactivePlacesActivity.class);
                        intent.putExtra("position",position);
                        startActivity(intent);
                        break;

                    case 1:
                        //Toast.makeText(getApplicationContext(),"Antalya",Toast.LENGTH_SHORT).show();
                        Toast.makeText(getApplicationContext(),position+"",Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(MainActivity.this,AttactivePlacesActivity.class);
                        intent1.putExtra("position",position);
                        startActivity(intent1);
                        break;

                    case 2:
                        Toast.makeText(getApplicationContext(),"İzmir",Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Toast.makeText(getApplicationContext(),"Çanakkale",Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });





    }



}
