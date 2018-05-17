package com.example.rohantaneja.hv_placesautocomplete.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlacePhoto {

    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("html_attributions")
    @Expose
    private List<String> htmlAttributions;
    @SerializedName("photo_reference")
    @Expose
    private String photoReference;
    @SerializedName("width")
    @Expose
    private Integer width;

    public Integer getHeight() {
        return height;
    }

    public List<String> getHtmlAttributions() {
        return htmlAttributions;
    }

    public String getPhotoReference() {
        return photoReference;
    }

    public Integer getWidth() {
        return width;
    }

}
