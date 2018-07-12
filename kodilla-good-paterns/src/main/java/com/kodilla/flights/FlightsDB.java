package com.kodilla.flights;

import java.util.ArrayList;
import java.util.List;

public final class FlightsDB {
    public static final List<Flight> flights = new ArrayList<>();
    public FlightsDB(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw","Krakow"));
        flights.add(new Flight("Krakow", "Berlin"));
        flights.add(new Flight("Krakow", "New York"));
        flights.add(new Flight("Krakow", "Katowice"));
        flights.add(new Flight("Katowice", "Berlin"));
        flights.add(new Flight("Warsaw", "Berlin"));
    }

    public static List<Flight> getList() {
        return new ArrayList<>(flights);
    }
}