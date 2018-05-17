package com.example.rohantaneja.hv_placesautocomplete.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAdapter {

    private PlacesAPIService apiService;

    public RetrofitAdapter(String baseURL) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(PlacesAPIService.class);
    }

    public PlacesAPIService getPlacesApi() {
        return apiService;
    }

}
