package com.example.eventsticketbuyingdesignproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

public class SpeakerRecyclerViewHolderClass extends RecyclerView.ViewHolder {
    ShapeableImageView speakerImageView;
    TextView speakerTextView;

    public SpeakerRecyclerViewHolderClass(@NonNull View itemView) {
        super(itemView);

        speakerImageView = itemView.findViewById(R.id.SpeakerImageView);
        speakerTextView = itemView.findViewById(R.id.SpeakersNickName);
    }
}
