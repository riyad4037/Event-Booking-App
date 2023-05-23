package com.example.eventsticketbuyingdesignproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PopularEventRecyclerAdapter extends RecyclerView.Adapter<PopularEventViewHolder> {

    Context context;
    List<PopularEventItemModel> popularEventItemList;

    public PopularEventRecyclerAdapter(Context context, List<PopularEventItemModel> popularEventItemList) {
        this.context = context;
        this.popularEventItemList = popularEventItemList;
    }

    @NonNull
    @Override
    public PopularEventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.popular_today_event_item_design,parent, false);
        return new PopularEventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularEventViewHolder holder, int position) {

        final PopularEventItemModel PopularItemModel = popularEventItemList.get(position);
        System.out.println(PopularItemModel);


        holder.popularEventImageView.setImageResource(PopularItemModel.getPopularEventItemImageId());
        holder.popularEventTitle.setText(PopularItemModel.getPopularEventTitle());
        holder.popularEventTimeDuration.setText(PopularItemModel.getPopularEventItemTimeDuration());

        holder.popularEventWholeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, EventDetailsActivity.class);
                intent.putExtra("ImageId", PopularItemModel.getPopularEventItemImageId());
                intent.putExtra("Title", PopularItemModel.getPopularEventTitle());
                intent.putExtra("TimeDuration", PopularItemModel.getPopularEventItemTimeDuration());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return popularEventItemList.size();
    }
}
