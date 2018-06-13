package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFindException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Paris", true);
        flights.put("Krakow", true);
        flights.put("Berlin", false);
        if (!flights.containsKey(flight.getDepartureAirport()) || !flights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFindException("This flight isn't exist");
        }
        if (flights.containsKey(flight.getDepartureAirport()) && flights.containsKey(flight.getArrivalAirport())) {
            boolean journey = flights.get(flight.getArrivalAirport());
            if (journey == true) {
                System.out.println("There is flight from " + flight.getDepartureAirport()
                        + " to " + flight.getArrivalAirport());
            } else {
                System.out.println(" There isn't flight from " + flight.getDepartureAirport()
                        + " to " + flight.getArrivalAirport());
            }
        }
       return flights;
    }
}