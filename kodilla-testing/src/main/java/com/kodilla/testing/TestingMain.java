package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import java.util.ArrayList;
import java.util.List;



public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        /*System.out.println("Klasa Calculator - test jednostkowy");

        Calculator testCalculator = new Calculator();

        int a = 5;
        int b = 10;

        if(testCalculator.add(a,b)==15) {
            System.out.println("Add method with parameters " + a + " and " + b + " returned proper value  - TEST OK" );
        }
        else {
            System.out.println("Add method with parameters " + a + " and " + b + " returned wrong value - TEST FAILED" );
        }

        if(testCalculator.subtract(a,b)==5) {
            System.out.println("Subtract method with parameters " + a + " and " + b + " returned proper value - TEST OK" );
        }
        else {
            System.out.println("Subtract method with parameters " + a + " and " + b + "returned wrong value - TEST FAILED" );
        }*/

        OddNumbersExterminator test = new OddNumbersExterminator();

        List<Integer> input = new ArrayList<Integer>();

        List<Integer> output = new ArrayList<Integer>();

        input.add(12);
        input.add(2);

        output.add(12);
        output.add(122);

        System.out.println(input.equals(output));

        ShapeCollector testCollector = new ShapeCollector();
        Circle testCircle = new Circle(12.0);
        Square testSquare = new Square(10.0);
        testCollector.addFigure(testCircle);
        testCollector.addFigure(testSquare);
        testCollector.showFigures();

    }
}
