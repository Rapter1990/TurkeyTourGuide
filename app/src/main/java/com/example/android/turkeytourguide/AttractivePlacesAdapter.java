package com.example.android.turkeytourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 8.03.2017.
 */

public class AttractivePlacesAdapter extends ArrayAdapter<City> {

    private int mBackgroundColor; // BackGround Color For each Activity

    private int gridviewPosition;

    public AttractivePlacesAdapter(Context context, ArrayList<City> resources, int color,int position) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews , the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        // 0 -> list item layout resource ID
        super(context,0 ,resources);
        mBackgroundColor = color;
        gridviewPosition = position;
    }


    // get list item from getView

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listview = convertView;
        if (listview == null) {
            // parent -> listView   false -> we don't want to attach list item to parent
            listview = LayoutInflater.from(getContext()).inflate(R.layout.layout, parent, false);
        }

        // get position of item to city
        //City city = getItem(gridviewPosition);

        City city = MainActivity.cityArraylist.get(gridviewPosition);

            // City Information
            TextView name = (TextView) listview.findViewById(R.id.bilgi_text_view);
            name.setText(city.getAttactivePlaces().get(position).getPlaceName());


            // Picture of City
            ImageView image = (ImageView) listview.findViewById(R.id.image_image_view);

            // Check whether the picture is or not.
            if (city.hasImage()) {
                //
                image.setImageResource(city.getAttactivePlaces().get(position).getmAttaticePlaceImageResourceId());
            } else {
                image.setVisibility(View.GONE);
            }

        //}

        // Set theme color for the list item
        View textContainer = listview.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);

        // Set Background color to view
        textContainer.setBackgroundColor(color);

        return listview;

    }

}
