package com.example.reshimakeniot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GroseryAdapter extends RecyclerView.Adapter<GroseryAdapter.GroseryViewHolder> {

    String Item;
    public GroseryAdapter(String Item) {
        this.Item = Item;
    }

    @NonNull
    @Override
    public GroseryAdapter.GroseryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item, parent, false);
        return new GroseryViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroseryAdapter.GroseryViewHolder holder, int position) {
        holder.itemName.setText(position);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class GroseryViewHolder extends RecyclerView.ViewHolder {
        TextView itemName;
        public GroseryViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.singleItem);
        }
    }
}
