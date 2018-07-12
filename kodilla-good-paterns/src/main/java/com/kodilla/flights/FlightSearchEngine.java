package com.kodilla.flights;

import java.util.List;
import java.util.stream.Collectors;


public class FlightSearchEngine {

    public List<Flight> findFlightsFrom (String departureAirport) {
        List<Flight> departure = FlightsDB.getList().stream().filter(flight -> flight.getDepartureAirport()
                .equals(departureAirport)).collect(Collectors.toList());
        return departure;
    }
    public List<Flight> findFlightsTo(String arrivalAirport) {
        List<Flight> arrival = FlightsDB.getList().stream().filter(flight -> flight.getArrivalAirport()
                .equals(arrivalAirport)).collect(Collectors.toList());
        return arrival;
    }
    public List<Flight> findFlightsVia(String departureAirport, String viaAirport, String arrivalAirport){
        List<Flight> flightsVia = FlightsDB.getList().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport)&&flight.getArrivalAirport()
                .equals(viaAirport)).filter(flight -> flight.getDepartureAirport()
                .equals(viaAirport)&& flight.getArrivalAirport().equals(arrivalAirport)).collect(Collectors.toList());
        return flightsVia;
    }
}