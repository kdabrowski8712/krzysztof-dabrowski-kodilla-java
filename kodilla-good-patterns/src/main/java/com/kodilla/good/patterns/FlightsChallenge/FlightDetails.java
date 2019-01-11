package com.kodilla.good.patterns.FlightsChallenge;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class FlightDetails {
    private String arrivalTown;
    private LocalDateTime arrivalTimeStamp;
    private String departutreTown;
    private LocalDateTime departureTimeStamp;

    public FlightDetails(String arrivalTown, LocalDateTime arrivalTimeStamp, String departutreTown, LocalDateTime departureTimeStamp) {
        this.arrivalTown = arrivalTown;
        this.arrivalTimeStamp = arrivalTimeStamp;
        this.departutreTown = departutreTown;
        this.departureTimeStamp = departureTimeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDetails that = (FlightDetails) o;
        return arrivalTown.equals(that.arrivalTown) &&
                arrivalTimeStamp.equals(that.arrivalTimeStamp) &&
                departutreTown.equals(that.departutreTown) &&
                departureTimeStamp.equals(that.departureTimeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivalTown, arrivalTimeStamp, departutreTown, departureTimeStamp);
    }

    public String getArrivalTown() {
        return arrivalTown;
    }

    public LocalDateTime getArrivalTimeStamp() {

        return arrivalTimeStamp;
    }

    public String getDepartutreTown() {
        return departutreTown;
    }

    public LocalDateTime getDepartureTimeStamp() {
        return departureTimeStamp;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        return  arrivalTown + " ( " +
                arrivalTimeStamp.format(formatter) + " ) -->  " +
                departutreTown + " ( " +
                departureTimeStamp.format(formatter) + " ) ";
    }
}
