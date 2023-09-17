package com.example.overallrecyclerviewproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageview;
//   public TextView price;
public TextView name;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        imageview = itemView.findViewById(R.id.imageview);
//        price = itemView.findViewById(R.id.price);
        name = itemView.findViewById(R.id.name);
    }
}

