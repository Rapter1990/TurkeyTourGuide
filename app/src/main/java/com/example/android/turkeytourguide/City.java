package com.example.android.turkeytourguide;

import java.util.ArrayList;

/**
 * Created by user on 7.03.2017.
 */

public class City {

    private static final int NO_IMAGE_PROVIDED= -1; // out of range all possible valid resource ID

    // City Image
    private int mCityImageResourceId = NO_IMAGE_PROVIDED;

    // Name for attractive places,restaurants and events
    private String cityName;

    ArrayList<AttactivePlaces> attactivePlaces = new ArrayList<AttactivePlaces>();

    public City(){

    }

    public City(int mCityImageResourceId, String cityName) {
        this.mCityImageResourceId = mCityImageResourceId;
        this.cityName = cityName;
    }

    public int getmCityImageResourceId() {
        return mCityImageResourceId;
    }

    public void setmCityImageResourceId(int mCityImageResourceId) {
        this.mCityImageResourceId = mCityImageResourceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * Returns whether or not there is an image for each city.
     * @return
     */
    public boolean hasImage(){
        return  mCityImageResourceId != NO_IMAGE_PROVIDED;
    }

    public ArrayList<AttactivePlaces> getAttactivePlaces() {
        return attactivePlaces;
    }

    public void setAttactivePlaces(ArrayList<AttactivePlaces> attactivePlaces) {
        this.attactivePlaces = attactivePlaces;
    }
}
