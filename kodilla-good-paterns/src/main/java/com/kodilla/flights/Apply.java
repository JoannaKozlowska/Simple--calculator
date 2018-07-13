package com.kodilla.flights;

import java.util.List;

public class Apply {
    public static void main(String[] args) {
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        List<Flight> flights1 = flightSearchEngine.findFlightsFrom("Krakow");
        List<Flight> flights2 = flightSearchEngine.findFlightsTo("Warsaw");
        List<Flight> flights3 = flightSearchEngine
                .findFlightsVia("Warsaw", "Krakow", "Berlin");
        System.out.println(flights1);
        System.out.println(flights2);
        System.out.println(flights3);

    }
}