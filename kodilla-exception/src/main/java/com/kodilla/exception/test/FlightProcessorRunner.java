package com.kodilla.exception.test;

public class FlightProcessorRunner {

    public static void main(String[] args) {

        FlightProcessor proceesor = new FlightProcessor();
        Flight testFlight = new Flight("Szczecin","Wroclaw");

        try {
            proceesor.findFilght(testFlight);
        } catch( RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
