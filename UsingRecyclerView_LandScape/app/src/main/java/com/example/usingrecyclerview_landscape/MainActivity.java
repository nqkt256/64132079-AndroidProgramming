package com.example.usingrecyclerview_landscape;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        recyclerViewDatas = getDataForRecyclerView();
        //
        recyclerViewLandscape = findViewById(R.id.recyclerLand);
        //
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);
        //
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        //
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("great_ocean_road", "Great Ocean Road");
        dsDuLieu.add(landScape1);
        dsDuLieu.add( new LandScape("kangaroos", "Kangaroos"));
        dsDuLieu.add( new LandScape("katherine_gorge_nitmiluk_national_park", "Katherine Gorge Nitmiluk National Park"));
        dsDuLieu.add( new LandScape("lake_hillier_middle_island", "Lake Hillier Middle Island"));
        dsDuLieu.add( new LandScape("mount_buffalo", "Mount Buffalo Australian"));
        dsDuLieu.add( new LandScape("rainforest_in_daintree_national_park", "Rainforest in Daintree National Park Queensland Australia"));
        dsDuLieu.add( new LandScape("the_jim_jim_falls_in_kakadu_national_park", "The Jim Jim Falls in Kakadu National Park "));
        dsDuLieu.add( new LandScape("twelve_apostles_great_ocean_road", "Twelve Apostles Great Ocean Road Victoria Australia"));
        dsDuLieu.add( new LandScape("uluru_ayers_rock_northern_territory", "Uluru Ayers Rock Northern Territory Australia"));
        dsDuLieu.add( new LandScape("whitehaven_beach_hamilton_island_whitsundays", "Whitehaven Beach Hamilton Island Whitsundays"));
        return dsDuLieu;
    }
}