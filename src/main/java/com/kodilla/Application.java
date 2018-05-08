package com.kodilla;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,2);
        int resultAddition = calculator.AddAtoB();
        int resultSubtraction = calculator.SubstractAfromB();
        System.out.println("The addition result is: " + resultAddition);
        System.out.println("The substraction result is: " + resultSubtraction);
    }
}
