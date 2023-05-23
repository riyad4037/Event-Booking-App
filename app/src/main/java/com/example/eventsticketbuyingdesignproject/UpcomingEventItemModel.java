package com.example.eventsticketbuyingdesignproject;

import android.widget.ImageView;

public class UpcomingEventItemModel {
    int upcomingEventImageId;
    String title;

    public UpcomingEventItemModel(int upcomingEventImageId, String title) {
        this.upcomingEventImageId = upcomingEventImageId;
        this.title = title;
    }

    public int getUpcomingEventImageId() {
        return upcomingEventImageId;
    }

    public void setUpcomingEventImageId(int upcomingEventImageId) {
        this.upcomingEventImageId = upcomingEventImageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
