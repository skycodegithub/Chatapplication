package com.example.mainactivity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView msg;
    private LinearLayout main;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        msg = itemView.findViewById(R.id.message);
        main = itemView.findViewById(R.id.mainMessageLayout);
    }
}
