package com.example.eventsticketbuyingdesignproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;

public class TicketsItemsViewHolder extends RecyclerView.ViewHolder {
    ShapeableImageView ticketBanner;
    TextView ticketTitle, TicketTimeDuration;
    public TicketsItemsViewHolder(@NonNull View itemView) {
        super(itemView);

        ticketBanner = itemView.findViewById(R.id.TicketsBannerImageView);
        ticketTitle = itemView.findViewById(R.id.TicketTitleTextView);
        TicketTimeDuration = itemView.findViewById(R.id.TicketsEventsDetailsTimeTextView);
    }
}
