package com.kodilla.testing.collection;

import org.junit.*;


import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    private OddNumbersExterminator testObjext;

    public CollectionTestSuite() {
        this.testObjext = new OddNumbersExterminator();
    }

    @Before
    public void before() {
        System.out.println(" Odd Number Class Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Odd Number Class Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Odd Number Class Test Suite: Beginning ");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Odd Number Class Test Suite: End ");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Testing empty list case");
        //Given
        OddNumbersExterminator testedObject = new OddNumbersExterminator();

        List<Integer> input = new ArrayList<Integer>();

        //When
        List<Integer> methodResult = testedObject.exterminate(input);

        List<Integer> expectedResult = new ArrayList<Integer>();
        //Then
        Assert.assertEquals(expectedResult, methodResult);


    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        System.out.println("Testing non-empty list case ( odd and even numbers )");

        //Given
        OddNumbersExterminator testedObject = new OddNumbersExterminator();

        List<Integer> input = new ArrayList<Integer>();
        input.add(12);
        input.add(33);
        input.add(15);
        input.add(20);
        input.add(2);

        //When
        List<Integer> methodResult = testedObject.exterminate(input);

        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(12);
        expectedResult.add(20);
        expectedResult.add(2);
        //Then
        Assert.assertEquals(expectedResult, methodResult);

    }

}
