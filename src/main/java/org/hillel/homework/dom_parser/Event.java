package org.hillel.homework.dom_parser;

public class Event {

    private String  eventId;

    private String eventDate;

    private EventParameter eventParameter;

    public Event() {
    }

    public Event(String eventId, String eventDate) {
        this.eventId = eventId;
        this.eventDate = eventDate;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public EventParameter getEventParameter() {
        return eventParameter;
    }

    public void setEventParameter(EventParameter eventParameter) {
        this.eventParameter = eventParameter;
    }

    @Override
    public String toString() {
        return "\r\n" + "Event{" +
                "eventId='" + eventId + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", eventParameter=" + eventParameter +
                '}';
    }
}
