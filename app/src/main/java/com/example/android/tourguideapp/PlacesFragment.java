package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sites_list, container, false);

        //Create an arrayList of English tourSites
        final ArrayList<TourSite> tourSites = new ArrayList<TourSite>();

        tourSites.add(new TourSite(getString(R.string.places1), getString(R.string.places1descr), R.drawable.places1_1));
        tourSites.add(new TourSite(getString(R.string.places2), getString(R.string.places2descr), R.drawable.places2_1));
        tourSites.add(new TourSite(getString(R.string.places3), getString(R.string.places3descr), R.drawable.places3_1));
        tourSites.add(new TourSite(getString(R.string.places4), getString(R.string.places4descr), R.drawable.places4_1));
        tourSites.add(new TourSite(getString(R.string.places5), getString(R.string.places5descr), R.drawable.places5_1));
        tourSites.add(new TourSite(getString(R.string.places6), getString(R.string.places6descr), R.drawable.places6_1));
        tourSites.add(new TourSite(getString(R.string.places7), getString(R.string.places7descr), R.drawable.places7_1));
        tourSites.add(new TourSite(getString(R.string.places8), getString(R.string.places8descr), R.drawable.places8_1));
        tourSites.add(new TourSite(getString(R.string.places9), getString(R.string.places9descr), R.drawable.places9_1));

        TourSitesAdapter adapter = new TourSitesAdapter(getActivity(), tourSites, R.color.category_places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}