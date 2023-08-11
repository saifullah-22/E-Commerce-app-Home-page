package com.example.overallrecyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("USA",R.drawable.p1));
        items.add(new Item("Canada", R.drawable.p2));
        items.add(new Item("Australia", R.drawable.p3));
        items.add(new Item("Brazil", R.drawable.p4));
        items.add(new Item("Chile", R.drawable.p5));
        items.add(new Item("Armenia", R.drawable.p6));
        items.add(new Item("China", R.drawable.p7));
        items.add(new Item("Belgium", R.drawable.p8));
        items.add(new Item("Egypt", R.drawable.p9));
        items.add(new Item("Pakistan", R.drawable.p10));
        items.add(new Item("India", R.drawable.p11));
        items.add(new Item("Itlay", R.drawable.p12));
        items.add(new Item("Libya", R.drawable.p13));
        items.add(new Item("Kuwait", R.drawable.p14));
        items.add(new Item("France", R.drawable.p15));
        items.add(new Item("Greece", R.drawable.p16));
        items.add(new Item("Germany", R.drawable.p17));
        items.add(new Item("Iceland", R.drawable.p18));
        items.add(new Item("Japan", R.drawable.p19));
        items.add(new Item("Maldives", R.drawable.p20));

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));   //use this line when you don't use gridview

        ///below 2 lines use for gridview
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(new com.example.recyclerviewlistview.MyAdapter(getApplicationContext(),items));




    }
}