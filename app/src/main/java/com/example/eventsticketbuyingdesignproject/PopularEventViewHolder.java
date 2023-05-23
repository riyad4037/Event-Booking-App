package com.example.eventsticketbuyingdesignproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class PopularEventViewHolder extends RecyclerView.ViewHolder {

    ImageView popularEventImageView;
    TextView popularEventTitle, popularEventTimeDuration;

    ConstraintLayout popularEventWholeView;


    public PopularEventViewHolder(@NonNull View itemView) {
        super(itemView);

        popularEventImageView = itemView.findViewById(R.id.PopularItemImageView);
        popularEventTitle = itemView.findViewById(R.id.PopularItemTitle);
        popularEventTimeDuration = itemView.findViewById(R.id.PopularItemTimeDuration);

        popularEventWholeView = itemView.findViewById(R.id.PopularEventSingleView);
    }
}
