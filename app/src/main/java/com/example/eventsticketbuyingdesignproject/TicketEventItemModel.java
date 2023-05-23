package com.example.eventsticketbuyingdesignproject;

public class TicketEventItemModel {

    int ticketEventItemImageId;
    String ticketEventTitle, ticketEventItemTimeDuration;

    public TicketEventItemModel(int ticketEventItemImageId, String ticketEventTitle, String ticketEventItemTimeDuration) {
        this.ticketEventItemImageId = ticketEventItemImageId;
        this.ticketEventTitle = ticketEventTitle;
        this.ticketEventItemTimeDuration = ticketEventItemTimeDuration;
    }

    public int getTicketEventItemImageId() {
        return ticketEventItemImageId;
    }

    public void setTicketEventItemImageId(int ticketEventItemImageId) {
        this.ticketEventItemImageId = ticketEventItemImageId;
    }

    public String getTicketEventTitle() {
        return ticketEventTitle;
    }

    public void setTicketEventTitle(String ticketEventTitle) {
        this.ticketEventTitle = ticketEventTitle;
    }

    public String getTicketEventItemTimeDuration() {
        return ticketEventItemTimeDuration;
    }

    public void setTicketEventItemTimeDuration(String ticketEventItemTimeDuration) {
        this.ticketEventItemTimeDuration = ticketEventItemTimeDuration;
    }
}
