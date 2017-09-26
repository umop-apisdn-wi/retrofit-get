package com.mapthread.mayo.Model;

/**
 * Created by cassada on 14/08/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by cassada on 02/08/17.
 */

public class PlaceResponse {


    @SerializedName("places")
    @Expose
    private List<place> places = null;

    public List<place> getPlaces() {
        return places;
    }

    public void setPlaces(List<place> places) {
        this.places = places;
    }

}