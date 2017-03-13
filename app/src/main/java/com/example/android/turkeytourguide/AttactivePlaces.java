package com.example.android.turkeytourguide;

/**
 * Created by user on 8.03.2017.
 */

public class AttactivePlaces {

    private static final int NO_IMAGE_PROVIDED= -1;

    private String placeName;  // Name for Place

    private String placeDetailInformation ; // Detailed information of place

    private int mAttaticePlaceImageResourceId = NO_IMAGE_PROVIDED; // place image

    public AttactivePlaces(){

    }


    public AttactivePlaces(String placeName, String placeDetailInformation, int mAttaticePlaceImageResourceId) {
        this.placeName = placeName;
        this.placeDetailInformation = placeDetailInformation;
        this.mAttaticePlaceImageResourceId = mAttaticePlaceImageResourceId;
    }


    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceDetailInformation() {
        return placeDetailInformation;
    }

    public void setPlaceDetailInformation(String placeDetailInformation) {
        this.placeDetailInformation = placeDetailInformation;
    }

    public int getmAttaticePlaceImageResourceId() {
        return mAttaticePlaceImageResourceId;
    }

    public void setmAttaticePlaceImageResourceId(int mAttaticePlaceImageResourceId) {
        this.mAttaticePlaceImageResourceId = mAttaticePlaceImageResourceId;
    }

    /**
     * Returns whether or not there is an image for each city.
     * @return
     */
    public boolean hasImage(){
        return  mAttaticePlaceImageResourceId != NO_IMAGE_PROVIDED;
    }


}
