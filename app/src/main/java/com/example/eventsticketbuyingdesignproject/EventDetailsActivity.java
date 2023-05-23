package com.example.eventsticketbuyingdesignproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EventDetailsActivity extends AppCompatActivity {

    RecyclerView speakerRecyclerViewEventDetails;

    List<SpeakersItemModel> speakerItemList= new ArrayList<>();

    TextView itemTitle, itemTimeDuration;
    ImageView itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        speakerItemList.add(new SpeakersItemModel(R.drawable.person1,"Person_1"));
        speakerItemList.add(new SpeakersItemModel(R.drawable.person2,"Person_2"));
        speakerItemList.add(new SpeakersItemModel(R.drawable.person3,"Person_3"));
        speakerItemList.add(new SpeakersItemModel(R.drawable.person4,"Person_4"));

        System.out.println(speakerItemList);

        Intent intent = getIntent();
        int imgID = intent.getIntExtra("ImageId",R.drawable.astronaut);
        String title=intent.getStringExtra("Title");
        String timeDuration=intent.getStringExtra("TimeDuration");

        speakerRecyclerViewEventDetails = findViewById(R.id.ProductDetailsSpeakersRecyclerView);
        itemTitle = findViewById(R.id.PopularItemTitle);
        itemTimeDuration = findViewById(R.id.EventsDetailsTimeTextView);
        itemImage = findViewById(R.id.PopularItemImageView);

        itemImage.setImageResource(imgID);
        itemTitle.setText(title);
        itemTimeDuration.setText(timeDuration);


        speakerRecyclerViewEventDetails.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        speakerRecyclerViewEventDetails.setAdapter(new SpeakerRecyclerViewAdapter(getApplicationContext(), speakerItemList));

//        speakerRecyclerViewEventDetails.setLayoutManager(new LinearLayoutManager(this));
//        speakerRecyclerViewEventDetails.setAdapter(new PopularEventRecyclerAdapter(getApplicationContext(), popularItemList));
    }
}