package com.kodilla.good.patterns.FlightsChallenge;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDateTime.*;

public class FlightChallengeMain {
    public static void main(String[] args) {
        LocalDateTime test =  LocalDateTime.of(2019, Month.JANUARY,10,23,12);

        FlightBook testFlightBook = FlightBookBuilder.build();


        System.out.println(testFlightBook);


    }
}
