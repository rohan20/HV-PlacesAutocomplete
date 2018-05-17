package com.example.rohantaneja.hv_placesautocomplete.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rohantaneja.hv_placesautocomplete.R;
import com.example.rohantaneja.hv_placesautocomplete.interfaces.SuggestionClickListener;
import com.example.rohantaneja.hv_placesautocomplete.network.response.PlaceDetails;

public class SuggestionsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView placeNameTextView;
    private SuggestionClickListener mListener;
    private PlaceDetails mPlace;

    public SuggestionsViewHolder(View itemView, SuggestionClickListener listener) {
        super(itemView);
        itemView.setOnClickListener(this);

        placeNameTextView = itemView.findViewById(R.id.place_name_text_view);
        mListener = listener;
    }

    public void bindData(PlaceDetails place) {
        mPlace = place;
        placeNameTextView.setText(place.getName());
    }

    @Override
    public void onClick(View v) {
        mListener.onSuggestionClicked(mPlace);
    }
}
