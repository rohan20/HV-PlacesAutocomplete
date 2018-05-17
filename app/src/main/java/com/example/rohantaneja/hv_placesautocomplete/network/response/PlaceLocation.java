package com.example.rohantaneja.hv_placesautocomplete.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlaceLocation {

    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;

    public Double getLat() {
        return lat;
    }

    public Double getLng() {
        return lng;
    }
}
