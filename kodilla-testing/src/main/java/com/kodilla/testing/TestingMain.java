package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        System.out.println("Klasa Calculator - test jednostkowy");

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
        }
    }
}
