package com.example.elements.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.elements.R;
import com.example.elements.models.ServicesModel;

import java.util.ArrayList;

public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.MyViewHolder> {
    Context context;
    ArrayList<ServicesModel> servicesModels;

    public ServicesAdapter(Context context, ArrayList<ServicesModel> servicesModels){
        this.context = context;
        // Check for null and handle it
        if (servicesModels == null) {
            this.servicesModels = new ArrayList<>();
        } else {
            this.servicesModels = servicesModels;
        }
    }

    @NonNull
    @Override
    public ServicesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflating the recyclerview
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new ServicesAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServicesAdapter.MyViewHolder holder, int position) {
        // assigning values to the views created in recycler_view_row layout file
        holder.textView1.setText(servicesModels.get(position).getServiceName1());
        holder.textView2.setText(servicesModels.get(position).getServiceName2());
        holder.textView3.setText(servicesModels.get(position).getServiceName3());
        holder.imageView1.setImageResource(servicesModels.get(position).getImage1());
        holder.imageView2.setImageResource(servicesModels.get(position).getImage2());
        holder.imageView3.setImageResource(servicesModels.get(position).getImage3());
    }

    @Override
    public int getItemCount() {
        // enabling the recyclerview to know the number of items to display
        return servicesModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // grab the views from the recyclerview
        ImageView imageView1;
        ImageView imageView2;
        ImageView imageView3;
        TextView textView1;
        TextView textView2;
        TextView textView3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView1 = itemView.findViewById(R.id.imageView1);
            imageView2 = itemView.findViewById(R.id.imageView2);
            imageView3 = itemView.findViewById(R.id.imageView3);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
        }
    }
}
