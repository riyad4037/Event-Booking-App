package com.example.eventsticketbuyingdesignproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UpcomingEventRecyclerAdapter extends RecyclerView.Adapter<UpcomingEventViewHolder> {

    Context context;
    List<UpcomingEventItemModel> upcomingEventRecyclerList;

    public UpcomingEventRecyclerAdapter(Context context, List<UpcomingEventItemModel> upcomingEventRecyclerList) {
        this.context = context;
        this.upcomingEventRecyclerList = upcomingEventRecyclerList;
    }

    @NonNull
    @Override
    public UpcomingEventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UpcomingEventViewHolder(LayoutInflater.from(context).inflate(R.layout.upcoming_event_item_design, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UpcomingEventViewHolder holder, int position) {

        UpcomingEventItemModel upcomingItems = upcomingEventRecyclerList.get(position);

        holder.UpcomingEventImageView.setImageResource(upcomingItems.getUpcomingEventImageId());
        holder.UpcomingEventTitle.setText(upcomingItems.getTitle());
    }

    @Override
    public int getItemCount() {
        return upcomingEventRecyclerList.size();
    }
}
