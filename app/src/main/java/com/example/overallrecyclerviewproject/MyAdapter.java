package com.example.recyclerviewlistview;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.overallrecyclerviewproject.Fragment1;
import com.example.overallrecyclerviewproject.Item;
import com.example.overallrecyclerviewproject.MyViewHolder;
import com.example.overallrecyclerviewproject.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder,  int position) {
        holder.name.setText(items.get(position).getName());
        holder.imageview.setImageResource(items.get(position).getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(holder.getAdapterPosition() ==0){
                    ((FragmentActivity)context).getSupportFragmentManager().beginTransaction()
                            .replace(R.id.con, new Fragment1()).commit();
                }
                else if(holder.getAdapterPosition() ==1){
                    ((FragmentActivity)context).getSupportFragmentManager().beginTransaction()
                            .replace(R.id.con, new Fragment1()).commit();
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
