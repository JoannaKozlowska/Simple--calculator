package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddNumbersExterminatorTestSuite {
    @Test
    public void testExterminateEmptyList() {
        //given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oe = new OddNumbersExterminator();

        //when
        List<Integer> resultList = oe.exterminate(numbers);

        //then
        Assert.assertEquals(0, resultList.size());
    }

    @Test
    public void testExterminateFullList() {
        //given
        ArrayList<Integer> numbers = new ArrayList<>();
        Random theGenerator = new Random();
        int counter = 0;
        for (int n = 0; n < 20; n++) {
            int number = theGenerator.nextInt(20);
            if (number % 2 == 0) {
                counter++;
            }
            numbers.add(number);
        }
        OddNumbersExterminator oe = new OddNumbersExterminator();

        //when
        List<Integer> resultList = oe.exterminate(numbers);

        //then
        Assert.assertEquals(counter, resultList.size());
        for (int m : resultList) {
            Assert.assertEquals(0, m % 2);
        }
    }
}
