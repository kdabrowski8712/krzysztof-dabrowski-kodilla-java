package com.kodilla.good.patterns.FlightsChallenge;

import org.junit.*;

import java.util.List;

public class FlightOperationsTestSuite {

    @Test
    public void testFindFlightsWithCertainArrival() {

        System.out.println("Arrival Test");
        //Given
        FlightBook testFlightBook = FlightBookBuilder.build();
        System.out.println(testFlightBook);

        //When
        FlightBook filteredFlights = FlightsBookOperations.returnFlightsWithCertainArrival("POZNAN",testFlightBook);

        //Then
        Assert.assertEquals(1, filteredFlights.getAvailableFlights().size());
        Assert.assertEquals("POZNAN",filteredFlights.getAvailableFlights().get(999).getArrivalTown());

        System.out.println();
        System.out.println(filteredFlights);
    }

    @Test
    public void testFindFlightsWithCertainDeparture() {

        System.out.println("Departure test");
        //Given
        FlightBook testFlightBook = FlightBookBuilder.build();
        System.out.println(testFlightBook);

        //When
        FlightBook filteredFlights = FlightsBookOperations.returnFlightsWithCertainDeparture("WARSZAWA",testFlightBook);

        //Then
        Assert.assertEquals(2, filteredFlights.getAvailableFlights().size());
        Assert.assertEquals("WARSZAWA",filteredFlights.getAvailableFlights().get(999).getDepartutreTown());
        Assert.assertEquals("WARSZAWA",filteredFlights.getAvailableFlights().get(123).getDepartutreTown());

        System.out.println();
        System.out.println(filteredFlights);

    }

    @Test

    public void testInterrimFlights() {

        System.out.println("Interrim test");
        //Given
        FlightBook testFlightBook = FlightBookBuilder.build();
        System.out.println(testFlightBook);

        //When
        FlightQueryDetails query = new FlightQueryDetails("WROCLAW","WARSZAWA","GDANSK");
        List<InterrimFlightEntity> intterrimFlighsResult = FlightsBookOperations.returnFlightsWithInterrimTown(query,testFlightBook);

        //Then

        Assert.assertEquals(1,intterrimFlighsResult.size());
        InterrimFlightEntity entity = intterrimFlighsResult.get(0);
        Assert.assertTrue(entity.getFlightAToBDetails().getDepartureTimeStamp().isBefore(entity.getFlightBToCDetails().getArrivalTimeStamp()));
        Assert.assertEquals(query.getArrival(),entity.getFlightAToBDetails().getArrivalTown());
        Assert.assertEquals(query.getDeparture(),entity.getFlightBToCDetails().getDepartutreTown());

        System.out.println(entity.getFlightAToBDetails());
        System.out.println(entity.getFlightBToCDetails());
        System.out.println();


    }
}
