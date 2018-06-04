package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
            int[] numbers = new int[20];
            numbers[0]=2;
            numbers[1]=41;
            numbers[2]=25;
            numbers[3]=14;
            numbers[4]=21;
            numbers[5]=12;
            numbers[6]=13;
            numbers[7]=2;
            numbers[8]=6;
            numbers[9]=7;
            numbers[10]=14;
            numbers[11]=1;
            numbers[12]=4;
            numbers[13]=5;
            numbers[14]=2;
            numbers[15]=6;
            numbers[16]=7;
            numbers[17]=30;
            numbers[18]=9;
            numbers[19]=26;

            //When
            double averageResult = ArrayOperations.getAverage(numbers);
            //Then
            Assert.assertEquals(12.35, averageResult, 0.001);
    }
}
