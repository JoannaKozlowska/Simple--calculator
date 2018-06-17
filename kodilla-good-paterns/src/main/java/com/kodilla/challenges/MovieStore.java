package com.kodilla.challenges;

import java.util.ArrayList;
import java.util.List;


public final class MovieStore {

    Movie movie1 = new Movie("IM","Żelazny Człowiek");
    Movie movie2 = new Movie("IM","Iron Man");
    Movie movie3 = new Movie("AV","Mściciele");
    Movie movie4 = new Movie("AV","Avengers");
    Movie movie5 = new Movie("FL","Błyskawica");
    Movie movie6 = new Movie("FL", "Flash");

    public final List<Movie> getMovies() {

        List<Movie> books = new ArrayList<>();
        books.add(movie1);
        books.add(movie2);
        books.add(movie3);
        books.add(movie4);
        books.add(movie5);
        books.add(movie6);
        return books;
    }
}