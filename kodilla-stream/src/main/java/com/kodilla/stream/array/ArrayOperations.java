package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        double result = 0.0;

        if(numbers.length>0) {

            IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .forEach(x -> System.out.print(x + " "));

            result = IntStream.range(0,numbers.length)
                    .map(n -> numbers[n])
                    .average().getAsDouble();

        }

        return result;
    }
}
