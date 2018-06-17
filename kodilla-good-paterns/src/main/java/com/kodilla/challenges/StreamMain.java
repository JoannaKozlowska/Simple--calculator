package com.kodilla.challenges;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        MovieStore theMovieStore = new MovieStore();
        String titles = theMovieStore.getMovies().stream()
                .map(Movie::toString).collect(Collectors.joining("!","<<",">>"));
        System.out.println(titles);
    }
}