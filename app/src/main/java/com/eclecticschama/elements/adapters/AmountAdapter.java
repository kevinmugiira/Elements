package com.eclecticschama.elements.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eclecticschama.elements.R;

public class AmountAdapter extends RecyclerView.Adapter<AmountAdapter.MyViewHolder>{

    Context context;
    


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // grab the views from the recyclerview

        TextView title;
        TextView defaulted;
        TextView dueDate;
        TextView penaltyAmount;
        TextView amountDue;
        Button buttonName;
        TextView amount;
//        ImageView imageView1;
//        ImageView imageView2;
//        ImageView imageView3;
//        TextView textView1;
//        TextView textView2;
//        TextView textView3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.text_view_eclectics_chama);
            defaulted = itemView.findViewById(R.id.text_view_defaulted);
            dueDate = itemView.findViewById(R.id.text_view_due_date);
            penaltyAmount = itemView.findViewById(R.id.text_view_penalty_amount);
            amountDue = itemView.findViewById(R.id.text_view_amount);
//            buttonName = itemView.findViewById(R.id.table_row_button_pay);
            amount = itemView.findViewById(R.id.text_view_ksh);

//            imageView1 = itemView.findViewById(R.id.imageView1);
//            imageView2 = itemView.findViewById(R.id.imageView2);
//            imageView3 = itemView.findViewById(R.id.imageView3);
//            textView1 = itemView.findViewById(R.id.textView1);
//            textView2 = itemView.findViewById(R.id.textView2);
//            textView3 = itemView.findViewById(R.id.textView3);
        }
    }
}
