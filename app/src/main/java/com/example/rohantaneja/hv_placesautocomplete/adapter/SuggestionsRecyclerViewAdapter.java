package com.example.rohantaneja.hv_placesautocomplete.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rohantaneja.hv_placesautocomplete.R;
import com.example.rohantaneja.hv_placesautocomplete.adapter.viewholder.SuggestionsViewHolder;
import com.example.rohantaneja.hv_placesautocomplete.network.response.PlaceDetails;

import java.util.ArrayList;
import java.util.List;

public class SuggestionsRecyclerViewAdapter extends RecyclerView.Adapter<SuggestionsViewHolder> {

    private Context mContext;
    private List<PlaceDetails> mPlaceDetailsList;

    public SuggestionsRecyclerViewAdapter(Context context) {
        mContext = context;
        mPlaceDetailsList = new ArrayList<>();
    }

    public void updateList(List<PlaceDetails> itemsList) {
        mPlaceDetailsList = itemsList;
        notifyDataSetChanged();
    }

    @Override
    public SuggestionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place_suggestion, parent, false);
        return new SuggestionsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SuggestionsViewHolder holder, int position) {
        PlaceDetails place = mPlaceDetailsList.get(position);
        holder.bindData(place);
    }

    @Override
    public int getItemCount() {
        return mPlaceDetailsList == null ? 0 : mPlaceDetailsList.size();
    }
}