package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int m : numbers) {
            if (m % 2 == 0) {
                evenNumbers.add(m);
            }
        }
        return evenNumbers;
    }

}
