package com.kodilla.challenges;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String title = movieStore.getMovies().entrySet().stream()
                .flatMap(s->s.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(title);
    }
}