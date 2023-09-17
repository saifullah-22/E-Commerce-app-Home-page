package com.example.overallrecyclerviewproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {



    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RecyclerView recyclerView = findViewById(R.id.rv);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("SUAVAGE",R.drawable.per1));
        items.add(new Item("POCKET PERFUMES", R.drawable.pf1));
        items.add(new Item("ATTAR", R.drawable.at1));
        items.add(new Item("BURBERRY", R.drawable.d1));
        items.add(new Item("KID'S WEAR",R.drawable.p2a));
        items.add(new Item("WOMEN'S WEAR",R.drawable.w2));
        items.add(new Item("MEN'S WEAR",R.drawable.m4));
        items.add(new Item("JACKETS",R.drawable.j1));
        items.add(new Item("MEN'S WESTERN WEAR",R.drawable.s5));
        items.add(new Item("BRACELETS",R.drawable.t2));
        items.add(new Item("NECKLACES",R.drawable.n5));
        items.add(new Item("RINGS",R.drawable.r1));
        items.add(new Item("HAIR CLAWS",R.drawable.h1));
        items.add(new Item("EARINGS",R.drawable.e4));
        items.add(new Item("VOILIN",R.drawable.v2));
        items.add(new Item("DRUMS",R.drawable.d1));
        items.add(new Item("FLUTE",R.drawable.f2));
        items.add(new Item("PIANO",R.drawable.p1));
        items.add(new Item("GUITAR",R.drawable.g1));
        items.add(new Item("SMART WATCHES",R.drawable.a3));
        items.add(new Item("MEN'S WATCHES",R.drawable.ww4));
        items.add(new Item("WOMEN'S WATCHES",R.drawable.ww2));




//        recyclerView.setLayoutManager(new LinearLayoutManager(this));   //use this line when you don't use gridview

        ///below 2 lines use for gridview
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(new com.example.recyclerviewlistview.MyAdapter(getApplicationContext(),items,MainActivity.this));




        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.inflateMenu(R.menu.nav_menu);

        navigationView.setNavigationItemSelectedListener(this);




    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();


        if (id == R.id.nev_home) {
            Toast.makeText(this, "Home Selected", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.myOrder) {
            Toast.makeText(this, "My Order Selected", Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(myIntent);}
        else if (id == R.id.myCoupons) {
            Toast.makeText(this, "My Coupons Selected", Toast.LENGTH_SHORT).show();}
        else if (id == R.id.myWishlist) {
            Toast.makeText(this, "My Wishlist Selected", Toast.LENGTH_SHORT).show();}
        else if (id == R.id.myAccount) {
            Toast.makeText(this, "My Account Selected", Toast.LENGTH_SHORT).show();}
        else if (id == R.id.logout) {
            Toast.makeText(this, "Logout Selected", Toast.LENGTH_SHORT).show();}


        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);



    }
}