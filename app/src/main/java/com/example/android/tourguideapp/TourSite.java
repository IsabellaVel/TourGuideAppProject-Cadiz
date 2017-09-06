package com.example.android.tourguideapp;

/**
 * Created by WWW on 07/05/2017.
 */

public class TourSite {
    private String tText;
    private String tDescription;
    private int mImageResourceID;

    public TourSite(String siteDescription, String backgroundDetails, int imageResourceID) {
        tText = siteDescription;
        tDescription = backgroundDetails;
        mImageResourceID = imageResourceID;
    }

    public TourSite(String siteDescription, String backgroundDetails) {
        tText = siteDescription;
        tDescription = backgroundDetails;
    }

    public String gettText() {
        return tText;
    }

    public String gettDescription() {
        return tDescription;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    }
