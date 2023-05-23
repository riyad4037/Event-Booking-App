package com.example.eventsticketbuyingdesignproject;

public class SpeakersItemModel {
    int speakerImageResourceId;
    String speakerNickName;

    public SpeakersItemModel(int speakerImageResourceId, String speakerNickName) {
        this.speakerImageResourceId = speakerImageResourceId;
        this.speakerNickName = speakerNickName;
    }

    public int getSpeakerImageResourceId() {
        return speakerImageResourceId;
    }

    public void setSpeakerImageResourceId(int speakerImageResourceId) {
        this.speakerImageResourceId = speakerImageResourceId;
    }

    public String getSpeakerNickName() {
        return speakerNickName;
    }

    public void setSpeakerNickName(String speakerNickName) {
        this.speakerNickName = speakerNickName;
    }
}
