package com.kodilla.patterns2.decorator.pizza;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    private static int testCounter = 0;
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println();
        System.out.println("Preparing to execute test #" + testCounter);

    }

    @Test
    public void testPizzaFullOrderCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalCheese(theOrder);
        theOrder = new Becon(theOrder);
        theOrder = new DriedTomatoes(theOrder);
        System.out.println("Price for pizza is: " + theOrder.getCost());
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), cost);

    }
    @Test
    public void testPizzaFullOrderDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalCheese(theOrder);
        theOrder = new Becon(theOrder);
        theOrder = new DriedTomatoes(theOrder);
        System.out.println("Pizza composition: " + theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("pizza dough + cheese + tomato sauce + additional cheese + becon + dried tomatoes",
                description);
    }
    @Test
    public void testPizzaOrderWithDoubleBeconCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Becon(theOrder);
        theOrder = new Becon(theOrder);
        System.out.println("Pizza with double becon price is: " + theOrder.getCost());
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(21), cost);
    }
    @Test
    public void testPizzaOrderWithDoubleBeconDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Becon(theOrder);
        theOrder = new Becon(theOrder);
        System.out.println("Pizza composition: " + theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("pizza dough + cheese + tomato sauce + becon + becon", description);
    }
}
