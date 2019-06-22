package com.example.pizzaordering;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class PizzaListAdapter extends RecyclerView.Adapter<PizzaViewHolder> {
    private String pizzaDetails[] = {"pizza one", "pizza two", "pizza three"};


    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        PizzaViewHolder vh = new PizzaViewHolder(listItem);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaViewHolder pizzaViewHolder, int i) {
        pizzaViewHolder.textView.setText(pizzaDetails[i]);

    }



    @Override
    public int getItemCount() {
        return pizzaDetails.length;
    }
}
