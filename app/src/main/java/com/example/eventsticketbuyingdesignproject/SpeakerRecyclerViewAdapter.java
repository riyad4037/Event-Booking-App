package com.example.eventsticketbuyingdesignproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SpeakerRecyclerViewAdapter extends RecyclerView.Adapter<SpeakerRecyclerViewHolderClass> {

    Context context;
    List<SpeakersItemModel> speakersList;

    public SpeakerRecyclerViewAdapter(Context context, List<SpeakersItemModel> speakersList) {
        this.context = context;
        this.speakersList = speakersList;
    }

    @NonNull
    @Override
    public SpeakerRecyclerViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SpeakerRecyclerViewHolderClass(LayoutInflater.from(context).inflate(R.layout.event_speaker_single_item_veiw,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SpeakerRecyclerViewHolderClass holder, int position) {

        SpeakersItemModel speakersItemModel = speakersList.get(position);

        holder.speakerImageView.setImageResource(speakersItemModel.getSpeakerImageResourceId());
        holder.speakerTextView.setText(speakersItemModel.getSpeakerNickName());

    }

    @Override
    public int getItemCount() {
        return speakersList.size();
    }
}
