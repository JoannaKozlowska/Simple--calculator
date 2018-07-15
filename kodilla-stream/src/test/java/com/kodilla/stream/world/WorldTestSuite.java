package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        //Create countries
        List<Country> asiaCountries = new ArrayList<>();
        Country country1 = new Country("India", new BigDecimal("1400000000"));
        Country country2 = new Country("China", new BigDecimal("1300000000"));
        Country country3 = new Country("USA", new BigDecimal("400000000"));
        Country country4 = new Country("Canada", new BigDecimal("40000000"));
        Country country5 = new Country("Russia", new BigDecimal("160000000"));

        asiaCountries.add(country1);
        asiaCountries.add(country2);

        List<Country> northAmericaCountries = new ArrayList<>();
        northAmericaCountries.add(country3);
        northAmericaCountries.add(country4);

        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(country5);
        //Create continents
        List<Continent> continents = new ArrayList<>();
        Continent continent1 = new Continent("Asia", asiaCountries);
        Continent continent2 = new Continent("North America", northAmericaCountries);
        Continent continent3 = new Continent("Europe", europeCountries);

        continents.add(continent1);
        continents.add(continent2);
        continents.add(continent3);
        World theWorld = new World(continents);

        //When
        BigDecimal totalQuantity = theWorld.getPeopleQuantity();
        //Then
        BigDecimal expectedQuantity = new BigDecimal("3300000000");
        Assert.assertEquals(expectedQuantity, totalQuantity);
    }
}