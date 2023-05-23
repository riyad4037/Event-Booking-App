package com.example.eventsticketbuyingdesignproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView upcomingEventRecyclerListView, popularEventRecyclerView;
        List<UpcomingEventItemModel> upcomingItemList = new ArrayList<>();

        List<PopularEventItemModel> popularItemList = new ArrayList<>();


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        upcomingEventRecyclerListView = view.findViewById(R.id.UpComingEventRecyclerView);

        popularEventRecyclerView = view.findViewById(R.id.PopularEventRecyclerView);


        upcomingItemList.add(new UpcomingEventItemModel(R.drawable.no_anunciar,"No Anunciar"));
        upcomingItemList.add(new UpcomingEventItemModel(R.drawable.astronaut,"Astronaut"));
        upcomingItemList.add(new UpcomingEventItemModel(R.drawable.no_anunciar,"No Anunciar 1"));
        upcomingItemList.add(new UpcomingEventItemModel(R.drawable.astronaut,"Astronaut 1"));
        upcomingItemList.add(new UpcomingEventItemModel(R.drawable.no_anunciar,"No Anunciar 2"));
        upcomingItemList.add(new UpcomingEventItemModel(R.drawable.astronaut,"Astronaut 2"));
        upcomingItemList.add(new UpcomingEventItemModel(R.drawable.no_anunciar,"No Anunciar 3"));

        popularItemList.add(new PopularEventItemModel(R.drawable.no_anunciar,"No Anunciar","21 - 27 Aug, 2022"));
        popularItemList.add(new PopularEventItemModel(R.drawable.astronaut,"Astronaut","21 - 27 Aug, 2022"));
        popularItemList.add(new PopularEventItemModel(R.drawable.no_anunciar,"No Anunciar","21 - 27 Aug, 2022"));
        popularItemList.add(new PopularEventItemModel(R.drawable.astronaut,"Astronaut","21 - 27 Aug, 2022"));
        popularItemList.add(new PopularEventItemModel(R.drawable.no_anunciar,"No Anunciar","21 - 27 Aug, 2022"));
        popularItemList.add(new PopularEventItemModel(R.drawable.astronaut,"Astronaut","21 - 27 Aug, 2022"));

        upcomingEventRecyclerListView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        upcomingEventRecyclerListView.setAdapter(new UpcomingEventRecyclerAdapter(getContext(),upcomingItemList));

        popularEventRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        popularEventRecyclerView.setAdapter(new PopularEventRecyclerAdapter(getContext(), popularItemList));
        return view;
    }
}