package com.example.hw_33_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCountry;
    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCountry=itemView.findViewById(R.id.rv_country);
    }
    void bind(String country){
        tvCountry.setText(country);

    }
}
