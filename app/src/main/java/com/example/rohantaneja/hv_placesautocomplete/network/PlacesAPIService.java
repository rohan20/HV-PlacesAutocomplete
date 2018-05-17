package com.example.rohantaneja.hv_placesautocomplete.network;

import com.example.rohantaneja.hv_placesautocomplete.network.response.PlaceBaseResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PlacesAPIService {

    @GET("/{format}/")
    Call<PlaceBaseResponse> getPlaceSuggestions(
            @Path("format") String format,
            @Query("query") String query,
            @Query("key") String apiKey);

}
