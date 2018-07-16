package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    public void testCalculations(){
        //When
        double sum = calculator.add(5,5);
        double subtraction = calculator.sub(10.2, 4.2);
        double multiplication = calculator.mul(4, 3);
        double division = calculator.div(25, 5);
        //Then
        Assert.assertEquals(10, sum, 0.001);
        Assert.assertEquals(6, subtraction, 0.001);
        Assert.assertEquals(12, multiplication, 0.001);
        Assert.assertEquals(5, division, 0.001);
    }
}
