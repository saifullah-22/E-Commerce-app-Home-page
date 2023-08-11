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

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Button btn;

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;

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
            Toast.makeText(this, "My Order Selected", Toast.LENGTH_SHORT).show();}
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