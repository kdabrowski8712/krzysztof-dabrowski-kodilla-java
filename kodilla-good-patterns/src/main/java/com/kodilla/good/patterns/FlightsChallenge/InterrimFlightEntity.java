package com.kodilla.good.patterns.FlightsChallenge;

public class InterrimFlightEntity {
    private Integer flightAToBID;
    private Integer flightBToCID;
    private FlightDetails flightAToBDetails;
    private FlightDetails flightBToCDetails;

    public Integer getFlightAToBID() {
        return flightAToBID;
    }

    public void setFlightAToBID(Integer flightAToBID) {
        this.flightAToBID = flightAToBID;
    }

    public Integer getFlightBToCID() {
        return flightBToCID;
    }

    public void setFlightBToCID(Integer flightBToCID) {
        this.flightBToCID = flightBToCID;
    }

    public FlightDetails getFlightAToBDetails() {
        return flightAToBDetails;
    }

    public void setFlightAToBDetails(FlightDetails flightAToBDetails) {
        this.flightAToBDetails = flightAToBDetails;
    }

    public FlightDetails getFlightBToCDetails() {
        return flightBToCDetails;
    }

    public void setFlightBToCDetails(FlightDetails flightBToCDetails) {
        this.flightBToCDetails = flightBToCDetails;
    }
}
