package com.kodilla.good.patterns.FlightsChallenge;

import java.time.LocalDateTime;
import java.time.Month;

public class FlightBookBuilder {

    public static FlightBook build() {
        FlightBook newFlightBook = new FlightBook();

        Integer flight1ID = 123;
        LocalDateTime flight1Arrival =  LocalDateTime.of(2019, Month.APRIL,12,14,10);
        LocalDateTime flight1Departure =  LocalDateTime.of(2019, Month.APRIL,12,16,10);
        String flight1ArrivalTown = "GDANSK";
        String flight1DepartureTown = "WARSZAWA";
        FlightDetails flight1Details = new FlightDetails(flight1ArrivalTown,flight1Arrival,flight1DepartureTown,flight1Departure);

        newFlightBook.addFlight(flight1ID,flight1Details);


        Integer flight2ID = 456;
        LocalDateTime flight2Arrival =  LocalDateTime.of(2019, Month.APRIL,12,16,20);
        LocalDateTime flight2Departure =  LocalDateTime.of(2019, Month.APRIL,12,19,25);
        String flight2ArrivalTown = "WARSZAWA";
        String flight2DepartureTown = "WROCLAW";
        FlightDetails flight2Details = new FlightDetails(flight2ArrivalTown,flight2Arrival,flight2DepartureTown,flight2Departure);

        newFlightBook.addFlight(flight2ID,flight2Details);


        Integer flight3ID = 789;
        LocalDateTime flight3Arrival =  LocalDateTime.of(2019, Month.APRIL,12,15,20);
        LocalDateTime flight3Departure =  LocalDateTime.of(2019, Month.APRIL,12,18,25);
        String flight3ArrivalTown = "WARSZAWA";
        String flight3DepartureTown = "WROCLAW";
        FlightDetails flight3Details = new FlightDetails(flight3ArrivalTown,flight3Arrival,flight3DepartureTown,flight3Departure);

        newFlightBook.addFlight(flight3ID,flight3Details);


        Integer flight4ID = 777;
        LocalDateTime flight4Arrival =  LocalDateTime.of(2019, Month.JULY,18,13,20);
        LocalDateTime flight4Departure =  LocalDateTime.of(2019, Month.JULY,18,16,25);
        String flight4ArrivalTown = "WROCLAW";
        String flight4DepartureTown = "POZNAN";
        FlightDetails flight4Details = new FlightDetails(flight4ArrivalTown,flight4Arrival,flight4DepartureTown,flight4Departure);

        newFlightBook.addFlight(flight4ID,flight4Details);

        Integer flight5ID = 999;
        LocalDateTime flight5Arrival =  LocalDateTime.of(2019, Month.JUNE,23,22,20);
        LocalDateTime flight5Departure =  LocalDateTime.of(2019, Month.JUNE,23,22,25);
        String flight5ArrivalTown = "POZNAN";
        String flight5DepartureTown = "WARSZAWA";
        FlightDetails flight5Details = new FlightDetails(flight5ArrivalTown,flight5Arrival,flight5DepartureTown,flight5Departure);

        newFlightBook.addFlight(flight5ID,flight5Details);

        return newFlightBook;
    }
}
