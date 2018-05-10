package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("Test 1 OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println();
        Calculator calculator = new Calculator(10, 7);
        int resultAddition = calculator.addAtoB();
        int resultSubtraction = calculator.subtractAandB();
        if (resultAddition > resultSubtraction) {
            System.out.println("The addition result is: " + resultAddition + ". Test 2 ok.");
        } else {
            System.out.println("Error!");
        }
        System.out.println();
        if (resultSubtraction < resultAddition) {
            System.out.println("The subtraction result is: " + resultSubtraction + ". Test 3 ok.");
        } else {
            System.out.println("Error!");
        }

    }
}
