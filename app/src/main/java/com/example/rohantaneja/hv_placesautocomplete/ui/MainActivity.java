package com.example.rohantaneja.hv_placesautocomplete.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.rohantaneja.hv_placesautocomplete.R;

public class MainActivity extends AppCompatActivity implements TextWatcher {

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
    public void afterTextChanged(Editable s) {

    }
}
