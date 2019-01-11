package com.kodilla.good.patterns.FlightsChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public  class FlightsBookOperations {

    public static FlightBook returnFlightsWithCertainArrival(String arrival, FlightBook input ) {
        FlightBook filteredFlightBook = new FlightBook();

        Map<Integer,FlightDetails> filteredMap = input.getFlights().stream()
                .filter(entry -> entry.getValue().getArrivalTown().equals(arrival))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        filteredFlightBook.getAvailableFlights().putAll(filteredMap);

        return filteredFlightBook;
    }

    public static FlightBook returnFlightsWithCertainDeparture(String departure,FlightBook input) {
        FlightBook filteredFlightBook = new FlightBook();

        Map<Integer,FlightDetails> filteredMap = input.getFlights().stream()
                .filter(entry -> entry.getValue().getDepartutreTown().equals(departure))
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));

        filteredFlightBook.getAvailableFlights().putAll(filteredMap);

        return filteredFlightBook;
    }

    private static Map<Integer,FlightDetails> returnsLaterFlights(FlightDetails firstFlightDetail , FlightBook flightsPossibleToFit) {
        Map<Integer,FlightDetails> result = new HashMap<>();

        result = flightsPossibleToFit.getFlights().stream()
                .filter(entry -> entry.getValue().getArrivalTimeStamp().isAfter(firstFlightDetail.getDepartureTimeStamp()))
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));

        return  result;
    }

    private static List<InterrimFlightEntity> generateInterrimFlightsEntites(Map.Entry<Integer,FlightDetails> flightAToBEntry,Map<Integer,FlightDetails> flightsBToC  ) {
        List<InterrimFlightEntity> result = new ArrayList<>();

        for(Map.Entry<Integer,FlightDetails> fittedFlightEntry : flightsBToC.entrySet()) {

            InterrimFlightEntity newInterrimEntuty = new InterrimFlightEntity();

            newInterrimEntuty.setFlightAToBID(flightAToBEntry.getKey());
            newInterrimEntuty.setFlightBToCID(fittedFlightEntry.getKey());
            newInterrimEntuty.setFlightAToBDetails(flightAToBEntry.getValue());
            newInterrimEntuty.setFlightBToCDetails(fittedFlightEntry.getValue());

            result.add(newInterrimEntuty);

        }


        return  result;
    }


    public static List<InterrimFlightEntity> returnFlightsWithInterrimTown(FlightQueryDetails queryDetails, FlightBook input) {
        List<InterrimFlightEntity> interrinFlights = new ArrayList<>();


        FlightBook flightsByQueriedArrival = returnFlightsWithCertainArrival(queryDetails.getArrival(),input);
        FlightBook flightsByQuerriedArrivalAndInterrim = returnFlightsWithCertainDeparture(queryDetails.getInterrim(),flightsByQueriedArrival);

        FlightBook flightByQuerriedInterim = returnFlightsWithCertainArrival(queryDetails.getInterrim(),input);
        FlightBook flightByQuerriedInterrimAndDeparture = returnFlightsWithCertainDeparture(queryDetails.getDeparture(),flightByQuerriedInterim);

        for(Map.Entry<Integer,FlightDetails> flightEntry : flightsByQuerriedArrivalAndInterrim.getFlights() ) {

            Map<Integer,FlightDetails> flightToFit = returnsLaterFlights(flightEntry.getValue(),flightByQuerriedInterrimAndDeparture);

           List<InterrimFlightEntity> interrimFlightListToAdd = generateInterrimFlightsEntites(flightEntry,flightToFit);
           interrinFlights.addAll(interrimFlightListToAdd);

        }

        return interrinFlights;
    }


}
