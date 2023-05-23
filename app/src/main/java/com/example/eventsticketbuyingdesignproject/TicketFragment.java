package com.example.eventsticketbuyingdesignproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class TicketFragment extends Fragment {



    public TicketFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView ticketsRecyclerView;

        List<TicketEventItemModel> ticketsDemoDataList = new ArrayList<>();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ticket, container, false);

        ticketsDemoDataList.add(new TicketEventItemModel(R.drawable.astronaut,"Astronaut","23 - 27 Jun, 2021"));
        ticketsDemoDataList.add(new TicketEventItemModel(R.drawable.no_anunciar,"No Anunciar","23 - 27 Jun, 2021"));
        ticketsDemoDataList.add(new TicketEventItemModel(R.drawable.astronaut,"Astronaut1","23 - 27 Jun, 2021"));
        ticketsDemoDataList.add(new TicketEventItemModel(R.drawable.no_anunciar,"No Anunciar1","23 - 27 Jun, 2021"));
        ticketsDemoDataList.add(new TicketEventItemModel(R.drawable.astronaut,"Astronaut2","23 - 27 Jun, 2021"));
        ticketsDemoDataList.add(new TicketEventItemModel(R.drawable.no_anunciar,"No Anunciar2","23 - 27 Jun, 2021"));

        ticketsRecyclerView = view.findViewById(R.id.TicketsRecyclerView);
        ticketsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ticketsRecyclerView.setAdapter(new TicketItemRecyclerAdapter(getContext(), ticketsDemoDataList));


        return view;
    }
}