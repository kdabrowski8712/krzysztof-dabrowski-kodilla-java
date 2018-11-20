package com.kodilla.stream.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Before
    public void infoBefore() {
        System.out.println();
        System.out.println("Test launch:");
    }

    @After
    public void infoAfter() {
        System.out.println("Test finished");
    }

    @Test
    public void testGetAverageFilledTable() {

        //Given
        int [] numbers = { 20,10,6,6};

        //When
        double result = ArrayOperations.getAverage(numbers);
        double expectedResult = 10.5;

        System.out.println();
        System.out.println("Calculated expected result: " + result);

        //Then
        Assert.assertEquals(expectedResult,result,0.001);
    }

    @Test
    public void testGetAverageEmptyTable() {

        //Given
        int [] numbers = {};

        //When
        double result = ArrayOperations.getAverage(numbers);
        double expectedResult = 0.0;

        System.out.println();
        System.out.println("Calculated expected result: " + result);

        //Then
        Assert.assertEquals(expectedResult,result,0.001);
    }
}
