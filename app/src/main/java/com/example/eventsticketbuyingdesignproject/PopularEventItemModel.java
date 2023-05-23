package com.example.eventsticketbuyingdesignproject;

public class PopularEventItemModel {
    int popularEventItemImageId;
    String popularEventTitle, popularEventItemTimeDuration;

    public PopularEventItemModel(int popularEventItemImageId, String popularEventTitle, String popularEventItemTimeDuration) {
        this.popularEventItemImageId = popularEventItemImageId;
        this.popularEventTitle = popularEventTitle;
        this.popularEventItemTimeDuration = popularEventItemTimeDuration;

    }

    public int getPopularEventItemImageId() {
        return popularEventItemImageId;
    }

    public void setPopularEventItemImageId(int popularEventItemImageId) {
        this.popularEventItemImageId = popularEventItemImageId;
    }

    public String getPopularEventTitle() {
        return popularEventTitle;
    }

    public void setPopularEventTitle(String popularEventTitle) {
        this.popularEventTitle = popularEventTitle;
    }

    public String getPopularEventItemTimeDuration() {
        return popularEventItemTimeDuration;
    }

    public void setPopularEventItemTimeDuration(String popularEventItemTimeDuration) {
        this.popularEventItemTimeDuration = popularEventItemTimeDuration;
    }
}
