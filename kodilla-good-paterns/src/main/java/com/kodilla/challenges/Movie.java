package com.kodilla.challenges;

import java.util.Objects;

public final class Movie {
    private final String translations;
    private final String title;

    public Movie(final String translations, final String title) {
        this.translations = translations;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public String getTranslations() {
        return translations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title);
    }
    @Override
    public int hashCode() {

        return Objects.hash(title);
    }
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                '}';
    }
}