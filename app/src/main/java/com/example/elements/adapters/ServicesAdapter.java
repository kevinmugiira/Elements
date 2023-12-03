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
        this.servicesModels = servicesModels;
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
        holder.myTextView1.setText(servicesModels.get(position).getServiceName());
        holder.myTextView2.setText(servicesModels.get(position).getServiceName());
        holder.myTextView3.setText(servicesModels.get(position).getServiceName());
        holder.myImage1.setImageResource(servicesModels.get(position).getImage());
        holder.myImage2.setImageResource(servicesModels.get(position).getImage());
        holder.myImage3.setImageResource(servicesModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        // enabling the recyclerview to know the number of items to display
        return servicesModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // grab the views from the recyclerview
        ImageView myImage1;
        ImageView myImage2;
        ImageView myImage3;
        TextView myTextView1;
        TextView myTextView2;
        TextView myTextView3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myImage1 = itemView.findViewById(R.id.imageView1);
            myImage2 = itemView.findViewById(R.id.imageView2);
            myImage3 = itemView.findViewById(R.id.imageView3);
            myTextView1 = itemView.findViewById(R.id.textView1);
            myTextView2 = itemView.findViewById(R.id.textView2);
            myTextView3 = itemView.findViewById(R.id.textView3);
        }
    }
}
