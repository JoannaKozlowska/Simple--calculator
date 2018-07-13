package com.kodilla.flights;

public class Apply {
    public static void main(String[] args) {
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        flightSearchEngine.findFlightsFrom("Krakow");
        flightSearchEngine.findFlightsTo("Warsaw");
        flightSearchEngine.findFlightsVia("Warsaw", "Krakow", "Berlin");
    }
}