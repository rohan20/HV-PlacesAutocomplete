package com.example.rohantaneja.hv_placesautocomplete.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlaceBaseResponse {

    @SerializedName("html_attributions")
    @Expose
    private List<Object> htmlAttributions;
    @SerializedName("results")
    @Expose
    private List<PlaceDetails> placeDetails;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Object> getHtmlAttributions() {
        return htmlAttributions;
    }

    public List<PlaceDetails> getPlaceDetails() {
        return placeDetails;
    }

    public String getStatus() {
        return status;
    }

}
