package com.mapthread.mayo.Adapter;

/**
 * Created by cassada on 14/08/17.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mapthread.mayo.Model.place;
import com.mapthread.mayo.R;

import java.util.List;

/**
 * Created by cassada on 04/08/17.
 */

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {

    private List<place> places;
    private int rowLayout;
    private Context context;




    public static class PlaceViewHolder extends RecyclerView.ViewHolder {
        LinearLayout placeLayout;
        TextView city;
        TextView lat;
        TextView lng;
        TextView needle;


        public PlaceViewHolder(View v) {
            super(v);
            placeLayout = (LinearLayout) v.findViewById(R.id.Place_layout);
            city = (TextView) v.findViewById(R.id.city);
            lat = (TextView) v.findViewById(R.id.lat);
            lng = (TextView) v.findViewById(R.id.lng);
            needle = (TextView) v.findViewById(R.id.needle);
        }
    }

    public PlaceAdapter(List<place> places, int rowLayout, Context context) {
        this.places = places;
        this.rowLayout = rowLayout;
        this.context = context;
    }


    @Override
    public PlaceAdapter.PlaceViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new PlaceViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PlaceViewHolder holder, int position) {
        holder.city.setText(places.get(position).getCity());
        holder.lat.setText(places.get(position).getLat().toString());
        holder.lng.setText(places.get(position).getLng().toString());
        holder.needle.setText(places.get(position).getNeedle().toString());
    }



    @Override
    public int getItemCount() {
        return places.size();
    }

}