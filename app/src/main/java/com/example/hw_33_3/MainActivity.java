package com.example.hw_33_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> countryList;
    private CountryAdapter adapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_country);
        loadData();
        adapter=new CountryAdapter(countryList);
        recyclerView.setAdapter(adapter);


    }

    private void loadData() {
        countryList=new ArrayList<>();
        countryList.add("Kyrgyzstan");
        countryList.add("Kazakhstan");
        countryList.add("Turkey");
        countryList.add("Thailand");
        countryList.add("Kanada");
        countryList.add("Uzbekistan");
        countryList.add("Russia");
        countryList.add("Amerika");
        countryList.add("Meksika");
        countryList.add("Austriya");
        countryList.add("Ukraine");
        countryList.add("Vengry");
        countryList.add("Germany");
        countryList.add("Italiy");
        countryList.add("Tadjikistan");
    }
}