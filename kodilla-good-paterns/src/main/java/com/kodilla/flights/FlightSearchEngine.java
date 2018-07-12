package com.kodilla.flights;

import java.util.Objects;

public class FlightSearchEngine {
    private String airportOfDeparture;
    private String airportOfArrival;
    private String interchangeAirport;

    public FlightSearchEngine(String airportOfDeparture, String airportOfArrival, String interchangeAirport) {
        this.airportOfDeparture = airportOfDeparture;
        this.airportOfArrival = airportOfArrival;
        this.interchangeAirport = interchangeAirport;
    }

    public String getAirportOfDeparture() {
        return airportOfDeparture;
    }

    public String getAirportOfArrival() {
        return airportOfArrival;
    }

    public String getInterchangeAirport() {
        return interchangeAirport;
    }

    @Override
    public String toString() {
        return "FlightSearchEngine{" +
                "airportOfDeparture='" + airportOfDeparture + '\'' +
                ", airportOfArrival='" + airportOfArrival + '\'' +
                ", interchangeAirport='" + interchangeAirport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightSearchEngine that = (FlightSearchEngine) o;
        return Objects.equals(airportOfDeparture, that.airportOfDeparture) &&
                Objects.equals(airportOfArrival, that.airportOfArrival) &&
                Objects.equals(interchangeAirport, that.interchangeAirport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(airportOfDeparture, airportOfArrival, interchangeAirport);
    }
}