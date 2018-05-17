package com.example.rohantaneja.hv_placesautocomplete.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import com.example.rohantaneja.hv_placesautocomplete.R;
import com.example.rohantaneja.hv_placesautocomplete.network.RetrofitAdapter;
import com.example.rohantaneja.hv_placesautocomplete.network.response.PlaceBaseResponse;
import com.example.rohantaneja.hv_placesautocomplete.util.Constants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    public static final String TAG = MainActivity.class.getName();

    private EditText mSearchEditText;
    private RecyclerView mSuggestionsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        mSearchEditText = findViewById(R.id.search_edit_text);
        mSearchEditText.addTextChangedListener(this);

        mSuggestionsRecyclerView = findViewById(R.id.suggestions_recycler_view);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        if (!editable.toString().isEmpty()) {
            getPlacesFromApi(editable.toString());
        }
    }

    private void getPlacesFromApi(String query) {
        RetrofitAdapter retrofitAdapter = new RetrofitAdapter(Constants.BASE_URL);
        Call<PlaceBaseResponse> apiCall = retrofitAdapter.getPlacesApi().getPlaceSuggestions(
                Constants.RESULTS_FORMAT.JSON,
                query,
                Constants.API_KEY
        );

        apiCall.enqueue(new Callback<PlaceBaseResponse>() {
            @Override
            public void onResponse(Call<PlaceBaseResponse> call, Response<PlaceBaseResponse> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        if (response.body().getPlaceDetails() != null && !response.body().getPlaceDetails().isEmpty()) {
                            Log.i(TAG, response.body().getPlaceDetails().get(0).getName());
                            Log.i(TAG, response.body().getPlaceDetails().get(0).getPlaceId());
                            Log.i(TAG, response.body().getPlaceDetails().get(0).getIcon());
                        }
                    } else {
                        Log.i(TAG, "response.body() is null: " + response.message());
                    }
                } else {
                    Log.i(TAG, "response is null");
                }
            }

            @Override
            public void onFailure(Call<PlaceBaseResponse> call, Throwable t) {
                Log.i(TAG, "onFail(): " + t.getMessage());
            }
        });
    }
}
