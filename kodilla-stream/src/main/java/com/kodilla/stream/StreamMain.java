package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        Executor executorSaySomething = () -> System.out.println("Test");
        processor.execute(executorSaySomething);
        processor.execute( () -> System.out.println("Test 2") );


        System.out.println("Calculating with lambda");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5,(a,b) -> a+b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating with references");

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Poeam beautfier lambda excercies ");

        PoemBeautifier beautifier= new PoemBeautifier();

        System.out.println(beautifier.beautify("text1",(input -> "ABC" + input + "ABC")));
        System.out.println(beautifier.beautify("text2",(input -> input.toUpperCase())));
        System.out.println(beautifier.beautify("text3",(input -> input + "," + input + "," + input)));
        System.out.println(beautifier.beautify("text2",(input) -> input.substring(0,1).toUpperCase() + " " + input));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
