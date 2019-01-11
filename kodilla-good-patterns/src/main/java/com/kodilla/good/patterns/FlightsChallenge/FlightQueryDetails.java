package com.kodilla.good.patterns.FlightsChallenge;

public class FlightQueryDetails {
    private String departure;
    private String interrim;
    private String arrival;

    public FlightQueryDetails(String departure, String interrim, String arrival) {
        this.departure = departure;
        this.interrim = interrim;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getInterrim() {
        return interrim;
    }

    public String getArrival() {
        return arrival;
    }
}
