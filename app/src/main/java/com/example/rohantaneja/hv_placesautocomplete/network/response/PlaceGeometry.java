package com.example.rohantaneja.hv_placesautocomplete.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlaceGeometry {

    @SerializedName("location")
    @Expose
    private PlaceLocation location;

    public PlaceLocation getLocation() {
        return location;
    }

}
