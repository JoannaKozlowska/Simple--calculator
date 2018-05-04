package com.kodilla;

 class Calculator {
    private int aNumber;
    private int bNumber;
    public Calculator (int aNumber,int bNumber) {
        this.aNumber = aNumber;
        this.bNumber = bNumber;
    }
    public int AddAtoB() {
        return aNumber + bNumber;
    }
    public int SubstractAfromB() {
        return aNumber - bNumber;
    }
    public int getAnumber() {
        return aNumber;
    }

    public int getBnumber(){ return bNumber; }
    public static void main(String args[]){
        Calculator calculator = new Calculator (10,2);
        int resultAddition = calculator.AddAtoB();
        int resultSubtraction = calculator.SubstractAfromB();
        System.out.println("The addition result is: " + resultAddition);
        System.out.println("The substraction result is: " + resultSubtraction);
    }
}
