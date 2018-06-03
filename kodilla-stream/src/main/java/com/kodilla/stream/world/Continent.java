package com.kodilla.stream.world;

import java.util.List;
import java.util.Objects;

public final class Continent {
    private final String nameOfContinent;
    private final List<Country> countries;

    public Continent(final String nameOfContinent, final List<Country> countries) {
        this.nameOfContinent = nameOfContinent;
        this.countries = countries;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(nameOfContinent, continent.nameOfContinent) &&
                Objects.equals(countries, continent.countries);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nameOfContinent, countries);
    }
}

