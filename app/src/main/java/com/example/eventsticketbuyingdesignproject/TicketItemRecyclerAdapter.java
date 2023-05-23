package com.example.eventsticketbuyingdesignproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TicketItemRecyclerAdapter extends RecyclerView.Adapter<TicketsItemsViewHolder> {

    Context context;
    List<TicketEventItemModel> ticketsItemList;

    public TicketItemRecyclerAdapter(Context context, List<TicketEventItemModel> ticketsItemList) {
        this.context = context;
        this.ticketsItemList = ticketsItemList;
    }

    @NonNull
    @Override
    public TicketsItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TicketsItemsViewHolder(LayoutInflater.from(context).inflate(R.layout.single_event_tickets_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TicketsItemsViewHolder holder, int position) {

        TicketEventItemModel TicketItemListPosition = ticketsItemList.get(position);

        holder.ticketBanner.setImageResource(TicketItemListPosition.getTicketEventItemImageId());
        holder.ticketTitle.setText(TicketItemListPosition.getTicketEventTitle());
        holder.TicketTimeDuration.setText(TicketItemListPosition.getTicketEventItemTimeDuration());

    }

    @Override
    public int getItemCount() {
        return ticketsItemList.size();
    }
}
