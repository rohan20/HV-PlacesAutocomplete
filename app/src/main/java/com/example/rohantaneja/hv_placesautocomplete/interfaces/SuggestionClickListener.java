package com.example.rohantaneja.hv_placesautocomplete.interfaces;

import com.example.rohantaneja.hv_placesautocomplete.network.response.PlaceDetails;

public interface SuggestionClickListener {

    void onSuggestionClicked(PlaceDetails place);
}
