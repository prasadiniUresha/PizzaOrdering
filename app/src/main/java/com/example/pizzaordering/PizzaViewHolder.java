package com.example.pizzaordering;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PizzaViewHolder extends RecyclerView.ViewHolder {
    public LinearLayout linearLayout;
    public TextView textView;


    public PizzaViewHolder(@NonNull View itemView) {
        super(itemView);
        linearLayout=itemView.findViewById(R.id.listItem);
        textView=itemView.findViewById(R.id.textView);
    }
}