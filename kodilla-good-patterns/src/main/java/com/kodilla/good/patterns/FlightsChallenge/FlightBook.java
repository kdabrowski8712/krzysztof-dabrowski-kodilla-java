package com.kodilla.good.patterns.FlightsChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FlightBook {
    private Map<Integer,FlightDetails> availableFlights;

    public FlightBook() {
        availableFlights = new HashMap<>();
    }

    public void addFlight(Integer flightID , FlightDetails flightDetails ) {
        availableFlights.put(flightID,flightDetails);
    }

    public void removeFlightByID(Integer flightID) {
        availableFlights.remove(flightID);
    }

    public Set<Map.Entry<Integer,FlightDetails>> getFlights() {
        return availableFlights.entrySet();
    }

    public Map<Integer, FlightDetails> getAvailableFlights() {
        return availableFlights;
    }

    @Override
    public String toString() {

        String result = "";

        for(Map.Entry<Integer,FlightDetails> flight : availableFlights.entrySet()) {

            result += flight.getKey() + " : " + flight.getValue() + "\n";
        }

        return result;
    }
}
