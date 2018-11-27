package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightProcessor {
    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        boolean result = false;

        Map<String,Boolean> departureAirportFlag = new HashMap<>();

        departureAirportFlag.put("Wroclaw",true);
        departureAirportFlag.put("Zakopane",false);
        departureAirportFlag.put("Modlin",true);

        if(!(departureAirportFlag.containsKey(flight.getDepartureAirport()))) {
            throw new  RouteNotFoundException(flight.getDepartureAirport() + " airport was not found");
        }
        else {
            result = departureAirportFlag.get(flight.getDepartureAirport());
        }

        return result;
    }
}
