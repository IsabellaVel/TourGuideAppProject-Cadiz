package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by WWW on 07/05/2017.
 */

public class TourSitesAdapter2 extends ArrayAdapter<TourSite> {

    private static final String SITE = TourSitesAdapter2.class.getSimpleName();
    private int mColorResourceId;

    public TourSitesAdapter2(Activity context, ArrayList<TourSite> tourSites, int colorResourceId) {
        super(context, 0, tourSites);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item2, parent, false);
        }

        TourSite currentTourSite = getItem(position);
        TextView tvText = (TextView) listItemView.findViewById(R.id.tv_text);
        tvText.setText(currentTourSite.gettText());

        TextView tvDescr = (TextView) listItemView.findViewById(R.id.tv_description);
        tvDescr.setText(currentTourSite.gettDescription());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

