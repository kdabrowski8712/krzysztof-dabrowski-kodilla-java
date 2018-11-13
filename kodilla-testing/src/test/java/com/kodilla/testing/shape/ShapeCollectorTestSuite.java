package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {

        //Given
        Circle c = new Circle(10.0);
        ShapeCollector myCollector = new ShapeCollector();

        //When
        myCollector.addFigure(c);
        //Them
        Assert.assertEquals(1,myCollector.returnFiguresQuantity());
    }

    @Test
    public void testAddFigureNullObject() {

        //Given
        Square square = null;
        ShapeCollector myCollector = new ShapeCollector();

        //When
        myCollector.addFigure(square);
        //Them
        Assert.assertEquals(0,myCollector.returnFiguresQuantity());
    }

    @Test
    public void testRemoveFigure() {
        //Guven
        Triangle triangle = new Triangle(15.0,7);
        ShapeCollector myCollector = new ShapeCollector();
        //When
        myCollector.addFigure(triangle);
        boolean result = myCollector.removeFigure(triangle);

        //Then

        Assert.assertTrue(result);
        Assert.assertEquals(0,myCollector.returnFiguresQuantity());

    }
    @Test
    public void testRemoveFigureNotExisting() {

        //Given
        Square square = new Square(12.0);
        ShapeCollector myCollector = new ShapeCollector();

        //When
        boolean result = myCollector.removeFigure(square);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigureNormal() {
        //Given
        Square square = new Square(34.0);
        ShapeCollector myCollector = new ShapeCollector();

        //When
        myCollector.addFigure(square);

        Square retrieved = (Square)myCollector.getFigure(0);

        //Then
        Assert.assertEquals(1,myCollector.returnFiguresQuantity());
        Assert.assertEquals(retrieved,square);
    }


    @Test
    public void testGetFigureOutOfRange() {
        //Given
        ShapeCollector myCollector = new ShapeCollector();
        //When
        Shape retrieved = myCollector.getFigure(100);
        //Then
        Assert.assertEquals(null,retrieved);
    }

}
