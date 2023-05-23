package com.example.eventsticketbuyingdesignproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

public class UpcomingEventViewHolder extends RecyclerView.ViewHolder {

    ShapeableImageView UpcomingEventImageView;
    TextView UpcomingEventTitle;

    public UpcomingEventViewHolder(@NonNull View itemView) {
        super(itemView);
        UpcomingEventImageView = itemView.findViewById(R.id.UpcomingEventImage);
        UpcomingEventTitle = itemView.findViewById(R.id.UpcomingEventTitle);


    }
}
