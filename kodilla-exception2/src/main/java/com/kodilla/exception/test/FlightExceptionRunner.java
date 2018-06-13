package com.kodilla.exception.test;

public class FlightExceptionRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Berlin");
        Flight flight2 = new Flight("Paris", "Warsaw");
        Flight flight3 = new Flight("Krakow", "Warsaw");
        Flight flight4 = new Flight("New York", "London");
        Flight flight5 = new Flight("Warsaw", "Krakow");
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        try {
            flightSearchEngine.findFlight(flight4);
        } catch (RouteNotFindException e){
            System.out.println("This flight isn't possible. Error: " + e);
        }
    }
}
