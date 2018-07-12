package com.kodilla.flights;


public class Apply {
    public static void main(String[] args) {
        FlightsDB flightsDB = new FlightsDB();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine("Warsaw",
                "Berlin", "Krakow");

        if (flightSearchEngine.getInterchangeAirport()!=null) {
            flightsDB.getList().stream().filter(flight -> flight.getDepartureAirport()
                    .equals(flightSearchEngine.getAirportOfDeparture()) &&
                    flight.getArrivalAirport().equals(flightSearchEngine.getInterchangeAirport()) &&
                    flight.getDepartureAirport().equals(flightSearchEngine.getInterchangeAirport())&&
                    flight.getArrivalAirport().equals(flightSearchEngine.getAirportOfArrival()))
                    .forEach(System.out::println);
        } else {
            flightsDB.getList().stream().filter(flight -> flight.getDepartureAirport()
                    .equals(flightSearchEngine.getAirportOfDeparture()) && flight.getArrivalAirport()
                    .equals(flightSearchEngine.getAirportOfArrival())).forEach(System.out::println);
        }
    }
}